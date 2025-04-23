import java.util.Scanner;

public class Uni4Atv25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o valor 1:");
        int valor1 = teclado.nextInt();
        System.out.println("Entre com o valor 2: ");
        int valor2 = teclado.nextInt();

        System.out.println("Escolha uma opção:\n" +
                "1 - Soma de dois números.\n" +
                "2 - Diferença entre dois números.\n" +
                "3 - Produto entre dois números.\n" +
                "4 - Divisão entre dois números (o denominador não pode ser zero).");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                int soma = valor1 + valor2;
                System.out.println("A soma do valor1 + valor2 é igual a: " + soma);
                break;
            case 2:
                int diferenca = valor2 - valor1;
                System.out.println("A diferença entre o valor2 com o valor1 é de: " + diferenca);
                break;
            case 3:
                int produto = valor1 * valor2;
                System.out.println("O produto de valor1 com valor2 é de: " + produto);
                break;
            case 4:
                float divisao = valor1 / valor2;
                System.out.println("A divisão entre o valor1 e o valor2 é de: " + divisao);
                break;
            default:
                System.out.println("ERRO! A opção digitada está incorreta!");
                break;
        }
        teclado.close();
    }

}
