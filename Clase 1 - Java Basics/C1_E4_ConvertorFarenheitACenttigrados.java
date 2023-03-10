/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * Clase 1 - Ejercicio 4
 * 
 * Dada una cantidad de grados centígrados se debe mostrar
 * su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es:
 * F = 32 + (9 * C / 5).
 * @author Diane
 */
public class C1_E4_ConvertorFarenheitACenttigrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float gradosCentigrados;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una temperatura en C° y lo convertiremos a F°");
    
    gradosCentigrados = leer.nextFloat();
    
    System.out.println(gradosCentigrados + "°C es igual a " + (convertirFahrenheit(gradosCentigrados)) + "°F");
            
    }

    private static float convertirFahrenheit(float gradosCentigrados) {
   
        float Fahrenheit = 32 + (9 * gradosCentigrados / 5);
        return Fahrenheit ;
    }
    
}
