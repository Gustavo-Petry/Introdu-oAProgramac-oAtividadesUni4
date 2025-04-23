import java.util.Scanner;

public class Uni4Atv2 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com um valor inteiro maior que 0");
        int entrada = teclado.nextInt();

        int numero = entrada %2;
        if(numero==0){
            System.out.println("O número é par!");
        }
        else{
            System.out.println("O número é impar!");
        }
        teclado.close();
    }
}
