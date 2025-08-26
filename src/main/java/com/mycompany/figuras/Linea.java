/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Linea {
    private Punto p1;
    private Punto p2;
    
    public Linea(Punto p1, Punto p2){
        this.p1=p1;
        this.p2=p2;
    }
    
    public Punto getP1(){//Mostrar el valor
        return p1;
    }
    
    public void setP1(Punto p1){//asignar el valor 
        this.p1=p1;
    }
    
   public void imprimir (){
       System.out.println("INFORMACION DE LA LINEA: ");
       System.out.println("Primera coordenada: "+ p1.getx()+ "-- " +p1.gety()+ " segunda coordenada: "+ p2.getx()+ "-- "+ p2.gety() );
       
   }
    
}
