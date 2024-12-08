package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class GestionNotas {
    public void gestionnotas(){
        // Queremos desarrollar una aplicación que nos ayude a gestionar las notas
        // de un centro. Cada clase está compuesta por 5 alumnos. Se pide leer las notas
        // del primer, segundo y tercer trimestre de una clase. Debemos mostrar al final
        // la nota media del grupo de cada trimestre, y la media del alumno que se encuentra
        // en la posición que se lee por teclado.

        Scanner entrada = new Scanner(System.in);
        final int CANTIDADALUMNOS = 5;


        // creo las tablas que necesito para albergar los datos:

        int[] primerTrimestre = new int[CANTIDADALUMNOS];
        int[] segundoTrimestre = new int[CANTIDADALUMNOS];
        int[] tercerTrimestre = new int[CANTIDADALUMNOS];

        // Relleno las tablas solicitando las notas al usuario:

        System.out.println("Notas del primer trimestre");
        leernotas(primerTrimestre);
        System.out.println("Notas del segundo trimestre");
        leernotas(segundoTrimestre);
        System.out.println("Notas del tercer trimestre");
        leernotas(tercerTrimestre);

        // calculo las medias
        int sumaPrimerTrimestre = 0;
        int sumaSegundoTrimestre = 0;
        int sumaTercerTrimestre = 0;




    }

    // Implemento un método para leer las notas:

    public static int[] leernotas(int[] trimeste){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <trimeste.length ; i++) {
            trimeste[i] = entrada.nextInt();
        }
        return trimeste;
    }

    // Implemento un método para sumar las notas:

    public static int sumarNotas(int[] notas){
        int sumaNotas= 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }
        return sumaNotas;
    }
    //CONTINUAR!



}
