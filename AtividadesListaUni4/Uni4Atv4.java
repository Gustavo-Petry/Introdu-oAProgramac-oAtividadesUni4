import java.util.Scanner;

public class Uni4Atv4 {
    public static void main(String[] args) throws Exception {
      
        Scanner teclado = new Scanner(System.in);

        System.out.println("entre com um valor inteiro ou decimal!");
        double entrada = teclado.nextDouble();
        double valor = entrada % 1;

        if(valor == 0){
        System.out.println("O valor é inteiro");
        }
        else{
        System.out.println("O valor é decimal!");

        }

        teclado.close();
    }
}
