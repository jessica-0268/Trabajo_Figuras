/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Punto {
    private float x;
    private float y;
    
    public Punto(float x, float y){
        this.x=x;
        this.y=y;
    }
    
    public float getx(){
        return x;
    }
    
    public void setx(float x){
        this.x=x;
        
    }
    
    public float gety(){
        return y;
    }
    
    public void sety(float y){
        this.y=y;
        
    }
    
    public void imprimir(){
        System.out.println("INFORMACION DEL PUNTO: ");
        System.out.println(x);
        System.out.println(y);
    }
    
    
}
