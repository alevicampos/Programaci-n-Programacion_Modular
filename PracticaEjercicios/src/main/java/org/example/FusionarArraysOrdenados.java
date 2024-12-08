package org.example;

import java.util.Arrays;

public class FusionarArraysOrdenados {
    public void fusionararraysordenados(){

        int[] arrayUno = {1,3,5};
        int[] arrayDos = {2,4,6};
        int[] arrayResultante = new int[6];
        System.out.println(Arrays.toString(insertarArrays(arrayUno,arrayDos,arrayResultante)));
    }

    public static int[] insertarArrays(int[] arrayUno, int[] arrayDos, int[] arrayResultante){
        int indiceUno= 0;
        int indiceDos= 0;
        int indiceResultante = 0;
        while ( indiceUno< arrayUno.length && indiceDos< arrayDos.length){
            if (arrayUno[indiceUno]<arrayDos[indiceDos]){
                arrayResultante[indiceResultante]= arrayUno[indiceUno];
                indiceUno++;
            }else{
                arrayResultante[indiceResultante]= arrayDos[indiceDos];
                indiceDos++;
            }
indiceResultante++;
        }
        if(indiceUno == arrayUno.length) {
            arrayResultante[indiceResultante]= arrayDos[indiceDos];
            indiceDos++;
            indiceResultante++;
        }else{
            while (indiceUno< arrayUno.length){
                arrayResultante[indiceResultante] = arrayUno[indiceUno];
                indiceUno++;
                indiceResultante++;
            }
        }
        return arrayResultante;
    }
}
