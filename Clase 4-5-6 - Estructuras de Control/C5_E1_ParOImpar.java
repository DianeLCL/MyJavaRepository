/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * CLASE 5 - EJERCICIO 1
 * 
 * Crear un programa que dado un número determine si es par o impar.
 * 
 * @author Diane
 */
public class C5_E1_ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Determinaremos si el siguiente num que ingrese es PAR o IMPAR:");
        
        num = leer.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El num es PAR");
        }else 
            System.out.println("El num es IMPAR");
            
        }           
        
    }
