import java.util.Scanner;

public class HolaMundo {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int casos = teclado.nextInt();


        for (int i = 1; i <= casos; i++) {
            System.out.println("Hola mundo.");
        }
    }
}

