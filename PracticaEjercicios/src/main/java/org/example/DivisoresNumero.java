package org.example;

import java.util.Scanner;

public class DivisoresNumero {
    public void divisoresnumero(){
        // Escribir una función a la que se le pase un número entero
        // y devuelva el número de divisores primos que tiene.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();

        System.out.println("El numero "+numero+ " tiene " +calcularDivisores(numero)+ " divisores primos.");
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
    public static int calcularDivisores( int numero){
        int contadorDivisores = 1;
        for (int i = 2; i <= numero ; i++) {
            if(comprobarPrimo(i) && numero % i ==0){
                contadorDivisores++;

        }
        }

        return contadorDivisores;
    }

}
