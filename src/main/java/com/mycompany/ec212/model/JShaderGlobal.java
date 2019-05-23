package com.mycompany.ec212.model;

import com.badlogic.gdx.math.Vector;

public class JShaderGlobal {
	
	private Vector point;
	private Vector normal;
	private Vector uv;
	private Vector tangentU;
	private Vector tangentV;
	private Vector viewDirection;
	private Vector lightDirection;
	private Vector lightPoint;
	private Vector lightNormal;
	
	
	public JShaderGlobal() {
		
	}
	
	public JShaderGlobal(Vector point, Vector normal, Vector uv, Vector tangentU, Vector tangentV,
			Vector viewDirection, Vector lightDirection, Vector lightPoint, Vector lightNormal) {
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

	public Vector getPoint() {
		return point;
	}
	public void setPoint(Vector point) {
		this.point = point;
	}
	public Vector getNormal() {
		return normal;
	}
	public void setNormal(Vector normal) {
		this.normal = normal;
	}
	public Vector getUv() {
		return uv;
	}
	public void setUv(Vector uv) {
		this.uv = uv;
	}
	public Vector getTangentU() {
		return tangentU;
	}
	public void setTangentU(Vector tangentU) {
		this.tangentU = tangentU;
	}
	public Vector getTangentV() {
		return tangentV;
	}
	public void setTangentV(Vector tangentV) {
		this.tangentV = tangentV;
	}
	public Vector getViewDirection() {
		return viewDirection;
	}
	public void setViewDirection(Vector viewDirection) {
		this.viewDirection = viewDirection;
	}
	public Vector getLightDirection() {
		return lightDirection;
	}
	public void setLightDirection(Vector lightDirection) {
		this.lightDirection = lightDirection;
	}
	public Vector getLightPoint() {
		return lightPoint;
	}
	public void setLightPoint(Vector lightPoint) {
		this.lightPoint = lightPoint;
	}
	public Vector getLightNormal() {
		return lightNormal;
	}
	public void setLightNormal(Vector lightNormal) {
		this.lightNormal = lightNormal;
	}
	
	
	

	
	

}
