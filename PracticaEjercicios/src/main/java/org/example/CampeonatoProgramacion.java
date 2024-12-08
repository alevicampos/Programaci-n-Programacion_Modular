package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CampeonatoProgramacion {
    public void campeonatoprogramacion(){
        // Diseñar una aplicación para gesionar un campeonato de programación,
        // donde se le introducen la puntuacion (enteros) obtenidos por 5 programadores,
        // conforme van terminado su prueba. En ocaciones, cuando finalizan los 5 participantes
        // anteriores, se suman al campeonato un máximo de 3 programadires de exhibiciom, cuyos
        // puntos se incluyen con el resto. La forma de especificar  que no intervienen mas
        // programadores es introducir un -1. La aplicación debe mostrar, finalmente, los puntos
        // ordenados de los participantes.

        int[] puntuacionProgramadores = new int[8];
        Arrays.sort(puntuacionCinco(puntuacionProgramadores), 0,5);
        System.out.println(Arrays.toString(puntuacionProgramadores));

    }
    public static int[] puntuacionCinco(int[] puntuacionProgramadores){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la puntuacion de los 5 programadores: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Puntuación programador "+(i+1)+": ");
            puntuacionProgramadores[i]= entrada.nextInt();
        }
        return puntuacionProgramadores;
    }

}
