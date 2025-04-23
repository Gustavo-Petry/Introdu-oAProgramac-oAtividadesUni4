import java.util.Scanner;

public class Uni4Atv9 {
    public static void main(String[] args) throws Exception {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = teclado.nextInt();

        System.out.println("Informe o segundo valor: ");
        int valor2 = teclado.nextInt();

        int resultado = valor1 % valor2;

        if(resultado == 0){
            System.out.println("Os valores são multiplos");
        }
        else{
            System.out.println("Os valores não são multiplos");
        }
        teclado.close();
        
    }
}
