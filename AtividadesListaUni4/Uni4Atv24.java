import java.util.Scanner;

public class Uni4Atv24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor");
        int valor1 = teclado.nextInt();
        System.out.println("Entre com o segundo valor");
        int valor2 = teclado.nextInt();
        System.out.println("Entre com o terceiro valor");
        int valor3 = teclado.nextInt();

        int valorMenor = 0;
        int valorMedio = 0;
        int valorMaior = 0;

        //QUESTÃO IMPORTANTE!!!!!

        if (valor1 <= valor2 && valor1 <= valor3) {
            valorMenor = valor1;
            if (valor2 <= valor3) {
                valorMedio = valor2;
                valorMaior = valor3;
            } else {
                valorMedio = valor3;
                valorMaior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            valorMenor = valor2;
            if (valor1 <= valor3) {
                valorMedio = valor1;
                valorMaior = valor3;
            } else {
                valorMedio = valor3;
                valorMaior = valor1;
            }
        } else {
            valorMenor = valor3;
            if (valor1 <= valor2) {
                valorMedio = valor1;
                valorMaior = valor2;
            } else {
                valorMedio = valor2;
                valorMaior = valor1;
            }
        }

        // se opção = 1, escreva os 3 valores em ordem crescente
        // se opção = 2, escreva os 3 valores em ordem decrescente
        // se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

        System.out.println(
                "Informe qual opção vc deseja que os 3 números sejam informados: 1.Crescente 2.Decrescente 3.Maior valor fique no meio");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println(valorMenor + "-" + valorMedio + "-" + valorMaior);
                break;
            case 2:
                System.out.println(valorMaior + "-" + valorMedio + "-" + valorMenor);
                break;
            case 3:
                System.out.println(valorMedio + "-" + valorMaior + "-" + valorMenor);
                break;
            default:
                System.out.println("Você entrou com a opção de organização errada!");
        }
        teclado.close();
    }

}
