import java.util.Scanner;

public class Uni4Atv19 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o valor de X: ");
        double x = teclado.nextDouble();

        System.out.println("Escreva o valor de Y: ");
        double y = teclado.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Quadrante 0");
        }
        else if(x > 0 && y > 0){
            System.out.println("Quadrante 1");
        }
        else if(x < 0 && y > 0){
            System.out.println("Quadrante 2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Quadrante 3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Quadrante 4");
        }
        teclado.close();
    }
}
