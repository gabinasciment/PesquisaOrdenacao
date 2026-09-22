package trabalhoc1;

public class ShellSort {

    int[] vetor;
    int nElem;

    long comparacoes;
    long movimentacoes;
    long tempo;

    public ShellSort(int[] vetor) {

        this.vetor = vetor;
        this.nElem = vetor.length;

    }

    public void shellSort() {

        int i, j, h;
        int temp;

        comparacoes = 0;
        movimentacoes = 0;

        long inicio = System.nanoTime();

        h = 1;

        do {

            h = 3 * h + 1;

        } while (h < this.nElem);

        do {

            h = h / 3;

            for (i = h; i < this.nElem; i++) {

                temp = this.vetor[i];

                j = i;

                while (true) {

                    /*
                     * Aqui é feita uma comparação
                     * entre valores.
                     */
                    comparacoes++;

                    if (this.vetor[j - h] <= temp) {

                        break;

                    }

                    this.vetor[j] = this.vetor[j - h];

                    movimentacoes++;

                    j -= h;

                    if (j < h) {

                        break;

                    }

                }

                this.vetor[j] = temp;

            }

        } while (h != 1);

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