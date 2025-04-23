import java.util.Scanner;

public class AtividadeUri03 {public static void main(String[] args) {
    


    Scanner teclado = new Scanner(System.in);
    
    //Leia 2 valores com uma casa decimal (x e y),
    // A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

    float X = teclado.nextFloat();
    float Y = teclado.nextFloat();

    //Se o ponto estiver na origem, escreva a mensagem “Origem”.

    //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

    if (X==0 & Y==0){
        System.out.println("Origem");
    }
    else if (X == 0 && Y > 0 || X==0 && Y < 0){
        System.out.println("Eixo Y");
    }
    else if (Y == 0 && X > 0 || Y==0 && X <0){
        System.out.println("Eixo X");
    }
    else if( X > 0 && Y > 0){
        System.out.println("Q1");
    }
    else if( X > 0 && Y < 0){
        System.out.println("Q4");
    }
    else if( )
}
    
}
