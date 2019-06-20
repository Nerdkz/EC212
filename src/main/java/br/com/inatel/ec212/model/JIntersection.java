package br.com.inatel.ec212.model;

public class JIntersection {

    public boolean hit;
    public float distance;
    public int index;

    public JIntersection() {
        this.hit = false;
        this.distance = Float.MAX_VALUE;
        this.index = -1;
    }

    public JIntersection(boolean hit, float distance, int index) {
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
