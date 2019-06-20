package br.com.inatel.ec212.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class JShaderGlobal {

    private Vector3 point;
    private Vector3 normal;
    private Vector2 uv;
    private Vector3 tangentU;
    private Vector3 tangentV;
    private Vector3 viewDirection;
    private Vector3 lightDirection;
    private Vector3 lightPoint;
    private Vector3 lightNormal;

    public JShaderGlobal() {

    }

    public JShaderGlobal(Vector3 point, Vector3 normal, Vector2 uv, Vector3 tangentU, Vector3 tangentV,
            Vector3 viewDirection, Vector3 lightDirection, Vector3 lightPoint, Vector3 lightNormal) {
        super();
        this.point = point;
        this.normal = normal;
        this.uv = uv;
        this.tangentU = tangentU;
        this.tangentV = tangentV;
        this.viewDirection = viewDirection;
        this.lightDirection = lightDirection;
        this.lightPoint = lightPoint;
        this.lightNormal = lightNormal;
    }

    public Vector3 getPoint() {
        return point;
    }

    public void setPoint(Vector3 point) {
        this.point = point;
    }

    public Vector3 getNormal() {
        return normal;
    }

    public void setNormal(Vector3 normal) {
        this.normal = normal;
    }

    public Vector2 getUv() {
        return uv;
    }

    public void setUv(Vector2 uv) {
        this.uv = uv;
    }

    public Vector3 getTangentU() {
        return tangentU;
    }

    public void setTangentU(Vector3 tangentU) {
        this.tangentU = tangentU;
    }

    public Vector3 getTangentV() {
        return tangentV;
    }

    public void setTangentV(Vector3 tangentV) {
        this.tangentV = tangentV;
    }

    public Vector3 getViewDirection() {
        return viewDirection;
    }

    public void setViewDirection(Vector3 viewDirection) {
        this.viewDirection = viewDirection;
    }

    public Vector3 getLightDirection() {
        return lightDirection;
    }

    public void setLightDirection(Vector3 lightDirection) {
        this.lightDirection = lightDirection;
    }

    public Vector3 getLightPoint() {
        return lightPoint;
    }

    public void setLightPoint(Vector3 lightPoint) {
        this.lightPoint = lightPoint;
    }

    public Vector3 getLightNormal() {
        return lightNormal;
    }

    public void setLightNormal(Vector3 lightNormal) {
        this.lightNormal = lightNormal;
    }
    
    
    
}
