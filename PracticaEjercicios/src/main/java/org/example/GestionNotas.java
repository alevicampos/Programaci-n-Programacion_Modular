package org.example;

import java.util.Scanner;

public class GestionNotas {

    public void gestionNotas() {
        // Queremos desarrollar una aplicación que nos ayude a gestionar las notas
        // de un centro. Cada clase está compuesta por 5 alumnos. Se pide leer las notas
        // del primer, segundo y tercer trimestre de una clase. Debemos mostrar al final
        // la nota media del grupo de cada trimestre, y la media del alumno que se encuentra
        // en la posición que se lee por teclado.

        Scanner entrada = new Scanner(System.in);
        final int CANTIDAD_ALUMNOS = 5;

        // Creo las tablas que necesito para albergar los datos:
        int[] primerTrimestre = new int[CANTIDAD_ALUMNOS];
        int[] segundoTrimestre = new int[CANTIDAD_ALUMNOS];
        int[] tercerTrimestre = new int[CANTIDAD_ALUMNOS];

        // Relleno las tablas solicitando las notas al usuario:
        System.out.println("Introduce las notas del primer trimestre:");
        leerNotas(primerTrimestre);
        System.out.println("Introduce las notas del segundo trimestre:");
        leerNotas(segundoTrimestre);
        System.out.println("Introduce las notas del tercer trimestre:");
        leerNotas(tercerTrimestre);

        // Calculo las medias por trimestre
        double mediaPrimerTrimestre = calcularMedia(primerTrimestre);
        double mediaSegundoTrimestre = calcularMedia(segundoTrimestre);
        double mediaTercerTrimestre = calcularMedia(tercerTrimestre);

        // Muestro las medias
        System.out.println("Media del primer trimestre: " + mediaPrimerTrimestre);
        System.out.println("Media del segundo trimestre: " + mediaSegundoTrimestre);
        System.out.println("Media del tercer trimestre: " + mediaTercerTrimestre);

        // Solicito al usuario la posición del alumno para calcular su media
        System.out.print("Introduce la posición del alumno (1 a 5) para calcular su media: ");
        int posicion = entrada.nextInt() - 1; // Restamos 1 puesto que los índices empiezan por 0;

        if (posicion >= 0 && posicion < CANTIDAD_ALUMNOS) {
            double mediaAlumno = (primerTrimestre[posicion] + segundoTrimestre[posicion] + tercerTrimestre[posicion]) / 3.0;
            System.out.println("La media del alumno en la posición " + (posicion+1) + " es: " + mediaAlumno);
        } else {
            System.out.println("Posición no válida.");
        }
    }

    // Método para leer las notas de un trimestre
    public static void leerNotas(int[] trimestre) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < trimestre.length; i++) {
            System.out.println("Nota del alumno "+ (i + 1) + ": ");
            trimestre[i] = entrada.nextInt();
        }
    }

    // Método para calcular la media de un trimestre
    public static double calcularMedia(int[] notas) {
        int sumaNotas = 0;
        for (int nota : notas) {
            sumaNotas += nota;
        }

        return (double) sumaNotas / notas.length;
    }
}

