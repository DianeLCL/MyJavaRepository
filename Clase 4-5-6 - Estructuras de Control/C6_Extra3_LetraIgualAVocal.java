/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * 
 * CLASE 6 - EJERCICIO EXTRA 3
 * 
 * 3. Elaborar un algoritmo en el cuál se ingrese una letra
 * y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje.
 * 
 * Nota: investigar la función equals() de la clase String.
 * @author Diane
 */
public class C6_Extra3_LetraIgualAVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String letra;
                
        System.out.print("Ingrese una letra, validaremos si es una vocal o no: ");
        letra = leer.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
          System.out.println(letra + " es una vocal");
          
        } else {
          System.out.println(letra + " NO es una vocal");
        }
  }
}
