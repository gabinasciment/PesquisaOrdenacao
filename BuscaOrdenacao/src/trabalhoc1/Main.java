package trabalhoc1;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Vetor original = carregarArquivo();

        if (original == null) {
            return;
        }
        int opcao;
        do {
            opcao = menu();

            switch (opcao) {

                case 1:
                    executarHeapSort(original);
                    break;

                case 2:
                    executarQuickSort(original);
                    break;

                case 3:
                    executarBubbleSort(original);
                    break;

                case 4:
                    executarSelecaoDireta(original);
                    break;

                case 5:
                    executarInsercaoDireta(original);
                    break;

                case 6:
                    executarShellSort(original);
                    break;

                case 7:
                    executarShakerSort(original);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scan.close();
    }

    public static Vetor carregarArquivo() {
        System.out.print("Digite o caminho do arquivo TXT: ");

        String caminho = scan.nextLine();
        try {

            return Arquivo.lerArquivo(caminho);

        } catch (IOException e) {

            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

            return null;
        }
    }

    public static int menu() {

        System.out.println("\n========== MENU ==========");
        System.out.println("1 - HeapSort");
        System.out.println("2 - QuickSort");
        System.out.println("3 - BubbleSort");
        System.out.println("4 - Seleção Direta");
        System.out.println("5 - Inserção Direta");
        System.out.println("6 - ShellSort");
        System.out.println("7 - ShakerSort");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        return scan.nextInt();
    }

    public static void executarHeapSort(Vetor original) {

        Vetor copia = original.copiar();

        HeapSort heap = new HeapSort(copia.getVetor());

        heap.heapSort();

        System.out.println("\n===== HEAPSORT =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {
            System.out.print(copia.getVetor()[i] + " ");
        }

        System.out.println();

        System.out.println("\nComparações: "
                + heap.getComparacoes());

        System.out.println("Movimentações: "
                + heap.getMovimentacoes());

        System.out.println("Tempo: "
                + heap.getTempo() + " ns");

        System.out.println("Tempo: "
                + (heap.getTempo() / 1_000_000.0) + " ms");
    }

    public static void executarQuickSort(Vetor original) {

        Vetor copia = original.copiar();

        QuickSort quick = new QuickSort(copia.getVetor());

        quick.quickSort();

        System.out.println("\n===== QUICKSORT =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {
            System.out.print(copia.getVetor()[i] + " ");
        }

        System.out.println();

        System.out.println("\nComparações: "
                + quick.getComparacoes());

        System.out.println("Movimentações: "
                + quick.getMovimentacoes());

        System.out.println("Tempo: "
                + quick.getTempo() + " ns");

        System.out.println("Tempo: "
                + (quick.getTempo() / 1_000_000.0) + " ms");
    }

    public static void executarBubbleSort(Vetor original) {

        Vetor copia = original.copiar();

        BubbleSort bubble = new BubbleSort(copia.getVetor());

        bubble.bubblesort();

        System.out.println("\n===== BUBBLESORT =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {

            System.out.print(copia.getVetor()[i] + " ");

        }

        System.out.println();

        System.out.println("\nComparações: "
                + bubble.getComparacoes());

        System.out.println("Movimentações: "
                + bubble.getMovimentacoes());

        System.out.println("Tempo: "
                + bubble.getTempo() + " ns");

        System.out.println("Tempo: "
                + (bubble.getTempo() / 1_000_000.0) + " ms");
    }

    public static void executarSelecaoDireta(Vetor original) {

        Vetor copia = original.copiar();

        SelecaoDireta selecao =
                new SelecaoDireta(copia.getVetor());

        selecao.selecaoDireta();

        System.out.println("\n===== SELEÇÃO DIRETA =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {
            System.out.print(copia.getVetor()[i] + " ");
        }

        System.out.println();

        System.out.println("\nComparações: "
                + selecao.getComparacoes());

        System.out.println("Movimentações: "
                + selecao.getMovimentacoes());

        System.out.println("Tempo: "
                + selecao.getTempo() + " ns");

        System.out.println("Tempo: "
                + (selecao.getTempo() / 1_000_000.0) + " ms");
    }

    public static void executarInsercaoDireta(Vetor original) {

        Vetor copia = original.copiar();

        InsercaoDireta insercao =
                new InsercaoDireta(copia.getVetor());

        insercao.insercaoDireta();

        System.out.println("\n===== INSERÇÃO DIRETA =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {
            System.out.print(copia.getVetor()[i] + " ");
        }

        System.out.println();

        System.out.println("\nComparações: "
                + insercao.getComparacoes());

        System.out.println("Movimentações: "
                + insercao.getMovimentacoes());

        System.out.println("Tempo: "
                + insercao.getTempo() + " ns");

        System.out.println("Tempo: "
                + (insercao.getTempo() / 1_000_000.0) + " ms");
    }

    public static void executarShellSort(Vetor original) {

        Vetor copia = original.copiar();

        ShellSort shell = new ShellSort(copia.getVetor());

        shell.shellSort();

        System.out.println("\n===== SHELLSORT =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {
            System.out.print(copia.getVetor()[i] + " ");
        }

        System.out.println();

        System.out.println("\nComparações: "
                + shell.getComparacoes());

        System.out.println("Movimentações: "
                + shell.getMovimentacoes());

        System.out.println("Tempo: "
                + shell.getTempo() + " ns");

        System.out.println("Tempo: "
                + (shell.getTempo() / 1_000_000.0) + " ms");
    }

    public static void executarShakerSort(Vetor original) {

        Vetor copia = original.copiar();

        ShakerSort shaker = new ShakerSort(copia.getVetor());

        shaker.shakerSort();

        System.out.println("\n===== SHAKERSORT =====");

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < copia.getNElem(); i++) {
            System.out.print(copia.getVetor()[i] + " ");
        }

        System.out.println();

        System.out.println("\nComparações: "
                + shaker.getComparacoes());

        System.out.println("Movimentações: "
                + shaker.getMovimentacoes());

        System.out.println("Tempo: "
                + shaker.getTempo() + " ns");

        System.out.println("Tempo: "
                + (shaker.getTempo() / 1_000_000.0) + " ms");
    }
}