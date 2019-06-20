package br.com.inatel.ec212.model;

import com.badlogic.gdx.math.Vector3;

public abstract class JShape {

    protected JBSDF bsdf;

    public JShape() {

    }

    public JShape(JBSDF bsdf) {
        super();
        this.bsdf = bsdf;
    }

    public abstract JIntersection intersects(JRay ray);

    public abstract JShaderGlobal calculateShaderGlobals(JRay ray, JIntersection intersection);

    public abstract float surfaceArea();
    public abstract Vector3 lightPosition();

    public JBSDF getBsdf() {
        return bsdf;
    }

    public void setBsdf(JBSDF bsdf) {
        this.bsdf = bsdf;
    }

}
