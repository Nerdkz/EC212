/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inatel.ec212.model;

/**
 *
 * @author Usuario
 */
public class JRenderOptions {
    
    private int width;
    private int height;
    private int cameraSamples;
    private float filterWidth;
    private float gamma;
    private float exposure;

    public JRenderOptions() {
    }

    public JRenderOptions(int width, int height, int cameraSamples, float filterWidth, float gamma, float exposure) {
        this.width = width;
        this.height = height;
        this.cameraSamples = cameraSamples;
        this.filterWidth = filterWidth;
        this.gamma = gamma;
        this.exposure = exposure;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCameraSamples() {
        return cameraSamples;
    }

    public void setCameraSamples(int cameraSamples) {
        this.cameraSamples = cameraSamples;
    }

    public float getFilterWidth() {
        return filterWidth;
    }

    public void setFilterWidth(float filterWidth) {
        this.filterWidth = filterWidth;
    }

    public float getGamma() {
        return gamma;
    }

    public void setGamma(float gamma) {
        this.gamma = gamma;
    }

    public float getExposure() {
        return exposure;
    }

    public void setExposure(float exposure) {
        this.exposure = exposure;
    }
    
    
    
}
