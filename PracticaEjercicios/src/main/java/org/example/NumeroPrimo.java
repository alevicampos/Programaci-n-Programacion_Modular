package org.example;

import java.util.Scanner;

public class NumeroPrimo {
    public void numeroprimo(){
        // Diseñar una función que nos diga si un número es primo o no

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = entrada.nextInt();
        System.out.println("El numero " + numero + " es primo: "+ comprobarPrimo(numero));


    }
    public static boolean comprobarPrimo(int numero) {
        boolean esPrimo= true;

        if (numero < 2) {
            esPrimo = false;
        }
        int i= 2;
        while (i  < numero && esPrimo == true){
            if (numero % i ==0){
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
    }
}
