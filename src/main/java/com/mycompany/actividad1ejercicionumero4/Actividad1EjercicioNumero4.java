/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1ejercicionumero4;

import java.util.Scanner;
public class Actividad1EjercicioNumero4 {

    public static void main(String[] args) {
        double x,cuadrado,cubo;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero o decimal");
        x = leer.nextDouble();
        cuadrado = Math.pow(x,2);
        cubo = Math.pow(x,3);
        System.out.println("el cuadrado del numero "+x+ " es: "+cuadrado);
        System.out.println("el cubo del numero "+x+" es: "+cubo);
        
        
    }
}
