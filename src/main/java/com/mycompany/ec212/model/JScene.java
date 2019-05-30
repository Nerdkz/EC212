package com.mycompany.ec212.model;

import java.util.ArrayList;

public class JScene {

    private ArrayList<JShape> shapes;

    public JScene() {

    }

    public JScene(ArrayList<JShape> shapes) {
        super();
        this.shapes = shapes;
    }
    
    /*Ver a implementação do método intersects!!!*/
    
    public JIntersection intersects(JRay ray) {
        return null;
    }

}
