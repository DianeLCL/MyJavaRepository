/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

/**
 * 
 * Clase 8 - Ejercicio 3
 * 
 * Crea una aplicación que a través de una función nos convierta una cantidad
 * de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
 * La función tendrá como parámetros,
 * la cantidad de euros y la moneda a convertir que será una cadena,
 * este no devolverá ningún valor y mostrará un mensaje indicando
 * el cambio (void).
 * 
 * El cambio de divisas es:
 * 1- * 0.86 libras es un 1 €
 * 2- * 1.28611 dolares($) es un 1 €
 * 3- * 129.852 yenes es un 1 €


 * @author Diane
 */

import java.util.Scanner;

public class C8_E3_FuncionesCambioDeDivisas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-- CONVERSOR DE DIVISAS --");
        
        System.out.println("Introduce la cantidad de euros:");
        double cantidadEuros = leer.nextDouble();
        
        System.out.println("Introduce la moneda que quieres convertir:");
        String moneda = leer.next();
        
        convertirMoneda(cantidadEuros, moneda);
        leer.close();
    }
    
    public static void convertirMoneda(double cantidadEuros, String moneda){
        
        double resultado = 0;
        
        switch (moneda.toLowerCase()){
            case "libras" -> {
                resultado = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros son " + resultado + " libras.");
            }
            case "dolares" -> {
             resultado = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " euros son " + resultado + " dolares.");
            }
             case "yenes" -> {
             resultado = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros son " + resultado + " yenes.");
            }
             default -> System.out.println("La moneda introducida no es válida.");                
        }
    }
}
