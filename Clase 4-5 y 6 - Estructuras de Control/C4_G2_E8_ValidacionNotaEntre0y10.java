/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * 
 * CLASE 4 - GUIA JAVA INTRO 2
 * EJERCICIO 8
 * 
 * Escriba un programa que valide si una nota está entre 0 y 10,
 * sino está entre 0 y 10 la nota se pedirá de nuevo
 * hasta que la nota sea correcta.
 * 
 * @author Diane
 */
public class C4_G2_E8_ValidacionNotaEntre0y10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int note;
        
        System.out.println("Ingrese una nota entre 0 y 10:");
        note = leer.nextInt();
       
        while (note >= 10 | note <= 0) {  // En las comparativas </> ya da por tomado menor/mayor O = en Java | <= / >=
            
           System.out.println("El numero ingresado es incorrecto. Intente nuevamente.");
           System.out.println("Ingrese una nota entre 0 y 10:");
           note = leer.nextInt();
        
        } System.out.println("Correcto. La nota es " + note);
        
    }
    
}
