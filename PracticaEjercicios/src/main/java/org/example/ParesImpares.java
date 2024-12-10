package org.example;

import java.util.Arrays;

public class ParesImpares {
    public void paresImpares(){
        //Leer y almacenar n números enteros en una tabla, a partir
        // de la que se construirán otras dos tablas con los elementos con valores
        // pares e impares de la primera, respectivamente.

        int[] tabla = {1,2,3,4,5,6};
        int[] pares = new int[contarPares(tabla)];
        int[] impares = new int[tabla.length-contarPares(tabla)];
        System.out.println(Arrays.toString(asignarPares(tabla,pares)));


    }
    // Primero voy a contar los numeros pares para crear las tablas contenedoras

    public static int contarPares(int[] tabla){
        int contadorPares = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }
    // Ahora voy a asignar los valores pares a la tabla pares
    public static int[] asignarPares(int[] tabla, int[] pares){
        int indiceAuxiliar=0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] %2 ==0){
                pares [indiceAuxiliar] = tabla[i];
                indiceAuxiliar++;
            }
        }
        return pares;
    }
}
