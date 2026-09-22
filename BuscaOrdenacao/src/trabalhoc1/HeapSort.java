package trabalhoc1;

public class HeapSort {

    int[] vetor;
    int nElem;

    long comparacoes;
    long movimentacoes;
    long tempo;

    public HeapSort(int[] vetor) {
        this.vetor = vetor;
        this.nElem = vetor.length;
    }

    public void heapSort() {

        comparacoes = 0;
        movimentacoes = 0;

        long inicio = System.nanoTime();

        int dir = nElem - 1;
        int esq = (dir - 1) / 2;
        int temp;

        while (esq >= 0) {
            refazHeap(esq, nElem - 1);
            esq--;
        }

        while (dir > 0) {
            temp = vetor[0];

            vetor[0] = vetor[dir];
            vetor[dir] = temp;
            movimentacoes ++;
            dir--;
            refazHeap(0, dir);
        }

        long fim = System.nanoTime();

        tempo = fim - inicio;
    }

    private void refazHeap(int esq, int dir) {

        int i = esq;
        int maiorFolha = 2 * i + 1;
        int raiz = vetor[i];

        boolean heap = false;

        while ((maiorFolha <= dir) && (!heap)) {
            if (maiorFolha < dir) {
                comparacoes++;

                if (vetor[maiorFolha] < vetor[maiorFolha + 1]) {
                    maiorFolha++;
                }
            }
            comparacoes++;

            if (raiz < vetor[maiorFolha]) {
                vetor[i] = vetor[maiorFolha];
                
                movimentacoes++;
            
                i = maiorFolha;
                maiorFolha = 2 * i + 1;

            } else {
                heap = true;
            }
        }
        vetor[i] = raiz;
    }
    public long getComparacoes() {
        return comparacoes;
    }

    public long getMovimentacoes() {
        return movimentacoes;
    }

    public long getTempo() {
        return tempo;
    }}