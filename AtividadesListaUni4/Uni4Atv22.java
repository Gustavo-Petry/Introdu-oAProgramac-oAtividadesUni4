import java.util.Scanner;

public class Uni4Atv22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "Entre com o seu curso: 1. Ciência da Computação, 2. Licenciatura da Computação e 3. Sistemas de Informação");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");

            default:
                System.out.println("Você entrou com uma opção invalida!");

        }
        teclado.close();
    }

}
