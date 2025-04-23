import java.util.Scanner;

public class mediaponderada {public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite a nota A(peso 3,5): ");
        //comando para definir a nota A
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a nota B(peso 7,5):" );
        //comando para definir a nota B
        float nota2 = teclado.nextFloat();
        //a multiplicação de cada nota serve para definir o peso dela, o (float) serve para o comando reconhecer números quebrados
        float media = (float) (((nota1*3.5)+(nota2*7.5))/11);

        System.out.println("a média do aluno é: ");
        System.out.println(media);

        
}
    
}
