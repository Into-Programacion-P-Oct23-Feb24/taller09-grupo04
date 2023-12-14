/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int elementos;
        String marcasa[];
        String marcas;
        String inicial;

        System.out.println("Ingrese el numero de marcas");
        elementos = entrada.nextInt();
        marcasa = new String[elementos];

        entrada.nextLine();
        int i = 0;
        while (i < elementos) {

            System.out.println("Ingrese las marcas");
            marcas = entrada.nextLine();
            inicial = marcas.substring(0, 1);
            if (inicial.equals("A") || inicial.equals("T")) {
               System.out.println("Acceso incorrecto");
            } else {
                marcasa[i] = marcas;
                i = i + 1;
            }

        }
        System.out.println("---");
       
        for (int j = 0; j < marcasa.length; j++) {
            System.out.println(marcasa[j]);
        }

    }
}
