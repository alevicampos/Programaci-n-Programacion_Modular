package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CamaraSecreta {
    public void camarasecreta(){
        // Desarrollar el juego de la camara secreta, que consiste en abrir una cámara 
        // mediante su combinación secreta, que esta formado por una combinacion de digitos del uno al cinco
        // El jugador especificará cuál es la longitud de la combinación. 
        // La combinación genera de manera aleatoria, una combinacion secreta que el usuario tendrá que acertar.
        // En cada intento se muestra como pista, para cada dígito de la combinación introducida por el jugador,
        // si es mayor, menor o igual que el correspondiente en la combinación secreta.



        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuál es la longitud de la combinación? ");
        int longitud = entrada.nextInt();
        
        int[] combinacionSecreta = new int[longitud];
        int[] combinacionUsuario = new int[longitud];


        for (int i = 0; i < longitud; i++) {
            Random random = new Random();
            combinacionSecreta[i]= random.nextInt(9)+1;
        }
        System.out.println(Arrays.toString(combinacionSecreta));

        do {
            System.out.println("Introduce tu combinación: ");
            for (int i = 0; i < combinacionUsuario.length; i++) {
                combinacionUsuario[i] = entrada.nextInt();
            }
            System.out.println(Arrays.toString(combinacionUsuario));


            for (int i = 0; i < combinacionSecreta.length; i++) {
                if (combinacionSecreta[i] > combinacionUsuario[i]) {
                    System.out.println("La combinacion introducida es menor");

                } else if (combinacionSecreta[i] < combinacionUsuario[i]) {
                    System.out.println("La combinación intoducida es mayor");

                } else {
                    System.out.println("Igual");
                }
            }
        }while(!Arrays.equals(combinacionSecreta, combinacionUsuario));
    }



}
