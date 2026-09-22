package trabalhoc1;

public class SelecaoDireta {

    int[] vetor;
    int nElem;

    long comparacoes;
    long movimentacoes;
    long tempo;

    public SelecaoDireta(int[] vetor) {

        this.vetor = vetor;
        this.nElem = vetor.length;

    }

    public void selecaoDireta() {

        int i, j;
        int minimo;
        int temp;

        comparacoes = 0;
        movimentacoes = 0;

        long inicio = System.nanoTime();

        for (i = 0; i < this.nElem - 1; i++) {

            minimo = i;

            for (j = i + 1; j < this.nElem; j++) {

                // Comparação entre chaves
                comparacoes++;

                if (this.vetor[j] < this.vetor[minimo]) {

                    minimo = j;

                }

            }

            /*
             * Mantido de acordo com o algoritmo
             * apresentado na apostila.
             */
            temp = this.vetor[minimo];

            this.vetor[minimo] = this.vetor[i];

            this.vetor[i] = temp;

            // Uma troca
            movimentacoes++;

        }

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