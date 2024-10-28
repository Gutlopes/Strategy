import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();

        // Exemplo de lista a ser ordenada
        List<Integer> numeros = new ArrayList<>();
        numeros.add(64);
        numeros.add(34);
        numeros.add(25);
        numeros.add(12);
        numeros.add(22);
        numeros.add(11);
        numeros.add(90);

        System.out.println("Lista original: " + numeros);

        // Menu para escolher a estratégia
        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }


        contexto.executarOrdenacao(numeros);

        
        System.out.println("Lista ordenada: " + numeros);
    }
}
