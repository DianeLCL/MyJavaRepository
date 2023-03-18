/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

/**
 * Clase 5 - Ejercicio 6
 *
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, 
 * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa ՄS/NՅ?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa,
 * caso contrario se vuelve a mostrar el menú.
 * 
 * @author Diane
 */

import java.util.Scanner;

public class C5_E6_MenuOperacionesMatematicas {
        
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int num1, num2;
        
        do {
            System.out.println("Ingrese dos numeros enteros positivos: ");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1 -> System.out.println("La suma es: " + (num1 + num2));
                case 2 -> System.out.println("La resta es: " + (num1 - num2));
                case 3 -> System.out.println("La multiplicacion es: " + (num1 * num2));
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("La division es: " + ((double)num1 / num2));
                    }
                }
                case 5 -> {
                    System.out.println("¿Esta seguro que desea salir del programa? S/N");
                    String confirmacion = leer.next();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("¿Hasta luego!");
                    }
                }
                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
            
        } while (opcion != 5);
    }

}

