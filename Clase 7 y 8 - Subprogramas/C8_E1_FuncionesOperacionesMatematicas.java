/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * 
 * Clase 8 - Ejercicio 1
 * 
 * Crea una aplicación que le pida dos números al
 * usuario y este pueda elegir entre
 * sumar, restar, multiplicar y dividir.
 * La aplicación debe tener una función para cada operación matemática y deben
 * devolver sus resultados para imprimirlos en el main.
 * 
 * @author Diane
 */
public class C8_E1_FuncionesOperacionesMatematicas {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        double num1, num2;

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
            case 1 ->
               System.out.println("La suma es: " +  sumar(num1,num2));
            case 2 ->
                System.out.println("La resta es: " + restar(num1,num2));
            case 3 ->
                System.out.println("La multiplicacion es: " + multiplicacion(num1,num2));
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    System.out.println("La division es: " + division(num1,num2));
                }
            }
            default ->
                System.out.println("Opcion no valida. Intente de nuevo.");
        }
    }
     public static double sumar(double num1, double num2) {
        double resultadoSuma = (num1 + num2);
        return resultadoSuma;
    }
     public static double restar(double num1, double num2) {
        double resultadoResta = (num1 - num2);
        return resultadoResta;
    }   
     public static double multiplicacion(double num1, double num2) {
        double resultadoMultiplicacion = (num1 * num2);
        return resultadoMultiplicacion;
   }
     public static double division(double num1,double num2) {
        double resultadoDivision = (num1 - num2);
        return resultadoDivision;
    }

}
