package br.com.inatel.ec212.model;

import com.badlogic.gdx.math.Vector3;

public class JBSDF {
	
        public enum JBSDF_Type{
            
            Diffuse, 
            Light,
            None
        }
    
	private JBSDF_Type type;
	private Vector3 color;
	
	public JBSDF() {
		
	}

	public JBSDF(JBSDF_Type type, Vector3 color) {
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

	public Vector3 getColor() {
		return color;
	}

	public void setColor(Vector3 color) {
		this.color = color;
	}	

}
