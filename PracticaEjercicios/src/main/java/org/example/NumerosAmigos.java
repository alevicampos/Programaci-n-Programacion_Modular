package org.example;

import java.util.Scanner;

public class NumerosAmigos {
    public void numerosamigos(){
        // Escribir una función que decida si dos números enteros positivos son amigos.
        // Dos numeros son amigos si la suma de sus divisores propios(distintos de ellos mismos)
        // son iguales.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numUno = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numDos = entrada.nextInt();
        System.out.println("Los números "+numUno+" y "+numDos+" son amigos: "+comprobarAmistad(numUno, numDos));

    }
    public static boolean comprobarAmistad(int numUno, int numDos){
        boolean sonAmigos;
        if( numUno == sumaDivisoresPropios(numDos) && numDos == sumaDivisoresPropios(numUno) ){
            sonAmigos = true;
        }else{
            sonAmigos = false;
        }
        return sonAmigos;
    }
    public static int sumaDivisoresPropios(int numero){
        int suma= 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
// Un número amigo de si mismo se dice que es perfecto, como 6, 28, 496...
