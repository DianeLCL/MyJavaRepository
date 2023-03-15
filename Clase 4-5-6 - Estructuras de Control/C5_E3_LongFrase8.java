/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * Clase 5 - Ejercicio 3
 * 
 * Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
 *
 * @author Diane
 */
public class C5_E3_LongFrase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres.");
        frase = leer.next();
        
        int longitud = frase.length();
          
        if (longitud == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
            }
        
        }
    
    }
    

