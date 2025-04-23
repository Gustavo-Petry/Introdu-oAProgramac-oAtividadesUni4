import java.util.Scanner;

public class Uni4Atv17 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        // Lendo a renda anual e o número de dependentes
        System.out.print("Digite a renda anual: ");
        double rendaAnual = teclado.nextDouble();
        System.out.print("Digite a quantidade de dependentes: ");
        int dependentes = teclado.nextInt();
        
        // Calculando a renda líquida com desconto de 2% por dependente
        double rendaLiquida = rendaAnual - (rendaAnual * 0.02 * dependentes);
        double imposto = 0;
        int porcentagemImposto = 0;
        
        // Determinando a alíquota do imposto
        if (rendaLiquida <= 2000) {
            imposto = 0;
        } else if (rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
            porcentagemImposto = 5;
        } else if (rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10;
            porcentagemImposto = 10;
        } else {
            imposto = rendaLiquida * 0.15;
            porcentagemImposto = 15;
        }
        
        // Exibindo o resultado
        if (imposto == 0) {
            System.out.println("Isento de imposto.");
        } else {
            System.out.printf("O imposto é de %d%%: R$ %.2f\n", porcentagemImposto, imposto);
        }

        teclado.close();
    }
}
