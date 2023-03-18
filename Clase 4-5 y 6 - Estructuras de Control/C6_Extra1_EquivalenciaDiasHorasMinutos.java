/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * CLASE 6 - EJERCICIO EXTRA  1
 * 
 * Dado un tiempo en minutos, calcular su equivalente en días y horas.
 * Por ejemplo, si el usuario ingresa 1600 minutos,
 * el sistema debe calcular su equivalente: 1 día, 2 horas.
 * 
 * @author Diane
 */

public class C6_Extra1_EquivalenciaDiasHorasMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int tiempoMinutos, dias, horas;

        System.out.print("Ingrese el tiempo en minutos calcularemos equivalente en dias y horas: ");

        tiempoMinutos = leer.nextInt();
        dias = Math.abs(tiempoMinutos / 1440);
        horas = (tiempoMinutos % 1440) / 60;
        
        System.out.println(tiempoMinutos + " minutos son: " + dias + " dias y " + horas + " horas");
    }
}