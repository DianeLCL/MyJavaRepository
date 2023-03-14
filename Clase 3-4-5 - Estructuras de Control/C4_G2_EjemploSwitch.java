/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 *
 * @author Diane
 */
public class C4_G2_EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Ingrese una opcion: | 1/2");
        
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1 -> System.out.println("Esta linea de codigo ejecuta cuando opcion = 1");
            case 2 -> System.out.println("Esta linea de codigo se ejecuta cuando opcion = 2");
            default -> System.out.println(" El valor ingresado en la variable es diferente" + " a todos los casos analizados por el switch.");
                
        }
        
    }
    
}
