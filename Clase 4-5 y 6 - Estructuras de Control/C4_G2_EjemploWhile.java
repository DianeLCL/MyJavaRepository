/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * MIENTRAS /while/
 * Se responda con "S" / "s"
 * Se continuará ejecutando ese bloque de código.
 * De forma contraria, hace un salto a lo siguiente. 
 * @author Diane
 */
public class C4_G2_EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String respuesta = "S";
        
        while (respuesta.equalsIgnoreCase("S")){
        
        System.out.println("Desea continuar?");
        respuesta = leer.nextLine();
        
        }
        
    }
    
}
