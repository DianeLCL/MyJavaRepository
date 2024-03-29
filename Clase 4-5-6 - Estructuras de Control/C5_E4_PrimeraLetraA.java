/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 *
 * Clase 5 - Ejercicio 4
 * 
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
 * equals() de Java.
 * 
 * @author Diane
 */
public class C5_E4_PrimeraLetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra. Validaremos si la primera letra de esa frase es una A.");
        String frase = leer.next();
        
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
                System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
            }
        
    }
    
}
