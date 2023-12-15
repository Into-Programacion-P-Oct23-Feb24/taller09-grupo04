/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int media_superior=0;
        int media_inferior=0;
        int suma = 0;
        int promedio;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        promedio = suma / arreglo.length;

        for (int j = 0; j < arreglo.length; j++) {
            if (arreglo[j] > promedio) {
                media_superior=media_superior+1;
            } else {
                if (arreglo[j] < promedio) {
                    media_inferior=media_inferior+1;
                }
            }
        }
        System.out.printf("La media aritmética de los %s elementos es: %d\n"
                + "%d elementos están arriba de la media aritmética.\n"
                + "%d elementos están por debajo de la medía aritmética.\n"
                ,arreglo.length
                ,promedio
                ,media_superior
                ,media_inferior);
    }

}


