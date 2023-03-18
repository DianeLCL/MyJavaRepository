/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * CLASE 4 - GUIA JAVA INTRO 2
 * EJERCICIO 6 
 * Implementar un programa que le pida dos números enteros al usuario
 * y determine si ambos o alguno de ellos es mayor a 25
 * 
 * @author Diane
 */
public class C4_G2_E6_DosNumMayoresA25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos num, determinaremos si uno o ambos superan al num 25:");
        
             num1 = leer.nextInt();
             num2 = leer.nextInt();
             
        if (num1 >= 25 & num2 >= 25 ) {
            System.out.println("Ambos son mayores a 25.");
        }else if (num1 > 25) {
            System.out.println("El primer Num [" + num1 + "] es mayor a 25.");
        }else if (num2 > 25) {
            System.out.println( "El segundo Num [" + num2 + "] es mayor a 25.");
        }else {
             System.out.println("Ninguno es mayor a 25.");
        }

    }
    
}
