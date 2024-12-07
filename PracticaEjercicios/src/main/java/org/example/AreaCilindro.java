package org.example;

import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaCilindro {
    public void areacilindro() {

        // Realizar una función que calcule y muestre el área o el volumen
        // de un cilintro, según se especifique. Para distinguir un caso
        // de otro se le pasará un número 1 ( para área) o 2 (para el volumen).
        // Además, hemos de pasarle a la función el radio de la base y la altura.
        // area = 2π * radio * (altura+radio)
        // volumen = π * radio² * altura

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 1 para calcular el area o 2 para el volumen: ");
        int opcion = entrada.nextInt();
        System.out.println("Introduce el radio de la base del cilindro: ");
        int radio = entrada.nextInt();
        System.out.println("Introduce la altura del cilindro: ");
        int altura = entrada.nextInt();
        if(opcion == 1) {
            System.out.println("El área del cilindro es: " + calcularArea(radio, altura));

        } else if (opcion==2) {
            System.out.println("El volumen del cilindro es:" + calcularVolumen(radio,altura));
        }else{
            System.out.println("La opción introducida no es correcta");
        }

    }
    public static double calcularArea(int radio, int altura ){
        return 2 * PI * radio * (altura+radio);
    }
    public static double calcularVolumen(int radio, int altura ) {

    return PI * radio * radio * altura;
    }
}
