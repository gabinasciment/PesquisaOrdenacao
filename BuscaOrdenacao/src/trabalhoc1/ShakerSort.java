package trabalhoc1;

public class ShakerSort {

    int[] vetor;
    int nElem;

    long comparacoes;
    long movimentacoes;
    long tempo;

    public ShakerSort(int[] vetor) {
        this.vetor = vetor;
        this.nElem = vetor.length;
    }

    public void shakerSort() {

        comparacoes = 0;
        movimentacoes = 0;

        long inicio = System.nanoTime();

        int esq, dir, i, j;
        int temp;

        esq = 1;
        dir = this.nElem - 1;
        j = dir;

        do {

            for (i = dir; i >= esq; i--) {

                comparacoes++;

                if (this.vetor[i - 1] > this.vetor[i]) {

                    temp = this.vetor[i];
                    this.vetor[i] = this.vetor[i - 1];
                    this.vetor[i - 1] = temp;

                    movimentacoes ++;

                    j = i;
                }
            }

            esq = j + 1;

            for (i = esq; i <= dir; i++) {
                comparacoes++;

                if (this.vetor[i - 1] > this.vetor[i]) {
                    temp = this.vetor[i];
                    this.vetor[i] = this.vetor[i - 1];
                    this.vetor[i - 1] = temp;

                    movimentacoes ++;

                    j = i;
                }
            }
            dir = j - 1;

        } while (esq <= dir);

        // Finaliza a contagem do tempo
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