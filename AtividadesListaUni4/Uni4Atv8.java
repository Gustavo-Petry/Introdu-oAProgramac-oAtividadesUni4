import java.util.Scanner;

public class Uni4Atv8 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva uma letra: ");
        char letra = teclado.next().charAt(0);
        char a = 'a';
        char e = 'e';   
        char i = 'i';
        char o = 'o';
        char u = 'u';

        if(letra == a || letra == e || letra == i || letra == o || letra == u){
            System.out.println("A letra é uma vogal");
        }
        else{
            System.out.println("A letra é uma consoante");
        }
        teclado.close();
    }
}
