/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaLearning;

/**
 * CLASE 6 - EJERCICIO EXTRA 2
 * 
 * 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones necesarias para que:
 * B tome el valor de C,
 * C tome el valor de A,
 * A tome el valor de D, y
 * D tome el valor de B.
 * Mostrar los valores iniciales y los valores finales de cada variable.
 * Utilizar sólo una variable auxiliar.

* 
 * @author Diane
 */
public class C6_Extra2_ModificarValoresDeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
}