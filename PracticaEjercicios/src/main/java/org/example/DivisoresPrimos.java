package org.example;

import java.util.Scanner;

import static org.example.NumeroPrimo.comprobarPrimo;

public class DivisoresPrimos {
    public void divisoresprimos(){
    // Implementar la función divisoresPrimos() que muestra, por consola.
    // todos los divisores primos del número que se le pasa por parámetro.

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        comprobarPrimo(numero);
        calcularDivisoresPrimos(numero);
    }
    public static void calcularDivisoresPrimos(int numero){
        System.out.print("Divisores primos de "+numero+ ": ");
        for (int i = 1; i <= numero; i++) {
            if (comprobarPrimo(i) && numero % i == 0){
                System.out.print(i + ", ");
            }
        }
    }

}
