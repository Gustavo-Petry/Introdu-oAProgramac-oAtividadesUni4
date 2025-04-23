import java.util.Scanner;

public class Uni4Atv12 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        // Entrada dos três lados do triângulo
        System.out.print("Digite o primeiro lado: ");
        int lado1 = teclado.nextInt();
        
        System.out.print("Digite o segundo lado: ");
        int lado2 = teclado.nextInt();
        
        System.out.print("Digite o terceiro lado: ");
        int lado3 = teclado.nextInt();
        
        // Verifica se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Classificação do triângulo
            //todos os lados iguais
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
                //dois lados iguais
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
                //todos os lados diferentes
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        
        teclado.close();
    }
}
