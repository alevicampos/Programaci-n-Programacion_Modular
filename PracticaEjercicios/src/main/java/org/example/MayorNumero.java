package org.example;

import java.util.Scanner;

public class MayorNumero {
    public void mayornumero(){
        // Diseñar una función que reciba como parámetros dos números enteros
        // y que devuelva el máximo (el mayor de los dos).

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numeroUno = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numeroDos = entrada.nextInt();
        System.out.println("El número mayor es: " +calcularMayor(numeroUno, numeroDos));
    }

    public static int calcularMayor(int numeroUno, int numeroDos){
        int numeroMayor;
        if (numeroUno> numeroDos){
            numeroMayor= numeroUno;
        }else{
            numeroMayor= numeroDos;
        }

        return numeroMayor;
    }
}
