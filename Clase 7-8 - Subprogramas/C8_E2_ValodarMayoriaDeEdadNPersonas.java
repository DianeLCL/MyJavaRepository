/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 *
 * Clase 8 - Ejercicio 2
 * 
 * Diseñe una función que pida el nombre y la edad de N personas e imprima
 * los datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author Diane
 */
public class C8_E2_ValodarMayoriaDeEdadNPersonas {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese cantidad de usuarios: ");
        int cantidadUsuarios = leer.nextInt();
     
        for (int i = 0; i < cantidadUsuarios; i++) {
            MayorOmenordeEdad();           
            System.out.println(" ¿Desea Continuar? \n [Si/No]");
         if (leer.next().equalsIgnoreCase("No")) {
                break;
            }
        }
    }
    
    public static String MayorOmenordeEdad(){
        
        Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese Nombre: ");
        String nombre = leer.next();

        System.out.println(" Ingrese Edad:: ");
        int edad = leer.nextInt();
        String mayoriaDeEdad;

        if (edad > 18) {
            mayoriaDeEdad = "Mayor";
        } else {
            mayoriaDeEdad = "Menor";
        }

        System.out.println( nombre + " | " + edad + " | " + mayoriaDeEdad + " de Edad");
        
        return null;
    }
            
}
