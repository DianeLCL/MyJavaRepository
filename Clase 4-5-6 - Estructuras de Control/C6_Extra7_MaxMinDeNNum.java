/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;
import java.util.Scanner;

/**
 *  CLASE 6 - EJERCICIO EXTRA 7
 * 
 * Realice un programa que calcule y visualice
 * el valor máximo, el valor mínimo y el promedio de n números (n>0).
 * El valor de n se solicitará al principio del programa
 * y los números serán introducidos por el usuario.
 * Realice dos versiones del programa,
 * una usando el bucle “while”
 * y otra con el bucle “do - while”.

 * @author Diane
 */

public class C6_Extra7_MaxMinDeNNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in);

        // Pedimos el valor de n
        System.out.print("Ingrese la cantidad de numeros a evaluar: ");
        int n = leer.nextInt();

        // Inicializamos variables
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;
        double promedio;

        // Bucle while
        int i = 0;
        while (i < n) {
          System.out.print("Ingrese un numero: ");
          int num = leer.nextInt();
          if (num > max) {
            max = num;
          }
          if (num < min) {
            min = num;
          }
          suma += num;
          contador++;
          i++;
        }

        // Calculamos el promedio
        promedio = (double)suma / contador;

        // Mostramos los resultados
        System.out.println("Usando el bucle while:");
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);

        // Reinicializamos variables
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        suma = 0;
        contador = 0;

        // Bucle do-while
        i = 0;
        do {
          System.out.print("Ingrese un numero: ");
          int num = leer.nextInt();
          if (num > max) {
            max = num;
          }
          if (num < min) {
            min = num;
          }
          suma += num;
          contador++;
          i++;
        } while (i < n);

        // Calculamos el promedio
        promedio = (double)suma / contador;

        // Mostramos los resultados
        System.out.println("Usando el bucle do-while:");
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);

        // Cerramos el Scanner
        leer.close();
      }
}
