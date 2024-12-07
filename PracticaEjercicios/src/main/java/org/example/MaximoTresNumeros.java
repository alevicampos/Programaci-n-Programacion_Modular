package org.example;

public class MaximoTresNumeros {
    public void maximotresnumeros(){
        // Repetir el ejercicio anterior con una version que calcule
        // el máximo de tres números.
        int numeroMayor = calcularMaximoTres(2, 9,7);
        System.out.println("El numero mayor es: " + numeroMayor);
    }
    public int calcularMaximoTres(int numUno, int numDos, int numTres){
        int auxiliar = calcularMaximoDos(numUno, numDos);
        return (calcularMaximoDos(auxiliar, numTres));
    }
    public int calcularMaximoDos(int numUno, int numDos){
        int numeroMayor;
        if (numUno> numDos){
            numeroMayor= numUno;
        }else{
            numeroMayor= numDos;
        }

        return numeroMayor;
    }

}
