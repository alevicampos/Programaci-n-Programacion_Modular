package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenInverso {
    public void ordeninverso(){
        // Escribir una aplicación que solicite al usuario cuántos números desea introducir
        // A continuación, se introducirá por teclado esa cantidad de números enteros,
        // y por último, los mostrará en el orden inverso al introducido.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos numeros desea introducir? ");
        int cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Introduce el número:");
            numeros[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        int[] numerosInvertidos = new int[numeros.length];
        for (int i = 0, j= numeros.length-1; i < numeros.length; i++) {
            numerosInvertidos[i]= numeros[j];
            j--;
        }
        System.out.println(Arrays.toString(numerosInvertidos));

    }
}
