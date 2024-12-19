import java.util.Scanner;

public class VerificacionEntradas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();

        for (int caso = 0; caso < numCasos; caso++) {

            String numero = teclado.next();


            String[] arrayNumero = numero.split("");

            int sumaTotal = 0;


            for (int i = 0; i < numero.length(); i++) {
                int digitoActual = Integer.parseInt(arrayNumero[i]);

                if ((i + 1) % 2 != 0) {
                    int menorDerecha = 9;
                    for (int j = i + 1; j < numero.length(); j++) {
                        int digitoDerecha = Integer.parseInt(arrayNumero[j]);
                        if (digitoDerecha < menorDerecha) {
                            menorDerecha = digitoDerecha;
                        }
                    }

                    if (i == numero.length() - 1) {
                        menorDerecha = 0;
                    }
                    sumaTotal += (digitoActual * 3) + menorDerecha;

                } else {
                    int mayorIzquierda = 0;
                    for (int j = 0; j < i; j++) {
                        int digitoIzquierda = Integer.parseInt(arrayNumero[j]);
                        if (digitoIzquierda > mayorIzquierda) {
                            mayorIzquierda = digitoIzquierda;
                        }
                    }

                    sumaTotal += (digitoActual * 2) + mayorIzquierda;
                }
            }

            System.out.println(sumaTotal);
        }

    }
}


