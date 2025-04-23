import java.util.Scanner;

public class Uni4Atv5 {
    public static void main(String[] args) throws Exception {
        
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("A cor é azul?");

       boolean resposta = teclado.nextBoolean();
       if(resposta){
        System.out.println("Sim");
       }
       else{
        System.out.println("Não");
       }

       teclado.close();

    }
}
