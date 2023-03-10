/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * Clase 1 - Ejercicio 2 
 * 
 * Escribir un programa que pida tu nombre,
 * lo guarde en una variable y lo muestre por pantalla.
 * 
 * @author Diane
 */
public class C1_E2_NombreAlojadoEnVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String nombre;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        
        nombre = leer.next();
        
        System.out.println("Hola " + nombre );
    }
    
}
