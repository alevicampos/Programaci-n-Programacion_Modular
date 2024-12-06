package org.example;

import java.util.Scanner;

public class MenuOpciones {
    public void menuopciones(){
        int opcion= imprimirOpciones();
        comprobarOpcion(opcion);


    }
    public static int imprimirOpciones(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                BIENVENIDO A NUESTRO RESTAURANTE
                Seleccine el numero de la opción deseada:
                \t 1. Comida
                \t 2. Bebida
                \t 3. Salir
                """);
        return entrada.nextInt();
    }
    public static void comprobarOpcion(int opcion){
        String pedido= "";
        if (opcion == 1){
            pedido= pedirComida();
        } else if (opcion == 2) {
            pedido = pedirBebida();
        } else if (opcion == 3) {
            System.out.println("Gracias por visitarnos. Hasta pronto!");
            System.exit(0);
        } else{
            System.out.println("La opción no es válida.");
            System.exit(0);
        }
    }
    public static String pedirComida(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qué desea comer? ");
        return entrada.nextLine();
    }
    public static String pedirBebida() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué edad tienes? ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        String bebida = "";

        if (edad >= 18) {
            System.out.println("¿Qué desea beber?");
            bebida = entrada.nextLine();
        } else {
            System.out.println("No puedes comprar bebida. ");
            System.exit(0);
        }
        return bebida;
    }
    }




