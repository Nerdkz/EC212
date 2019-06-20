package br.com.inatel.ec212.model;

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
        JIntersection intersection = new JIntersection();
        
        for (int i = 0; i < shapes.size(); i++) {
            JIntersection temp = shapes.get(i).intersects(ray);
            
            if (temp.hit && temp.distance < intersection.distance) {
                intersection.hit = temp.hit;
                intersection.distance = temp.distance;
                intersection.index = i;
            }
        }
        
        return intersection;
    }

}
