/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * 
 * Clase 5 - Ejercicio 2
 * 
 * 7. Crear un programa que pida una frase y si esa frase
 * es igual a “eureka” el programa pondrá un mensaje de Correcto,
 * sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.
 * 
 * @author Diane
 */
public class C5_E2_EurekaEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String contr;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la clave correcta_"); // eureka
        contr = leer.next();
        
        if ("eureka".equals(contr)){
            
            System.out.println(" Clave Correcta. Ingresando...");
        }else
            System.out.println(" Clave Incorrecta. Saliendo...");

        }
    }  

    

