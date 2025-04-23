import java.util.Scanner;

public class Uni4Atv7 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        double custoselocinquenta = 0.45;

        System.out.println("Qal o peso da carta em gramas?");
        int peso = teclado.nextInt();

        if(peso > 50){
            int excesso = peso - 50;
            //Math.ceil arredonda para cima
            int adicional = (int) Math.ceil(excesso / 20);
            double custo = custoselocinquenta + (adicional * 0.45);
            System.out.println("O custo do selo é de: R$ " + custo);
        }
        else{
            System.out.println("O custo do selo é de: R$ " + custoselocinquenta);
        }
        teclado.close();
    
    }
}
