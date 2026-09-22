package trabalhoc1;

public class QuickSort {

    int[] vetor;
    int nElem;

    long comparacoes;
    long movimentacoes;
    long tempo;

    public QuickSort(int[] vetor) {
        this.vetor = vetor;
        this.nElem = vetor.length;
    }
    public void quickSort() {

        comparacoes = 0;
        movimentacoes = 0;

        long inicio = System.nanoTime();

        ordena(0, this.nElem - 1);

        long fim = System.nanoTime();

        tempo = fim - inicio;
    }

    private void ordena(int esq, int dir) {

        int pivo, i = esq, j = dir;
        int temp;

        // O pivô é o elemento central
        pivo = this.vetor[(i + j) / 2];

        do {

            while (this.vetor[i] < pivo) {
                comparacoes++;
                i++;
            }
            comparacoes++;

            while (this.vetor[j] > pivo) {
                comparacoes++;
                j--;
            }

            comparacoes++;

            if (i <= j) {

                temp = this.vetor[i];
                this.vetor[i] = this.vetor[j];
                this.vetor[j] = temp;

                movimentacoes ++;

                i++;
                j--;
            }

        } while (i <= j);

        if (esq < j) {
            ordena(esq, j);
        }

        if (dir > i) {
            ordena(i, dir);
        }
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