package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {
    static Scanner teclado = new Scanner(System.in);
    public void cuadrado(){
        int numero = pedirNumero();

        if (numero == -1){
            System.exit(0);
        }
        if(validarNumero(numero)){
            System.out.println("El cuadrado de "+ pedirNumero()+" es:"+ calcularCuadrado(numero));
        }else{
            System.out.println("Formato no valido");
        }


    }
    public static int pedirNumero(){
        System.out.println("Introduce un número");
        int numero;
        try {
            numero = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error de formato");
            numero= -1;
        }
        return numero;
    }
    public static boolean validarNumero(int numero){
        if (Integer.toString(numero).matches("\\d(1,8)")){
            return true;
        }else {
            return false;
        }
    }
    public static int calcularCuadrado(int numero){
        int cuadrado = numero*numero;
        return cuadrado;
    }
}
