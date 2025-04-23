import java.util.Scanner;

public class Uni4Atv20 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        

        System.out.println("Escreva a nota que o aluno tirou na prova1: ");
        double notaProva1 = teclado.nextDouble();

        System.out.println("Escreva a nota que o aluno tirou na prova2: ");
        double notaProva2 = teclado.nextDouble();

        System.out.println("Escreva a nota que o aluno tirou na prova3: ");
        double notaProva3 = teclado.nextDouble();

        System.out.println("Escreva a média que o aluno tirou nos exercícios:");
        double mediaExercicios = teclado.nextDouble();

        double media = (notaProva1 + (notaProva2*2) + (notaProva3 * 3) + mediaExercicios) / 7;

        if(media >= 9.0){
        System.out.println("A média de aproveitamento foi: "+ media + " Conceito: A. Aprovado");
        }
        else if(media >= 7.5 && media < 9.0){
            System.out.println("A média de aproveitamento foi: "+ media + " Conceito: B. Aprovado");
        }
        else if(media >= 6.0 && media < 7.5){
            System.out.println("A média de aproveitamento foi: "+ media + " Conceito: C. Aprovado");
        }
        else if(media >= 4.0 && media < 6.0){
            System.out.println("A média de aproveitamento foi: "+ media + " Conceito: D. Reprovado");
        }
        else if(media < 4.0){
            System.out.println("A média de aproveitamento foi: "+ media + " Conceito: E. Reprovado");
        }
        teclado.close();
    }
}
