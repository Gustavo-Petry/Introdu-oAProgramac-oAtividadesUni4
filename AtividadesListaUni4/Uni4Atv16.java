import java.util.Scanner;

public class Uni4Atv16 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a idade do homem mais novo: ");
        int idadeHomemMaisNovo = teclado.nextInt();
        System.out.println("Informe a idade do homem mais velho: ");
        int idadeHomemMaisVelho = teclado.nextInt();

        System.out.println("Informe a idade da mulher mais nova: ");
        int idadeMulherMaisNova = teclado.nextInt();
        System.out.println("Informe a idade da mulher mais velha: ");
        int idadeMulherMaisVelha = teclado.nextInt();

        int soma = idadeHomemMaisVelho + idadeMulherMaisNova;
        int produto = idadeHomemMaisNovo * idadeMulherMaisVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        
        teclado.close();

    }
}
