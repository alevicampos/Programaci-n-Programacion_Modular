
import java.util.Arrays;
import java.util.Scanner;


public class JuegosEnCintas {

    static Scanner teclado;

    public static boolean casoDePrueba() {
        if (!teclado.hasNext()) {
            return false;
        } else {
            JuegosEnCintas juegos = new JuegosEnCintas();
            juegos.juegosencintas(); // Llama al método principal para resolver el caso
            return true;
        }
    }


    public void juegosencintas() {
        // Uso del scanner global "teclado"
        int tamanoCara = 0;
        int numJuegos = 0;

        // Solicita el tamaño de las caras y el número de juegos


                tamanoCara = teclado.nextInt();
                numJuegos = teclado.nextInt();


        // Solicita las duraciones de los juegos
        int[] duraciones = new int[numJuegos];

        for (int i = 0; i < numJuegos; i++) {
                    duraciones[i] = teclado.nextInt();
                }


        // Verifica si es posible grabar los juegos en la cinta
        if (esPosibleGrabar(duraciones, tamanoCara)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }


    public static boolean esPosibleGrabar(int[] juegos, int tamanoCara) {
        Arrays.sort(juegos); // Ordena los juegos de menor a mayor
        invertirArray(juegos); // Invierte el array para orden descendente

        int espacioCaraA = tamanoCara;
        int espacioCaraB = tamanoCara;

        // Asigna los juegos al espacio disponible en las dos caras
        for (int juego : juegos) {
            if (juego <= espacioCaraA) {
                espacioCaraA -= juego;
            } else if (juego <= espacioCaraB) {
                espacioCaraB -= juego;
            } else {
                return false; // El juego no cabe en ninguna de las caras
            }
        }

        return true;
    }

    public static void invertirArray(int[] juegos) {
        for (int i = 0, j = juegos.length - 1; i < j; i++, j--) {
            int aux = juegos[i];
            juegos[i] = juegos[j];
            juegos[j] = aux;
        }
    }


    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}

