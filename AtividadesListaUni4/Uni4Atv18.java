import java.util.Scanner;

public class Uni4Atv18 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o valor da conta? ");
        double valorConta = teclado.nextDouble();

        System.out.println("Qual é o dia do vencimento?");
        int diaVencimento = teclado.nextInt();

        System.out.println("Qual é o dia do pagamento?");
        int diaPagamento = teclado.nextInt();

        double descontoantecipado = valorConta * 0.10;
        double valorFinalAntecipado = valorConta - descontoantecipado;
        int perdeudesconto = diaVencimento + 5;

        if (diaPagamento <= diaVencimento){
            System.out.println("O pagamento está em dia e ganhou 10% de desconto. Preço atual a pagar: R$"+ valorFinalAntecipado);
        }
        else if( diaPagamento > diaVencimento && diaPagamento <= perdeudesconto){
            System.out.println("O pagamento está atrasado, mas ainda irá pagar apenas o preço normal da prestação: R$"+ valorConta);
        }
        else{
            int diasAtraso = diaPagamento - diaVencimento;
            double multa = valorConta * (0.02* diasAtraso); // Multa só apoós os 5 dias de atraso
            double valorFinalAtrasado = valorConta + multa;
            System.out.println("O pagamento está atrasado e terá multa de 2% ao dia. Preço atual a pagar: R$"+ valorFinalAtrasado); 
        }
        teclado.close();
    }
}
