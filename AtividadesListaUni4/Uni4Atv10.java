import java.util.Scanner;

public class Uni4Atv10 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qaul a idade de Zezinho?");
        int idadeZezinho = teclado.nextInt();

        System.out.println("Qual a idade de Marquinhos?");
        int idadeMarquinhos = teclado.nextInt();

        System.out.println("Qual a idade de Luluzinha?");
        int idadeLuluzinha = teclado.nextInt();

        if(idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha){
            System.out.println("Zezinho é o caçula");
        }
        else if(idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha){
            System.out.println("Marquinhos é o caçula");
        }
        else if(idadeLuluzinha < idadeZezinho && idadeLuluzinha < idadeMarquinhos){
            System.out.println("Luluzinha é a caçula");
        }

        teclado.close();
      

    }
}
