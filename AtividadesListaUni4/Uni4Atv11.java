import java.util.Scanner;

public class Uni4Atv11 {
    public static void main(String[] args) throws Exception {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a idade do primeiro irmão?");
        int idade1 = teclado.nextInt();

        System.out.println("Qual a idade do segundo irmão?");
        int idade2 = teclado.nextInt();

        System.out.println("Qual a idade do terceiro irmão?");
        int idade3 = teclado.nextInt();

        if(idade1 == idade2 && idade2 == idade3){
            System.out.println("Os três são Trigêmeos.");
        }
        else if(idade1!=idade2 && idade1!=idade3 && idade2!=idade3){
            System.out.println("Nenhum deles são gêmeos, são apenas irmãos.");
        }
        else if(idade1 == idade2 || idade2 == idade3 ){
            System.out.println("Dois deles são gêmeos.");
        }
        teclado.close();
        
    }

}