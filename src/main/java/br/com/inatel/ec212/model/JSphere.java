package br.com.inatel.ec212.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class JSphere extends JShape {

    public Vector3 position;
    public float radius;

    public JSphere() {

    }

    public JSphere(Vector3 position, float radius, JBSDF bsdf) {

        this.position = position;
        this.radius = radius;
        this.bsdf = bsdf;

    }

    @Override
    public JIntersection intersects(JRay ray) {
        Vector3 l = position.cpy().sub(ray.origin);
        float t = l.dot(ray.direction);

        if (t < 0) {
            return new JIntersection();
        }

        float d2 = l.dot(l) - t * t;
        float r2 = radius * radius;

        if (d2 > r2) {
            return new JIntersection();
        }

        float dt = (float) Math.sqrt(r2 - d2);

        float t0 = t - dt;
        float t1 = t + dt;

        if (t0 < 0) {

            t0 = t1;

            if (t0 < 0) {
                return new JIntersection();
            }
        }

        return new JIntersection(true, dt, -1);
    }

    @Override
    public JShaderGlobal calculateShaderGlobals(JRay ray, JIntersection intersection) {

        JShaderGlobal shaderGlobals = new JShaderGlobal();
        shaderGlobals.setPoint(ray.point(intersection.distance));
        shaderGlobals.setNormal(shaderGlobals.getPoint().cpy().sub(position).nor());

        float theta = (float) Math.atan2(shaderGlobals.getNormal().x, shaderGlobals.getNormal().z);
        float phi = (float) Math.acos(shaderGlobals.getNormal().y);

        Vector2 uv = new Vector2((float) (theta / (Math.PI * 2.0)), (float) (phi / Math.PI));

        Vector3 tangentU = new Vector3((float) Math.cos(theta), 0, (float) (-Math.sin(theta)));
        Vector3 tangentV = new Vector3((float) (Math.sin(theta) * Math.cos(phi)),
                (float) (-Math.sin(phi)),
                (float) (Math.cos(theta) * Math.cos(phi)));

        shaderGlobals.setUv(uv);
        shaderGlobals.setTangentU(tangentU);
        shaderGlobals.setTangentV(tangentV);

        shaderGlobals.setViewDirection(ray.direction.cpy().scl(-1));

        return shaderGlobals;
    }

    @Override
    public float surfaceArea() {

        return (float) (4.0 * Math.PI * radius * radius);
    }
    
    @Override
    public Vector3 lightPosition() {
        return position;
    }
    
    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 position) {
        this.position = position;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
