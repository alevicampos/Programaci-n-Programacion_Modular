package org.example;

import java.util.Scanner;

public class FuncionEco {
    public void funcioneco(){
        //Diseñar la funcion eco() a la que se le pasa como parámetro un numero n,
        //y muestra por pantalla n veces el mensaje.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = entrada.nextInt();
        eco(numero);


    }
    public static void eco(int numero){
        for (int i = 0; i < numero; i++) {
            System.out.println("Eco...");
        }
    }
}
