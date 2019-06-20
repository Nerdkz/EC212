package br.com.inatel.ec212.model;

import com.badlogic.gdx.math.Vector3;

public class JRay {

    public Vector3 origin;
    public Vector3 direction;

    public JRay() {

    }

    public JRay(Vector3 origin, Vector3 direction) {
        super();
        this.origin = origin;
        this.direction = direction;
    }
    

    /* Ver a operação a ser feita com esse Vector3 pro retorno!!*/
    public Vector3 point(float distance) {
        return origin.cpy().add(direction.cpy().scl(distance));
    }
}
