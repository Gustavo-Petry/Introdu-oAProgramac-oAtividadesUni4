import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Entre com o seu primeiro número");
        int number1 = teclado.nextInt();

        System.out.println("Escreva qual operação você deseja realizar!");
        System.out.println(" Soma [+]");
        System.out.println(" Subtração [-]");
        System.out.println(" Multiplicação [*]");
        System.out.println(" Divisão [/]");

        char operador = teclado.next().charAt(0);

        double resultado;

        System.out.println(" Entre com o seu segundo número número");
        int number2 = teclado.nextInt();

        if (operador == '+'){
            resultado = number1 + number2;
            System.out.println("Resultado é igual a: " + resultado);
        }
        else if ( operador == '-' ){
            resultado = number1 - number2;
            System.out.println("Resultado é igual a: " + resultado);
        }
        else if (operador == '*'){
            resultado = number1 * number2;
            System.out.println("Resultado é igual a: " + resultado);
        }
        else if (operador == '/' && number2 != 0 && number1 != 0){
             resultado = number1 / number2;
             System.out.println("Resultado é igual a: " + resultado);   
        }
        else{
            resultado = 0;
            System.out.println("O caractare inserido é inavalido ou o seu divisor é igual a 0");
        }
       
        teclado.close();

    }
}

 

