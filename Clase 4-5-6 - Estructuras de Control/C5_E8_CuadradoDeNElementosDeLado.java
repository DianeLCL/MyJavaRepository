/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 *
 * Clase 5 - Ejercicio 8
 * 
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado
 * se deberá dibujar lo siguiente:
 *      *  *  *  *
 *      *        *
 *      *        *
 *      *  *  *  *
 *     
 * 
 * @author Diane
 */
public class C5_E8_CuadradoDeNElementosDeLado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int lado;
        
        System.out.print("Ingrese la amplitud del cuadrado: ");
        
        lado = sc.nextInt();
        
        for (int i = 1; i <= lado; i++) {
            
            for (int j = 1; j <= lado; j++) {
                
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*  ");
                    
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}