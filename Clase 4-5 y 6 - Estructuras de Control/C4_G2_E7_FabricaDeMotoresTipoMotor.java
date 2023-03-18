/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * CLASE 4 - GUIA JAVA INTRO 2
 * EJERCICIO 7
 * 
 * Considera que estás desarrollando una web para una empresa que fabrica motores
 * (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
 * Definir una variable tipoMotor y permitir que el usuario
 * ingrese un valor entre 1 y 4.
 * 
 * El programa debe mostrar lo siguiente:
 *
 * o Si el tipo de motor es 1, mostrar un mensaje indicando
 * “La bomba es una bomba de agua”.
 * o Si el tipo de motor es 2, mostrar un mensaje indicando
 * “La bomba es una bomba de gasolina”.
 * o Si el tipo de motor es 3, mostrar un mensaje indicando
 * “La bomba es una bomba de hormigón”.
 * o Si el tipo de motor es 4, mostrar un mensaje indicando
 * “La bomba es una bomba de pasta alimenticia”.
 * o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
 * “No existe un valor válido para tipo de bomba”
 *
 * @author Diane
 */
public class C4_G2_E7_FabricaDeMotoresTipoMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese Tipo de Motor: | 1/2/3/4");
        
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1 -> System.out.println(" La bomba es una bomba de agua.");
            case 2 -> System.out.println(" La bomba es una bomba de gasolina.");
            case 3 -> System.out.println (" La bomba es una bomba de hormigon.");
            case 4 -> System.out.println(" La bomba es una bomba de pasta alimenticia.");
            default -> System.out.println(" No existe un valor valido para tipo de bomba.");
                
        }
    }
    
}
