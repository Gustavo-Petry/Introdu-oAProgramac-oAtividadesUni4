import java.util.Scanner;

public class Uni4Atv27 {public static void main(String[] args) {
    

    //arredondado para cima ou para baixo dependendo do tempo. 
    //Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima.
    //Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta.

    Scanner scanner = new Scanner(System.in);

        // Entrada dos horários de chegada e saída
        System.out.print("Hora de chegada: ");
        int horaChegada = scanner.nextInt();
        System.out.print("Minuto de chegada: ");
        int minChegada = scanner.nextInt();
        System.out.print("Hora de saída: ");
        int horaSaida = scanner.nextInt();
        System.out.print("Minuto de saída: ");
        int minSaida = scanner.nextInt();

        // Converter o tempo para minutos
        int minutosChegada = horaChegada * 60 + minChegada;
        int minutosSaida = horaSaida * 60 + minSaida;

        // Calcular a diferença de tempo em minutos
        int tempoTotalMin = minutosSaida - minutosChegada;

        // Ajustar para evitar valores negativos (caso o usuário passe da meia-noite, por exemplo)
        if (tempoTotalMin < 0) {
            tempoTotalMin += 24 * 60;
        }

        // Arredondamento do tempo para horas inteiras
        int horasCobradas = (tempoTotalMin % 60 <= 29) ? tempoTotalMin / 60 : (tempoTotalMin / 60) + 1;

        // Cálculo do preço usando switch sem for
        double preco = 0;
        switch (horasCobradas) {
            case 1:
                preco = 5;
                break;
            case 2:
                preco = 10;
                break;
            case 3:
                preco = 17;
                break;
            case 4:
                preco = 24.5;
                break;
            default:
                if (horasCobradas >= 5) {
                    preco = 24.5 + (horasCobradas - 4) * 10;
                }
                break;
        }

        // Exibir resultados
        System.out.println("Tempo total estacionado: " + horasCobradas + " horas");
        System.out.println("Preço cobrado = R$" + preco);

        scanner.close();

}
    
}
