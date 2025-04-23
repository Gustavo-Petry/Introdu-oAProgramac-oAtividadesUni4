import java.util.Scanner;

public class Uni4Atv6 {
    public static void main(String[] args) throws Exception {
    
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um caractere (M/F/I): ");
        char sexo = teclado.next().charAt(0);

        // Converte o caractere para maiúsculo
        sexo = Character.toUpperCase(sexo);

        if(sexo == 'M'){

        System.out.println("Masculino");
        }
        else if (sexo == 'F'){
            System.out.println("Feminino");
        }
        else if (sexo =='I'){
            System.out.println("Não Informado");
        }
        else{
            System.out.println("Entrada incorreta");
        }
        
        teclado.close();

        

    }
}
