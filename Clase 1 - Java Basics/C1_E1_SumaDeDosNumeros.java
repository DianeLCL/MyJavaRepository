/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * Clase 1 - Ejercicio 1 
 * 
 * Escribir un programa que pida dos números enteros por teclado
 * y calcule la suma de los dos.
 * El programa deberá después mostrar el resultado de la suma
 * 
 * @author Diane
 */
public class C1_E1_SumaDeDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num1, num2 ;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para sumar:");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("La suma de los dos num ingresados es: " + (num1 + num2));
    }
    
}
