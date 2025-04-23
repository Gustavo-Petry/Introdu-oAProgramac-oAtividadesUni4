import java.util.Scanner;

public class AtividadeUri01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para armazenar em A: ");
        int A = teclado.nextInt();

        System.out.println("Digite um valor inteiro para armazenar em B: ");
        int B = teclado.nextInt();

        System.out.println("Digite um valor inteiro para armazenar em C: ");
        int C = teclado.nextInt();

        System.out.println("Digite um valor inteiro para armazenar em D: ");
        int D = teclado.nextInt();

        int somaCD = C + D;
        int somaAB = A + B;

        if (B > C && D > A && somaCD > somaAB && C >= 0 && D >= 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        teclado.close();
    }

}
