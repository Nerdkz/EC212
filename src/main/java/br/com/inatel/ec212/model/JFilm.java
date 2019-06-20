/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inatel.ec212.model;

/**
 *
 * @author aluno
 */
public class JFilm {
    
    public float width;
    public float height;
 
    public JFilm(){
        
    }
    public JFilm(float width, float height){
        this.width = width;
        this.height = height;

    }
    
    public float aspectRatio(){
        return width/height;
    }
}
