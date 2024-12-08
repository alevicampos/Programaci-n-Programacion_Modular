package org.example;

import java.util.Arrays;

public class SinRepetidos {
    public void sinrepetidos(){
        // Implementar la funcion tablaSinRepetidos() que construye y devuelve
        // una tabla del tamaño apropiado, con los elementos del array original
        // donde se han eliminado los repetidos.

        int[] numeros = {1,2,3,2,1,3,5,2,3,4};
        // hago una copia de la tabla
        int[] copia = hacerCopia(numeros);
        System.out.println(Arrays.toString(quitarRepetidos(copia)));

    }
    public static int[] quitarRepetidos(int[] copia){
        int numElem = copia.length;
        int indice= 0;

        while (indice < numElem){
            int aBuscar = copia[indice];
            int indiceDos= 0;
            while (indiceDos<indice && copia[indiceDos] != aBuscar ){
                indiceDos++;

            }
            if (indiceDos<indice ){
                copia[indice]= copia[numElem-1];

                numElem--;
            }else{
                indice++;
            }

        }
       return Arrays.copyOf(copia, numElem);
        }

    public static int[] hacerCopia(int[] numeros){
        return  Arrays.copyOf(numeros, numeros.length);

    }
}
