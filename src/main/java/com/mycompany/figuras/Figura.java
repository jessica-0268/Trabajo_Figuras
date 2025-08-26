/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

/**
 *
 * @author jessi
 */
public class Figuras {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Punto p1= new Punto(5, 7);
        Punto p2= new Punto(67, 7);
        System.out.println(p1);
        p1.imprimir();
        
        Linea linea=new Linea(p1,p2);
        linea.imprimir();
        
        Punto p3= new Punto(89, 6);
        Circulo c1= new Circulo(p3,56);
        c1.imprimir();
        
        Rectangulo r1= new Rectangulo(p1,56,34);
        r1.imprimir();
        
        Cuadrado Cuadr1= new Cuadrado(p2, 45);
        Cuadr1.imprimir();
        
        Punto3D punto= new Punto3D(7,9,8);
        punto.imprimir();
    }
}
