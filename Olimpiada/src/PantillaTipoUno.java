import java.util.Scanner;

public class PantillaTipoUno {
    static Scanner teclado;

    public static void casoDePrueba() {

        String datos = teclado.nextLine();


    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

        String palabra = teclado.next();

    }
}
