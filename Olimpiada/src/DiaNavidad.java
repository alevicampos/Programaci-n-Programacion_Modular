import java.util.Scanner;

public class DiaNavidad {
    static Scanner teclado;

    public static void casoDePrueba() {

        int dia = teclado.nextInt();
        int mes = teclado.nextInt();

        if( dia==25&& mes == 12){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }


    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
