import java.util.Scanner;

public class AtividadeUri02 {
    public static void main(String[] args) {
        
        //  leia um valor qualquer
        //apresente uma mensagem dizendo em qual dos seguintes intervalos

        //([0,25], (25,50], (50,75], (75,100])

        //deverá ser impressa a mensagem “Fora de intervalo”.

        Scanner teclado = new Scanner(System.in);

        double valor = teclado.nextDouble();

        if(valor >= 0 && valor <=25.0000){
            System.out.println("Intervalo (0,25]");
        }
        else if(valor >= 25.0001 && valor <= 50.0000000){
            System.out.println("Intervalo (25,50]");
        }
        else if(valor >= 50.0000001 && valor <= 75.0000000){
            System.out.println("Intervalo (50,75]");
        }
        else if(valor >= 75.0000001 && valor <= 100.0000000){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }

        teclado.close();

    }
    
}
