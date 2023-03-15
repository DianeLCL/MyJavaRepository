/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

/**
 *
 * Clase 5 - Ejercicio 7
 * 
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario.
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
 * el primer carácter tiene que ser X y el último tiene que ser una O.
 * 
 * Las secuencias leídas que respeten el formato se consideran correctas,
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDEՅ),
 * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * 
 * Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas.
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals()
 *
 * @author Diane
 */

import java.util.Scanner;

public class C5_E7_SimulacionDeDispositivoRS232 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int correctas = 0;
        int incorrectas = 0;
        
        String secuencia;
        
        System.out.println("Sinulacion de dispositivo RS232:");
        
        while (true) {
            System.out.print("Ingrese secuencia (o &&&&& para salir): ");
            secuencia = leer.nextLine();
            
            if (secuencia.equals("&&&&&")) {
                break;
            }
            
            else if (secuencia.length() == 5 && secuencia.substring(0, 1).equals("X") && secuencia.substring(4).equals("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
        }
        
        System.out.println("Informe de lecturas: ");
        System.out.println("Lecturas correctas: " + correctas + " | Lecturas incorrectas: " + incorrectas);
    }
}
