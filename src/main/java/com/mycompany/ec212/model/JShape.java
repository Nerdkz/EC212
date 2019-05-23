package com.mycompany.ec212.model;



public class JShape {
	
	private JBSDF bsdf;
	
	public JShape() {
		
	}

	public JShape(JBSDF bsdf) {
		super();
		this.bsdf = bsdf;
	}

	public static JIntersection intersects(JRay ray) {
		return null;
	}
	
	public static JShaderGlobal calculateShaderGlobals(JRay ray, JIntersection intersection) {
		return null;
	}
	
	public static float surfaceArea() {
		return 0;
	}
	
	public JBSDF getBsdf() {
		return bsdf;
	}

	public void setBsdf(JBSDF bsdf) {
		this.bsdf = bsdf;
	}
	
	

}
