package org.example;

import java.util.Scanner;

public class CorrespondenciaVocal {
    public void correspondenciavocal(){
        // Crear una función que, mediante un booleano, indique si
        // el carácter que se le pasa como parámetro de entrada corresponde
        // con una vocal.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        String letra = entrada.next().toUpperCase();
        System.out.println("La " +letra+ " es una vocal: "+ comprobarVocal(letra));


    }
    public static boolean comprobarVocal(String letra){
        boolean esVocal = true;
        if(letra.equals("A")|| letra.equals("E")|| letra.equals("I")||letra.equals("O")||letra.equals("U"))
            esVocal = true;
        else
            esVocal = false;
        return esVocal;
    }
}
