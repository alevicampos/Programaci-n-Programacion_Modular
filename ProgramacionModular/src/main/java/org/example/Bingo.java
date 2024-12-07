package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public void bingo() {
        System.out.println("*** BIENVENIDO AL BINGO DEL CASINO CANTÁBRICO ***");
        Scanner entrada = new Scanner(System.in);

        // Generar 25 bolas aleatorias sin duplicados
        int[] bolasExtraidas = new int[25];
        Random random = new Random();

        for (int i = 0; i < bolasExtraidas.length; i++) {
            int bola;
            boolean duplicado;
            do {
                duplicado = false;
                bola = random.nextInt(90) + 1; // Números entre 1 y 90
                for (int j = 0; j < i; j++) {
                    if (bolasExtraidas[j] == bola) {
                        duplicado = true;
                        break;
                    }
                }
            } while (duplicado);
            bolasExtraidas[i] = bola;
        }

        System.out.println("25 bolas extraídas hasta ahora: " + Arrays.toString(bolasExtraidas));

        System.out.println("*** Introduce los datos de tu cartón ***");

        // Crear la matriz del cartón de bingo
        String[][] carton = new String[3][3];
        String[] filas = new String[3];
        boolean formatoCorrecto = true;

        // Solicitar cada fila del cartón con validación
        for (int i = 0; i < 3; i++) {
            System.out.print("Fila " + (i + 1) + " (formato N-N-N): ");
            String fila = entrada.nextLine();
            if (fila.matches("^\\d{1,2}-\\d{1,2}-\\d{1,2}$")) {
                filas[i] = fila; // Guardar fila válida
            } else {
                System.out.println("Error: La fila no cumple el formato 'N-N-N' donde N son números de 1 o 2 dígitos.");
                formatoCorrecto = false;
                break; // Detener si hay un error de formato
            }
        }

        if (!formatoCorrecto) {
            System.out.println("Debe introducir los datos correctamente.");
            return;
        }

        // Llenar la matriz del cartón con los datos ingresados
        carton[0] = filas[0].split("-");
        carton[1] = filas[1].split("-");
        carton[2] = filas[2].split("-");

        // Mostrar el cartón
        System.out.println("Datos del cartón introducido:");
        for (String[] fila : carton) {
            for (String valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        // comprobar que todos los datos del cartón introducido
        // estén entre las bolas sorteadas hasta el momento.

        // compruebo primero si hay linea:

        boolean hayLinea = false;
        int contadorFilasCoincidentes = 0;
        for (int i = 0; i < carton.length; i++) { // Recorre cada fila
            boolean filaValida = true; // validar si la fila está en las bolas extraídas
            for (int j = 0; j < carton[i].length; j++) {
                int numero = Integer.parseInt(carton[i][j]);
                boolean encontrado = false;
                // Verificar si el número está en las bolas extraídas
                for (int k = 0; k < bolasExtraidas.length; k++) {
                    if (bolasExtraidas[k] == numero) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    filaValida = false;
                    break; // Si un número no está, no es necesario seguir en esta fila
                }
            }
            if (filaValida) {
                hayLinea = true;
                contadorFilasCoincidentes ++;
            }
        }

        // Mostrar resultado
        System.out.println("PREMIOS:");
        if (hayLinea) {
            System.out.println("¡HAY " + contadorFilasCoincidentes + " LÍNEA/S!");
        } else {
            System.out.println("NO HAY LÍNEA :(");
        }

        //Compruebo ahora si hay BINGO
        // Si coinciden todas las filas hay bingo

        if (contadorFilasCoincidentes==3) {
            System.out.println("¡HAY BINGO!");
        } else {
            System.out.println("NO HAY BINGO :(");
        }

    }

}








