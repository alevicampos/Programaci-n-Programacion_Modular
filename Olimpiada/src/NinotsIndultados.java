import java.util.Scanner;

public class NinotsIndultados {


    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = pedirNumero();

        if (numero == 0) {
            System.exit(0);
        } else {
            int contadorInfantil= 0;
            int contadorAdulto= 0;
            String ninotAdulto=" ";
            String ninotInfantil = "";
            for (int i = 0; i < numero; i++) {
                String ninot = teclado.next();
                if(ninot.equals(ninot.toUpperCase())){
                    contadorAdulto++;
                    ninotAdulto= ninot;
                }else{
                    contadorInfantil++;
                    ninotInfantil= ninot;
                }
            }
            if( contadorAdulto > contadorInfantil){
                System.out.println(ninotAdulto+" "+ninotInfantil);
            } else if (contadorAdulto < contadorInfantil) {
                System.out.println(ninotAdulto+" "+ninotInfantil);

            }else{
                if ()
                System.out.println("empate");
            }


        }

    }
        public static int pedirNumero () {

            int numero = teclado.nextInt();

            return numero;

        }
    }