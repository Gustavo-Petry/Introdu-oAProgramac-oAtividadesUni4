import java.util.Scanner;

public class Uni4Atv13 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor das suas 3 cartas: ");

        System.out.println("Carta 1: ");
        int carta1 = teclado.nextInt();
        System.out.println("Carta 2: ");
        int carta2 = teclado.nextInt();
        System.out.println("Carta 3: ");
        int carta3 = teclado.nextInt();

        int as = 1;
        int dois = 2;
        int tres = 3;
        
        int qtdCartasBoas = 0;

        if (carta1 == as || carta1 == dois || carta1 == tres){
            qtdCartasBoas+=1;
            
        }
        if(carta2 == as || carta2 == dois || carta2 ==tres){
            qtdCartasBoas= qtdCartasBoas+=1;
        }
        if(carta3 == as || carta3 == dois || carta3 ==tres){
            qtdCartasBoas++;
        }
        if(qtdCartasBoas == 3){
            System.out.println("Nove");
        }
        else if(qtdCartasBoas == 2){
            System.out.println("Seis");
        }
        else if(qtdCartasBoas == 1){
            System.out.println("Truco");
        }
        else{
            System.out.println("Nada");
        }

        teclado.close();   
    }
}
