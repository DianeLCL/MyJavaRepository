/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * CLASE 6 - EJERCICIO EXTRA 4
 * 
 * Elaborar un algoritmo en el cuál
 * se ingrese un número entre 1 y 10
 * y se muestre su equivalente en romano.
 *
 * @author Diane
 */

public class C6_Extra4_1Al10EquivalenteEnRomano {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero entero entre 1 y 10: ");
        numero = leer.nextInt();
        
        switch (numero) {
            case 1 -> System.out.println("El equivalente en numero romano es: I");
            case 2 -> System.out.println("El equivalente en numero romano es: II");
            case 3 -> System.out.println("El equivalente en numero romano es: III");
            case 4 -> System.out.println("El equivalente en numero romano es: IV");
            case 5 -> System.out.println("El equivalente en numero romano es: V");
            case 6 -> System.out.println("El equivalente en numero romano es: VI");
            case 7 -> System.out.println("El equivalente en numero romano es: VII");
            case 8 -> System.out.println("El equivalente en numero romano es: VIII");
            case 9 -> System.out.println("El equivalente en numero romano es: IX");
            case 10 -> System.out.println("El equivalente en numero romano es: X");
            default -> System.out.println("El numero ingresado no corresponde al rango permitido");
        }
        
    }

}