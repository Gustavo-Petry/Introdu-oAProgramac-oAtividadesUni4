import java.util.Scanner;

public class Uni4Atv3 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro número!");
        int number1 = teclado.nextInt();

        System.out.println("Escreva o segundo número!");
        int number2 = teclado.nextInt();

        if(number1 > number2){
            System.out.println("O valor "+ number1+" é maior que o valor " + number2);
        }
        else{
            System.out.println("O valor "+ number1+" é menor que o valor "+ number2);
        }
        teclado.close();
    }
    
}
