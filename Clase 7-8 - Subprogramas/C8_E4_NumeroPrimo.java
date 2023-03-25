package JavaLearning;

import java.util.Scanner;

/**
 * Clase 8 - Ejercicio 4
 * 
 * Crea una aplicación que nos pida un número por teclado y con una función
 * se lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false.
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, si es primo.
 * 
 * @author Diane
 */

public class C8_E4_NumeroPrimo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("-- DETERMINAREMOS SI EL NUMERO A CONTINUACION ES PRIMO O NO --");
        
        System.out.print(" Ingrese un num. ");
        int num = leer.nextInt();
        leer.close();
        
        if (esPrimo(num)){
            System.out.println(num + " ES primo.");
        }else {
            System.out.println(num + " NO es primo.");
        }        
    }
    
    public static boolean esPrimo(int num){
        
        if (num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
