/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        String[] inicialLetra2 = new String[7];
        char inicialLetra;
        boolean bandera = true;

        for (int i = 0; i < estudiantes.length; i++) {
            inicialLetra = estudiantes[i].charAt(0);
            inicialLetra2[i] = String.valueOf(inicialLetra);
        }
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            inicial = inicial.toUpperCase();
            for (int i = 0; i < estudiantes.length; i++) {
                if (inicial.equals(inicialLetra2[i])) {
                    bandera = false;
                }
            }
        }
    }
}
