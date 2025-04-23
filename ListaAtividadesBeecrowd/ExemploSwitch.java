public class ExemploSwitch {
    public static void main(String[] args) {

        int numero = 6;

        // caso numero = 1 -->> escreve 1
        // caso numero = 2 -->> escreve 2
        // caso numero = 3 -->> escreve 3
        // caso numero = 4 -->> escreve 4
        // caso numero = 5 -->> escreve 5
        // SE NÂO escreve -->> outro numero

        switch (numero) {
            case 1: // caso for 1
                System.out.println("1");
                break;
            case 2: // caso for 2
                System.out.println("2");
                break;
            case 3: // caso for 3
                System.out.println("3");
                break;
            case 4: // caso for 4
                System.out.println("4");
                break;
            case 5: // caso for 5
                System.out.println("5");
                break;
            default: // caso o número não entre em nenhuma condição
                System.out.println("Outro número");

        }

    }
}
