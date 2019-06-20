/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inatel.ec212.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class JRenderer {
    
    private JRenderOptions options;
    private JCamera camera;
    private JScene cena;
    
    
    public static float gaussian1D(float x, float width){
        float r = (float)(width * 0.5);
        return Math.max(0, (float)(Math.exp(- x * x) - Math.exp(- r * r )));
    }
    
    public static float gaussian2D(Vector2 v, float width){
        return gaussian1D(v.x, width) * gaussian1D(v.y, width);
    }
    
    public static Vector3 clamp(Vector3 v, float min, float max){
        return new Vector3(Math.max(Math.min(v.x, max), min),
                           Math.max(Math.min(v.y, max), min),
                           Math.max(Math.min(v.z, max), min));
    }
    
    public static Vector3 exposure(Vector3 v, float value){
        return v.cpy().scl((float)Math.pow(2, value));
    }
    
    public static Vector3 gamma(Vector3 v, float value){
        
        float inverseGamma = 1 / value;
        
        return new Vector3( (float)Math.pow(v.x, inverseGamma),
                            (float)Math.pow(v.y, inverseGamma),
                            (float)Math.pow(v.z, inverseGamma));
    }
    
    public static ArrayList<Vector2> stratifiedSamples(int samples){
        
        ArrayList<Vector2> points = new ArrayList();
        
        int size = (int)Math.sqrt(samples);
        float inverseSize = (float) (1.0 / size);
        
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                Vector2 offset = new Vector2(i, j);
                Vector2 random = new Vector2((float)Math.random(), (float)Math.random());
                
                points.add(offset.add(random).scl(inverseSize));
            }
        }
        
        return points;
    }
    
    
    
    
    public static Vector3 toByte(Vector3 v, float depth){
        return v.cpy().scl(depth);
    }
    
    
    
    public JRenderer() {
    }

    public JRenderer(JRenderOptions options, JCamera camera, JScene cena) {
        this.options = options;
        this.camera = camera;
        this.cena = cena;
    }
    
    public BufferedImage render(){
        
        BufferedImage bufferedImage = new BufferedImage(options.getWidth(), 
                                                        options.getHeight(), 
                                                        BufferedImage.TYPE_INT_RGB);
        
        for(int i = 0; i < options.getWidth(); i++){
            for (int j = 0; j < options.getHeight(); j++) {
                
                ArrayList<Vector2> samples = stratifiedSamples(options.getCameraSamples());
                Vector3 color = Vector3.Zero;
                float totalWeight = 0;
                
                for (int k = 0; k < options.getCameraSamples(); k++) {
                    
                    JRay ray = camera.generateRay(i, j, samples.get(k).sub((float)0.5, (float)0.5)
                                                                      .scl(options.getFilterWidth()));
                    float w = gaussian2D(samples.get(k), options.getFilterWidth());
                    
                    Vector3 c = trace(ray).scl(w);
                    color = color.cpy().add(c);
                    totalWeight += w;
                }
                
                color.scl( 1 / totalWeight );
                color = exposure(color, options.getExposure());
                color = gamma(color, options.getGamma());
                color = clamp(color, 0, 1);
                color = toByte(color, 255);
                
                bufferedImage.setRGB(i, j, new Color((int)color.x, (int)color.y, (int)color.z).getRGB());
            }
        }
        
        return bufferedImage;
    }
    
    public Vector3 trace(JRay ray){
        
        JIntersection intersection = cena.intersects(ray);
        if(intersection.hit){
            return new Vector3(1, 1, 1);
        }
        return Vector3.Zero;
    }
    

    public JRenderOptions getOptions() {
        return options;
    }

    public void setOptions(JRenderOptions options) {
        this.options = options;
    }

    public JCamera getCamera() {
        return camera;
    }

    public void setCamera(JCamera camera) {
        this.camera = camera;
    }

    public JScene getCena() {
        return cena;
    }

    public void setCena(JScene cena) {
        this.cena = cena;
    }
    
    
}
