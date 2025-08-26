/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Rectangulo {
    private Punto esquina;
    private float lado1;
    private float lado2;
    
    public Rectangulo (Punto esquina, float lado1, float lado2){
        this.esquina=esquina;
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public Punto getEsquina(){
        return esquina;
    }
    
    public void setESquina(Punto esquina){
        this.esquina=esquina; 
    }
    
    public float getlado1(){
        return lado1;
    }
    
    public void setLado1(float lado1){
        this.lado1=lado1; 
    }
    
    public float getlado2(){
        return lado2;
    }
    
    public void setLado2(float lado2){
        this.lado2=lado2; 
    }
    
    public void imprimir (){
        System.out.println("INFORMACION RECTANGULO: ");
        System.out.println("Esquina= "+ esquina.getx()+ "--"+esquina.gety()+" Lado 1= "+ lado1+ " Lado 2 = "+ lado2);
    }
    
    
    
}
