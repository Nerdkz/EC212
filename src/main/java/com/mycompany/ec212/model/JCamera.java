/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ec212.model;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import org.lwjgl.util.vector.Matrix;

/**
 *
 * @author aluno
 */
public class JCamera {
    
    
    public float FOV;
    public JFilm film;
    public Matrix4 WorldMatrix;
    
    public JCamera(float FOV, JFilm film, Matrix4 WorldMatrix){
        this.FOV = FOV;
        this.film = film;
        this.WorldMatrix = WorldMatrix;
    }
    
    public JCamera(){
        
    }
    
    public void lookAt(Vector3 position, Vector3 target, Vector3 up){
        
        Vector3 w = new Vector3(position).sub(target).nor();
        Vector3 u = up.crs(w).nor();
        Vector3 v = w.crs(u);
        
        float values[] = new  float[]{u.x, v.x, w.x, position.x,
                u.y, v.y, w.y, position.y,
                u.z, v.z, w.z, position.z,                                       
                0f, 0f ,0f, 1f};
        
        WorldMatrix = new Matrix4(values);
        
    }
    
    public JRay generateRay(float x, float y, Vector3 sample) {
        float xndc = (float)(x + 0.5) / film.width;
        float yndc = (float) (y+0.5) / film.height;
        float D = (float) Math.tan(FOV/2);
        float xscreen = (float) (2*xndc - 1) * film.aspectRatio() * D;
        float yscreen = (float) (1 - 2*yndc) * D;
        
        Vector3 pixel = new Vector3(xscreen, yscreen, -1);
        pixel = pixel.traMul(WorldMatrix); 
        Vector3 position = new Vector3(); //extrair a posição da camera de world matrix
        position = WorldMatrix.getTranslation(position);
        Vector3 direction = pixel.sub(position).nor();//criar direção do raio
        return new JRay(position, direction);
    }
}
