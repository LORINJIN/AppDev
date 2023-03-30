/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appdev;

/**
 *
 * @author Lian
 */
public class AppDev {

    public static void main(String[] args) {
        
    interface Wheel{
    public float getDiameter();
    public float getWidth();
}
        
       class CarWheel implements Wheel {
    protected float diameter;
    protected float width;

    public CarWheel(float diameter, float width) {
        this.diameter = diameter;
        this.width = width;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getWidth() {
        return width;
    }
}
    }
}
