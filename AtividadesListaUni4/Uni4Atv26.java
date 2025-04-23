import java.util.Scanner;

public class Uni4Atv26 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n" +
                "T: calcular a área de um triângulo de base b e altura h\n" +
                "Q: calcular a área de um quadrado de lado l\n" +
                "R: calcular a área de um retângulo de base b e altura h\n" +
                "C: calcular a área de um círculo de raio r\n");

        String opcao = teclado.next().toUpperCase(); // toUpperCase converte letra minuscula para maiuscula!
        switch (opcao) {
            case "T":
                System.out.println("Digite a base e a altura do triangulo: ");
                int base = teclado.nextInt();
                int altura = teclado.nextInt();
                System.out.println("Área do triângulo é: " + (base * altura) / 2 + "m²");
                break;
            case "Q":
                System.out.println("Digite o lado: ");
                int lado = teclado.nextInt();
                System.out.println("Área do quadrado: " + lado * lado + " m²");
                break;
            case "R":
                System.out.println("Digite a base e a altura do retângulo: ");
                int baseretangulo = teclado.nextInt();
                int alturaretangulo = teclado.nextInt();
                System.out.println("Área do retângulo: " + baseretangulo * alturaretangulo + " m²");
                break;
            case "C":
                System.out.println("Digite o raio:");
                double raio = teclado.nextDouble();
                System.out.println("Área do círculo: " + Math.PI * (Math.pow(raio, 2)) + " m²");
                break;
            default:
                System.out.println("ERRO! Opção invalida!");
                break;
        }
        teclado.close();
    }

}
