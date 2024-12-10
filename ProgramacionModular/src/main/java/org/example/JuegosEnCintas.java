package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegosEnCintas {
    public void juegosencintas() {
        Scanner entrada = new Scanner(System.in);

        // Solicito el tamaño de las caras de la cinta y el número de juegos
        int tamanoCara = 0;
        int numJuegos = 0;

        while (true) {
            try {
                System.out.println("Introduce el tamaño de cada cara (entre 1 y 100000000): ");
                tamanoCara = entrada.nextInt();
                if (tamanoCara < 1 || tamanoCara > 100000000) {
                    System.out.println("El tamaño de la cara debe estar entre 1 y 100000000.");
                    continue;
                }

                System.out.println("Introduce el número de juegos que deseas guardar (entre 1 y 8): ");
                numJuegos = entrada.nextInt();
                if (numJuegos < 1 || numJuegos > 8) {
                    System.out.println("El número de juegos debe estar entre 1 y 8.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número válido.");
                entrada.nextLine(); // Limpiar entrada
            }
        }

        // Solicito las duraciones de los juegos y las guardo en un array
        int[] duraciones = new int[numJuegos];

        for (int i = 0; i < numJuegos; i++) {
            while (true) {
                System.out.print("¿Cuánto dura el juego " + (i + 1) + " (entre 1 y 100000000)? ");
                try {
                    duraciones[i] = entrada.nextInt();
                    if (duraciones[i] < 1 || duraciones[i] > 100000000) {
                        System.out.println("La duración del juego debe estar entre 1 y 100000000.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Debes introducir un número válido.");
                    entrada.nextLine(); // Limpiar entrada
                }
            }
        }

        // Imprimo el resultado si es posible o no grabar los juegos en la cinta
        if (esPosibleGrabar(duraciones, tamanoCara)) {
            System.out.println("Sí, es posible grabar los juegos en la cinta.");
        } else {
            System.out.println("No, no es posible grabar los juegos en la cinta.");
        }
    }

    public static boolean esPosibleGrabar(int[] juegos, int tamanoCara) {
        // Ordeno las duraciones de menor a mayor y luego invierto el array
        Arrays.sort(juegos);
        invertirArray(juegos);

        // Variables para almacenar el espacio restante en cada cara
        int espacioCaraA = tamanoCara;
        int espacioCaraB = tamanoCara;

        // Voy asignando los juegos al espacio disponible (primero a la cara A y luego a la cara B)
        for (int juego : juegos) {
            if (juego <= espacioCaraA) {
                espacioCaraA -= juego;
            } else if (juego <= espacioCaraB) {
                espacioCaraB -= juego;
            } else {
                return false; // Si el juego es superior al espacio disponible, no cabe en ninguna de las caras
            }
        }

        return true;
    }

    public static void invertirArray(int[] juegos) {
        for (int i = 0, j = juegos.length - 1; i < j; i++, j--) {
            int aux = juegos[i];
            juegos[i] = juegos[j];
            juegos[j] = aux;
        }
    }
}







