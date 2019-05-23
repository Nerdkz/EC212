package com.mycompany.ec212.model;

public class JBSDF {
	
	private JBSDF_Type type;
	private JColor_3 color;
	
	public JBSDF() {
		
	}

	public JBSDF(JBSDF_Type type, JColor_3 color) {
		super();
		this.type = type;
		this.color = color;
	}

	public JBSDF_Type getType() {
		return type;
	}

	public void setType(JBSDF_Type type) {
		this.type = type;
	}

	public JColor_3 getColor() {
		return color;
	}

	public void setColor(JColor_3 color) {
		this.color = color;
	}	

}
