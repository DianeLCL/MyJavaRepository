/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 *
 * CLASE 6 - EJERCICIO EXTRA 6
 * 
 * Leer la altura de N personas y determinar el promedio de estaturas
 * que se encuentran por debajo de 1.60 mts.
 * y el promedio de estaturas en general.
 * 
 * @author Diane
 */
public class C6_Extra6_PromedioAlturaNPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        double sumaTotal = 0, sumaBajas = 0;
        int contadorBajas = 0, contadorTotal = 0;
        
        System.out.print("Ingrese el número de personas: ");
        n = leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la estatura en metros de la persona " + i + ": ");
            double estatura = leer.nextDouble();
            sumaTotal += estatura;
            contadorTotal++;
            
            if (estatura < 1.60) {
                sumaBajas += estatura;
                contadorBajas++;
            }
        }
        
        double promedioTotal = sumaTotal / contadorTotal;
        double promedioBajas = sumaBajas / contadorBajas;
        
        System.out.println("Promedio de estaturas en general: " + promedioTotal);
        
        if (contadorBajas == 0) {
            System.out.println("No se ingresaron estaturas por debajo de 1.60 mts.");
        } else {
            System.out.println("Promedio de estaturas por debajo de 1.60 mts.: " + promedioBajas);
        }
        
        leer.close();
    }
}