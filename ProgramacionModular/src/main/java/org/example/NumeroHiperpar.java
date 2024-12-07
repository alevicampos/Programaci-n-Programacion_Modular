package org.example;

import java.util.Scanner;

public class NumeroHiperpar {
    public void numerohiperpar() {
        int numero = pedirNumero();
        String[] numeros = convertirArray(numero);
        String resultado = comprobarPar(numeros);
        System.out.println(resultado);
    }


    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.print("Introduzca un numero: ");
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println("Debe introducir un número positivo ");
                    System.exit(0);
                }
            } else {
                System.out.println("Debe introducir un número.");
                entrada.next();
            }
        }
    }

    public static String[] convertirArray(int numero) {
        String textoNumero = Integer.toString(numero);
        return textoNumero.split("");
    }

    public static String comprobarPar(String[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (Integer.parseInt(numeros[i]) % 2 != 0) {
                return "NO";
            }
        }
        return "SI";
    }

}
