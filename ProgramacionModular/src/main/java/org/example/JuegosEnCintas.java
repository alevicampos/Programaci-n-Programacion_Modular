package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegosEnCintas {
    public void juegosencintas(){
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        while (error) {

            // solicito el tamaño de las caras de la cinta y el número de juegos
            int tamanoCara = 0;
            int numJuegos = 0;
            try {
                System.out.println("Introduce el tamaño de cada cara: ");
                tamanoCara = entrada.nextInt();
                System.out.println("Introduce el número de juegos que deseas guardar: ");
                numJuegos = entrada.nextInt();
                error= false;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número.");
                entrada.nextLine();
            }

            // Solicito las duraciones de los juegos y las guardo en un array.

            int[] duraciones = new int[numJuegos];

            for (int i = 0; i < numJuegos; i++) {
                boolean errordos = true;

                while (errordos) {
                    System.out.print("¿Cuánto dura el juego " + (i + 1) + "? ");
                    try {
                        duraciones[i] = entrada.nextInt();
                        errordos = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Debes introducir un numero");
                        entrada.nextLine();
                    }
                }
            }

           //  Imprimo el resultado si es posible o no grabar los juegos en la cinta
            if (esPosibleGrabar(duraciones, tamanoCara)) {
                System.out.println("Si, es posible grabar los juegos en la cinta.");
            } else {
                System.out.println("No, no es posible grabar los juegos en la cinta.");
            }
        }


    }
    public static boolean esPosibleGrabar(int[] juegos, int tamanoCara) {
        // Ordeno las duraciones de menor y luego invierto el array.
        // Para introducir primero las de mayor duración
        Arrays.sort(juegos);
        invertirArray(juegos);

        // Variables para almacenar el espacio restante en cada cara
        int espacioCaraA = tamanoCara;
        int espacioCaraB = tamanoCara;

        // Voy asignando los juegos al espacio disponible (primero a la cara A y luego a la cara B)
        for (int i = 0; i < juegos.length; i++) {
            int juego = juegos[i];
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




