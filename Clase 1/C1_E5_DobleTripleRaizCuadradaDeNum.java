/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * Clase 1 - Ejercicio 5
 * 
 * Escribir un programa que lea un número entero
 * por teclado y muestre por pantalla
 * el doble, el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 * 
 * @author Diane
 */
public class C1_E5_DobleTripleRaizCuadradaDeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero, mostraremos el doble, el triple y su raiz cuadrada");
             
        num = leer.nextInt();
        
        System.out.println("Doble: " + num * 2 + " | Triple: " + num * 3 + " | Raiz Cuadrada: " + Math.sqrt(num));
    }
    
}
