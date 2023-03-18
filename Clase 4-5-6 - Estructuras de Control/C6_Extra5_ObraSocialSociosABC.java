/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

import java.util.Scanner;

/**
 * CLASE 6 - EJERCICIO EXTRA 5
 * 
 * Una obra social tiene tres clases de socios:
 * ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
 * en todos los tipos de tratamientos.
 * ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
 * para los mismos tratamientos que los socios del tipo A.
 * ○ Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 * 
 * ○ Solicite una letra (carácter) que representa la clase de un socio,
 * y luego un valor real que represente el costo del tratamiento (previo al descuento) 
 * y determine el importe en efectivo a pagar por dicho socio.

 * @author Diane
 */
public class C6_Extra5_ObraSocialSociosABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char claseDeSocio;
        double descuento = 0, importeAPagar, costo;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la clase de socio: A | B | C : ");
        claseDeSocio = leer.nextLine().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        costo = leer.nextDouble();
        
        switch (claseDeSocio) {
            case 'A' -> descuento = 0.5;
            case 'B' -> descuento = 0.35;
            case 'C' -> descuento = 0;
            default -> {
                System.out.println("La clase ingresada es inválida.");
                System.exit(0);
            }
        }
        
        importeAPagar = (costo - costo * descuento);
        System.out.printf("El importe a pagar es: $" +  importeAPagar);

        leer.close();
    }
}
