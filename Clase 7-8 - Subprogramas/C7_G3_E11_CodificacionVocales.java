/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

/**
 * 
 * Clase 7 - Guia 3 - Ejercicio 11
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios.
 * a e i o u
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10
 * @author Diane
 */

import java.util.Scanner;

public class C7_G3_E11_CodificacionVocales {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase y termine con un punto:");
        String frase = leer.nextLine();

        String vocal = codificar(frase);

        System.out.println("La palabra o frase codificada es: " + vocal);
    }

    public static String codificar(String frase) {
        String vocal = "";

        for (int i = 0; i < frase.length() - 1; i++) { // Se está recorriendo la palabra, letra por letra
            char caracter = frase.charAt(i);      // Cuando el largo de la palabra deje de superar
            switch (caracter) {                         // el valor de i, se detendrá. De ahí el -1.
                case 'a', 'A' -> vocal += "@";
                case 'e', 'E' -> vocal += "#";
                case 'i', 'I' -> vocal += "$";
                case 'o', 'O' -> vocal += "%";
                case 'u', 'U' -> vocal += "*";
                default -> vocal += caracter;
            }
        }

        vocal += ".";

        return vocal;
    }
}