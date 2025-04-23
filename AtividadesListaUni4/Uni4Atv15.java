import java.util.Scanner;

public class Uni4Atv15 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int atedoze = 5;
        int trezeatequarentaeoito = 7;

        System.out.println("Informe a quantos meses o funcionário foi admitido: ");
        int meses = teclado.nextInt();

        if (meses >= 1 && meses <= 12){
            System.out.println("O funcionário irá receber " + atedoze + "% de reajuste.");
        }
        else if (meses >= 13 && meses <= 48){
            System.out.println("O funcionário irá receber " + trezeatequarentaeoito + "% de reajuste.");
        }
        
        teclado.close();

    }
}
