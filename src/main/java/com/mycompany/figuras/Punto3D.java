/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Punto3D extends Punto {
    private float z;
    
    public Punto3D(float z, float x, float y){
        super (x,y);
        this.z=z;
    }
    
    public float getZ(){
        return z;
    }
    
    public void setZ (float z){
        this.z=z;
    }
    
    
    public void imprimir(){
        System.out.println(" INFORMACION DEL PUNTO 3D: ");
        System.out.println("Punto x= "+ getx()+ "Punto y= "+ gety()+ "punto z= "+z);
    }
    
    
}
