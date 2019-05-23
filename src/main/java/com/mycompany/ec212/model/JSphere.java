package com.mycompany.ec212.model;

import com.badlogic.gdx.math.Vector3;

public class JSphere extends JShape {
	
	private Vector3 position;
	private float radius;
	
	public JSphere() {
		
	}
	
	public JSphere(Vector3 position, float radius) {
		super();
		this.position = position;
		this.radius = radius;
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
