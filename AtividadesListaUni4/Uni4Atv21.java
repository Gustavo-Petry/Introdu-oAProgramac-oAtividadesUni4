import java.util.Scanner;

public class Uni4Atv21 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu peso de massa corporal: ");
        double peso = teclado.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <18.5){
            System.out.println("Abaixo do peso = Magreza");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal = Saudável");
        }
        else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso = Sobrepeso");
        }
        else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade grau 1 = Obesidade 1");
        }
        else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade grau 2 = Severa");
        }
        else if(imc >= 40.0){
            System.out.println("Obesidade grau 3 = mórbida");
        }
        teclado.close();
    }
    
}
