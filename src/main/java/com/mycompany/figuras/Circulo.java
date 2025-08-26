/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Circulo {
    private Punto esquina;
    private float radio;
    
    public Circulo(Punto esquina, float radio){
        this.esquina=esquina;
        this.radio=radio;
    }
    
    public Punto getEsquina(){
        return esquina;  
    }
    public void setESquina(Punto esquina){
        this.esquina=esquina;
    }
    
    public float getRadio(){
        return radio;  
    }
    public void setRadio(float radio){
        this.radio=radio;
    }
    
    public void imprimir (){
        System.out.println("INFORMACION DEL CIRCULO: ");
        System.out.println("Coordenadas de la esquina: "+ esquina.getx()+ "--"+ esquina.gety());
        System.out.println("Medida del radio del circulo: "+radio);
    }
    
}
