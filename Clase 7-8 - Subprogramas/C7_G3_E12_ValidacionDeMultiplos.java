/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

/**
 * Clase 7 - Guia 3 - Ejercicio 12 
 * Crea un procedimiento EsMultiplo
 * que reciba los dos números pasados por el usuario,
 * validando que el primer
 * número múltiplo del segundo e imprima
 * si el primer número es múltiplo del
 * segundo, sino informe que no lo son.
 *
 * @author Diane
 */

import java.util.Scanner;

public class C7_G3_E12_ValidacionDeMultiplos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números separados por espacio:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        esMultiplo(num1, num2);
    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}
