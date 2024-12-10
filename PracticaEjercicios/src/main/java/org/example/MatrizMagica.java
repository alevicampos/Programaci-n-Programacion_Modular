package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizMagica {
    public void matrizMagica() {
        // Escribir un programa que solicite los elementos de una matriz de tamaño
        // 4X4. La aplicación debe decidir si la matriz introducida corresponde a
        // una matriz magica, que es aquella donde la suma de los elementos de cualquier
        // fila o de cualquier columna vale lo mismo.

        int[][] matriz = new int[4][4];
        // imprimo la matriz:
        for (int[] fila : solicitarValores(matriz)) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        // Llamar al método para sumar las filas
        int[] sumaFilas = sumarFilas(matriz);
        // imprimir el valor de cada una de la filas

    }
        // Solicito los valores de la matriz:
        public int[][] solicitarValores ( int[][] matriz){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce los valores de la matriz: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.println("posicion: [" + i + "][" + j + "]");
                    matriz[i][j] = entrada.nextInt();
                }
            }
            return matriz;
        }
        public static int[] sumarFilas ( int[][] matriz){
            int[] sumaFilas = new int[matriz.length];
            for (int i = 0; i < matriz.length; i++) {
                int suma = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    suma += matriz[i][j];
                }
                sumaFilas[i] = suma;
            }
            return sumaFilas;
        }

}
