package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Cadenas {
    public void cadenas(){
        String cadena = introducirCadena();
        String cadenaMayusculas = convertirMayusculas(cadena);
        String[] arrayCadena = cadenaMayusculas.split("");
        contarVocales(arrayCadena);



    }
    public static String introducirCadena(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.nextLine();
        return cadena;

    }
    public static String convertirMayusculas(String cadena){

        String cadenaMayusculas =  cadena.toUpperCase();
        System.out.println(cadenaMayusculas);
        return cadenaMayusculas;
    }
    public static int contarVocales(String[] arrayCadena){
        int contadorVocales = 0;
        for (int i = 0; i < arrayCadena.length; i++) {
            if (arrayCadena[i].equals("A") || arrayCadena[i].equals("E") || arrayCadena[i].equals("I") || arrayCadena[i].equals("O") || arrayCadena[i].equals("U")) {
                contadorVocales++;
            }
        }
        System.out.println("Hay un total de: " +contadorVocales);
        return contadorVocales;

    }
}
