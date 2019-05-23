package com.mycompany.ec212.model;

public class JIntersection {

    private boolean hit;
    private float distance;
    private int index;

    public JIntersection() {

    }

    public JIntersection(boolean hit, float distance, int index) {
        super();
        this.hit = hit;
        this.distance = distance;
        this.index = index;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
