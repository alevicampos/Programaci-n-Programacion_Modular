package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosDecimales {
    public void numerosdecimales(){
        // Diseñar un programa que solicite al usuario que introduzca por teclado
        // 5 números decimales a continuación, debe mostrar los números
        // en el mismo orden que se han introducido.

        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.print("Introduce el numero " +(i+1)+": ");
            numeros[i]= entrada.nextDouble();
        }
        System.out.println(Arrays.toString(numeros));



    }
}
