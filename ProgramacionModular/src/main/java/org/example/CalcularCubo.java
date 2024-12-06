package org.example;

import java.util.Scanner;

public class CalcularCubo {
    public void calcularcubo(){

        int numero = pedirNumero();
        int cubo = calcularCubo(numero);
        imprimirNumero(numero, cubo);
    }

    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        return entrada.nextInt();
    }

    public static int calcularCubo(int numero){
        return numero*numero*numero;
    }

    public static void imprimirNumero(int numero, int cubo){
        System.out.println("El cubo del número " + numero + " es: " + cubo);
    }

}
