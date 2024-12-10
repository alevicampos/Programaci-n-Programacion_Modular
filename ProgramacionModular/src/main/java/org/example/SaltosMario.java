package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SaltosMario {
    public void saltosmario(){
        int muros = pedirMuros();
        int[] alturaMuros = pedirAlturaMuros(muros);
        System.out.println(Arrays.toString(alturaMuros));

        // nuevo array para incluir la posición inicial
        int[] todosMuros = new int[alturaMuros.length+1];
        todosMuros[0]= 1;
        // copio los valores del array inicial al nuevo
        System.arraycopy(alturaMuros, 0,todosMuros,1,alturaMuros.length);
        System.out.println(Arrays.toString(todosMuros));
        // establezco un contador para los saltos hacia arriba
        // y otro para los saltos hacia abajo
        int saltosArriba= 0;
        int saltosAbajo= 0;


        for (int i = 0; i < todosMuros.length-1; i++) {
            if (todosMuros[i]< todosMuros[i+1]){
                saltosArriba++;
            } else if (todosMuros[i]>todosMuros[i+1]) {
                saltosAbajo++;
            }
        }
        System.out.println(saltosArriba+" "+saltosAbajo);


        for (int i = 0; i < alturaMuros.length; i++) {


        }
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
