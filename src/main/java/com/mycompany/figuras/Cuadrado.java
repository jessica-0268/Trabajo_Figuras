/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Cuadrado {
    private Punto esquina;
    private float lado;
    
    public Cuadrado (Punto esquina, float lado){
        this.esquina=esquina;
        this.lado=lado;
    }
    
    public Punto getESquina (){
        return esquina;
    }
    
    public void setEsquina (Punto esquina){
        this.esquina=esquina;
    }
    
    public float getLado(){
        return lado;
    }
    
    public void setLado (float lado){
       this.lado=lado;
    }
    
    public void imprimir (){
        System.out.println(" INFORMACION DEL CUADRADO: ");
        System.out.println("Esquina= "+ esquina.getx()+ "-- "+esquina.gety()+ " Medida del lado= "+ lado);
    }
}
