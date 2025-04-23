import java.util.Scanner;

public class Uni4Atv14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Lendo a data do usuário
        System.out.print("Digite o dia: "); // Solicita o dia ao usuário
        int dia = scanner.nextInt(); // Lê o valor do dia
        System.out.print("Digite o mês: "); // Solicita o mês ao usuário
        int mes = scanner.nextInt(); // Lê o valor do mês
        System.out.print("Digite o ano: "); // Solicita o ano ao usuário
        int ano = scanner.nextInt(); // Lê o valor do ano
        
        boolean dataValida = false; // Variável para armazenar se a data é válida
        
        // Verifica se o mês está dentro do intervalo válido (1 a 12)
        if (mes < 1 || mes > 12) {
            dataValida = false; // Mês inválido, data não é válida
        } else if (dia < 1) {
            dataValida = false; // Dia inválido (menor que 1), data não é válida
        } else if (mes == 2) { // Caso seja fevereiro
            // Verifica se o ano é bissexto
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia <= 29) dataValida = true; // Fevereiro em ano bissexto tem até 29 dias
            } else {
                if (dia <= 28) dataValida = true; // Fevereiro em ano não bissexto tem até 28 dias
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // Meses com 30 dias
            if (dia <= 30) dataValida = true; // Abril, junho, setembro e novembro têm até 30 dias
        } else { // Meses com 31 dias
            if (dia <= 31) dataValida = true; // Janeiro, março, maio, julho, agosto, outubro e dezembro têm até 31 dias
        }
        
        // Exibe o resultado da validação da data
        if (dataValida) {
            System.out.println("Data válida."); // A data informada é válida
        } else {
            System.out.println("Data inválida."); // A data informada é inválida
        }
        
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos


    }
}
