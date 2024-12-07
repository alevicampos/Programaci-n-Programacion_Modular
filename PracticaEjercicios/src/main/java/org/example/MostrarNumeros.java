package org.example;

import java.util.Scanner;

public class MostrarNumeros {
    public void mostrarnumeros(){
        // Escribir una función a la que se le pasen dos números enteros
        // y muestre todos los números comprendidos entre ellos.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = entrada.nextInt();
        mostrarNumeros(num1,num2);

    }

    public static void mostrarNumeros(int num1, int num2){
        int mayor = 0;
        int menor = 0;
        if(num1 > num2){
           mayor = num1;
           menor = num2;
        }else {
            mayor = num2;
            menor = num1;
        }

        for (int i = menor+1; i < mayor ; i++) {
            System.out.print(i+" ,");
        }
    }
}
