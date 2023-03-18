/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * 
 * Clase 5 - Ejercicio 5
 *
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial
 * 
 * @author Diane
 */
public class C5_E5_SumaHastaValorLmitePositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int limitePositivo;
        int suma = 0;
        int contador = 0;
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo.");
        limitePositivo = leer.nextInt();

        System.out.println("Ingrese num, dejaremos de pedirlo cuando la suma de lo ingresado supere el valor limite.");
        
        while (suma < limitePositivo) {
            contador++;
            System.out.println("Num #" + contador + ":");
            int numero = leer.nextInt();
            suma += numero;
        }
        
        System.out.println(suma + " es igual o superior al limite.");
    }

}
    
