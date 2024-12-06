package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ventas {
    public void ventas(){
        float[] ventas = introducirVentas();
        System.out.println(Arrays.toString(ventas));
        calcularDiaMasVenta(ventas);
        calcularDiaMenosVenta(ventas);
        float media= calcularMediaSemanal(ventas);
        String resultado = verificarVentaDomingo(ventas, media);
        System.out.print(" " +resultado);
    }

    public static float[] introducirVentas(){
        Scanner entrada = new Scanner(System.in);
        float[] ventas = new float[6];
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = entrada.nextFloat();
            if (ventas[i] == -1) {
                System.exit(0);
            }
        }

        return ventas;
    }

    public static int calcularDiaMasVenta(float[] ventas) {
        int diaVentaMayor = 0;
        float indiceAuxiliar = ventas[0];

        for (int i = 0; i < ventas.length - 1; i++) {
            if (ventas[i] > indiceAuxiliar) {
                diaVentaMayor = i;
            }
        }
        imprimirResultado(diaVentaMayor);
        return diaVentaMayor;
    }
    public static int calcularDiaMenosVenta(float[] ventas) {
        int diaVentaMenor=0;
        float indiceAuxiliar = ventas[0];
        for (int i = 0; i < ventas.length - 1; i++) {
            if (ventas[i] < indiceAuxiliar) {
                diaVentaMenor = i;
            } 
        }
        imprimirResultado(diaVentaMenor);
        return diaVentaMenor;
    }
    public static float calcularMediaSemanal(float[]ventas){
        float sumaVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            sumaVentas += ventas[i];
        }
        float media = sumaVentas/6;
        return media;
    }

    public static String verificarVentaDomingo(float[]ventas, float media){
        float ventaDomingo = ventas[5];
        if (ventaDomingo>media){
            return "SI";
        }else {
            return "NO";
        }
    }


    public static void imprimirResultado(int diaVentaMayor){
        if (diaVentaMayor == 0) {
            System.out.print("MARTES ");
        } else if (diaVentaMayor == 1) {
            System.out.print("MIERCOLES ");
        } else if (diaVentaMayor == 2) {
            System.out.print("JUEVES ");
        } else if (diaVentaMayor == 3) {
            System.out.print("VIERNES ");
        } else if (diaVentaMayor == 4) {
            System.out.print("SÁBADO ");
        } else {
            System.out.print("DOMINGO ");
        }
    }
    }






