import java.util.Scanner;

public class EligiendoSede {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int numero = pedirNumero(); // Pedir número de votos

            if (numero == 0) {
                System.exit(0); // Terminar si el número es 0
            }

            // Arreglos para candidaturas y sus conteos
            String[] candidaturas = new String[numero];
            int[] conteos = new int[numero];
            int numCandidaturas = 0;

            // Procesar votos
            for (int i = 0; i < numero; i++) {
                String voto = teclado.next().trim(); // Leer el voto
                boolean encontrada = false;

                // Buscar si la candidatura ya existe
                for (int j = 0; j < numCandidaturas; j++) {
                    if (candidaturas[j].equals(voto)) { // Comparar correctamente
                        conteos[j]++; // Incrementar su contador
                        encontrada = true;
                        break;
                    }
                }

                // Si no se encuentra, agregarla
                if (!encontrada) {
                    candidaturas[numCandidaturas] = voto;
                    conteos[numCandidaturas] = 1;
                    numCandidaturas++;
                }
            }

            // Determinar la candidatura con más votos
            int maxVotos = 0;
            String ganador = "";
            boolean empate = false;

            for (int i = 0; i < numCandidaturas; i++) {
                if (conteos[i] > maxVotos) {
                    maxVotos = conteos[i];
                    ganador = candidaturas[i];
                    empate = false; // Resetear el empate
                } else if (conteos[i] == maxVotos) {
                    empate = true; // Marcar un empate
                }
            }

            // Mostrar el resultado
            if (empate) {
                System.out.println("EMPATE");
            } else {
                System.out.println(ganador);
            }
        }
    }

    public static int pedirNumero() {
        return teclado.nextInt();
    }
}

