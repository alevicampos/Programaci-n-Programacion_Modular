import java.util.Scanner;

public class PlazasDisponiblesMundial {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();

        for (int i = 0; i < numCasos; i++) {

            int numeroEquipos = teclado.nextInt();


            int sumaPlazas = 0;
            for (int j = 0; j < 6; j++) {
                sumaPlazas += teclado.nextInt();
            }

            int plazasRepesca = numeroEquipos - sumaPlazas;
            System.out.println(plazasRepesca);
        }
    }
}

