package trabalhoc1;

public class BubbleSort {

    int[] vetor;
    int nElem;

    long comparacoes;
    long movimentacoes;
    long tempo;

    public BubbleSort(int[] vetor) {
        this.vetor = vetor;
        this.nElem = vetor.length;
    }

    public void bubblesort() {
        int n, i, j;
        int temp;

        comparacoes = 0;
        movimentacoes = 0;

        long inicio = System.nanoTime();
        n = this.nElem - 1;

        do {
            i = 0;
            for (j = 0; j < n; j++) {
                comparacoes++;

                if (this.vetor[j] > this.vetor[j + 1]) {
                    temp = this.vetor[j];
                    this.vetor[j] = this.vetor[j + 1];
                    this.vetor[j + 1] = temp;

                    movimentacoes ++;//para seguir a apostila
                    i = j;
                }
            }
            n = i;
        } while (n >= 1);
        long fim = System.nanoTime();
        tempo = fim - inicio;
    }
    public long getComparacoes() {
        return comparacoes;
    }

    public long getMovimentacoes() {
        return movimentacoes;
    }

    public long getTempo() {
        return tempo;
    }
}
