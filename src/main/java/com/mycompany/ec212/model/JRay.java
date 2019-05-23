package com.mycompany.ec212.model;

import com.badlogic.gdx.math.Vector3;

public class JRay {
	private Vector3 origin;
	private Vector3 direction;
	
	public JRay() {
		
	}
	
	public JRay(Vector3 origin, Vector3 direction) {
		super();
		this.origin = origin;
		this.direction = direction;
	}
	
	public Vector3 point(float distance) {
		return null;
	}
 }
