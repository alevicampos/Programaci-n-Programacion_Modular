import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que intenta determinar si es posible grabar
 * una lista de juegos en una cinta con dos caras.
 *
 * @author Alejandra Campos Zamora
 * @version 1.1
 * @fecha 12/12/2024
 */
public class JuegosEnCintas {

    static Scanner entrada;

    /**
     * Método para procesar cada caso de prueba.
     * @return true si hay más casos de prueba, false en caso contrario.
     */
    public static boolean casoDePrueba() {
        if (!entrada.hasNext()) {
            return false;
        } else {
            JuegosEnCintas juegos = new JuegosEnCintas();
            juegos.juegosEnCintas();
            return true;
        }
    }

    /**
     * Método principal que contiene la lógica para leer y procesar los datos.
     */
    public void juegosEnCintas() {
        int tamanoCara = 0;
        int numJuegos = 0;

        // Solicitar el tamaño de la cara
        while (true) {
            try {
                tamanoCara = entrada.nextInt();
                if (tamanoCara < 1 || tamanoCara > 100000000) {
                    System.out.println("El tamaño de la cara debe estar entre 1 y 10^8. Inténtalo de nuevo.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR!. Debes introducir un número entero.");
                entrada.nextLine(); // Limpiar el búffer
            }
        }

        // Solicitar el número de juegos
        while (true) {
            try {
                numJuegos = entrada.nextInt();
                if (numJuegos < 1 || numJuegos > 8) {
                    System.out.println("El número de juegos debe estar entre 1 y 8. Inténtalo de nuevo.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Introduce un número entero.");
                entrada.nextLine(); // Limpiar el búffer
            }
        }

        // Solicitar las duraciones de los juegos
        int[] duraciones = new int[numJuegos];
        entrada.nextLine(); // Limpiar el búffer

        while (true) {
            try {
                String duracionesUsuario = entrada.nextLine();

                // Control de formato con matches para asegurarme que el usuario introduce las duraciones de manera correcta.

                if (!duracionesUsuario.matches("(\\d+\\s*){" + numJuegos + "}")) {
                    System.out.println("Debes introducir " + numJuegos + " duraciones, separadas por espacios. Inténtalo de nuevo.");
                    continue;
                }

                String[] duracionArray = duracionesUsuario.split(" ");

                boolean duracionValida = true;
                for (int i = 0; i < numJuegos; i++) {
                    duraciones[i] = Integer.parseInt(duracionArray[i]);
                    if ( duraciones[i] < 1 || duraciones[i] > 100000000) {
                        duracionValida = false;
                    }
                }

                if (!duracionValida) {
                    System.out.println("Todas las duraciones deben estar entre 1 y 10^8. Inténtalo de nuevo.");
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Introduce números enteros separados por espacios.");
            }
        }

        // Verificar si es posible grabar los juegos en la cinta
        if (esPosibleGrabar(duraciones, tamanoCara)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * Método que determina si los juegos pueden ser grabados en las dos caras de la cinta.
     * @param juegos array con las duraciones de los juegos.
     * @param tamanoCara Tamaño máximo de cada cara de la cinta.
     * @return true si es posible grabar los juegos, false en caso contrario.
     */
    public static boolean esPosibleGrabar(int[] juegos, int tamanoCara) {
        Arrays.sort(juegos); // Ordenar los juegos de menor a mayor

        int espacioCaraA = tamanoCara;
        int espacioCaraB = tamanoCara;

        for (int i = juegos.length - 1; i >= 0; i--) {
            if (juegos[i] <= espacioCaraA) {
                espacioCaraA -= juegos[i];
            } else if (juegos[i] <= espacioCaraB) {
                espacioCaraB -= juegos[i];
            } else {
                return false; // No cabe en ninguna cara
            }
        }

        return true;
    }

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        while (casoDePrueba()) {
            // Continuar mientras haya más casos de prueba
        }
    }
}




