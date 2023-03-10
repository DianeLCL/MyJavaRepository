/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * Clase 1 - Ejercicio 3
 * 
 * Escribir un programa que pida una frase y la muestre toda
 * en mayúsculas y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * 
 * @author Diane
 */
public class C1_E3_MinusculasYMayusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String frase;
        
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     System.out.println("Ingrese una frase y se escribira por separado totalmente en minuscula y mayuscula");
     
     frase = leer.next();
     
     System.out.println("Minusculas: " + frase.toLowerCase() + "| Mayusculas: " + frase.toUpperCase()); 
    }
    
}
