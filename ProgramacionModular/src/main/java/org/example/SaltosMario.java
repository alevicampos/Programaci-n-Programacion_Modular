package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SaltosMario {
    public void saltosmario(){
        int muros = pedirMuros();
        int[] alturaMuros = pedirAlturaMuros(muros);
        System.out.println(Arrays.toString(alturaMuros));
    }

    public static int pedirMuros(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de muros: ");
        int muros = entrada.nextInt();
        return muros;
    }
    public static int[] pedirAlturaMuros(int muros){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la altura de los muros: ");
        int alturaTodos = entrada.nextInt();
        String alturas = Integer.toString(alturaTodos);
        String[] alturaMuros = alturas.split("");
        int[] alturaMurosEntero = new int[alturaMuros.length];
        for (int i = 0; i < alturaMuros.length; i++) {
            alturaMurosEntero[i] = Integer.parseInt(alturaMuros[i]);
        }
        return alturaMurosEntero;
    }



}
