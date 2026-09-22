package trabalhoc1;

public class Vetor {

	private int[] vetor;
	private int nElem;

	private long comparacoes;
	private long movimentacoes;
	private long tempo;

	public Vetor(int tamanho) {
		this.vetor = new int[tamanho];
		this.nElem = 0;
	} 

	public void adicionar(int valor) {
		vetor[nElem] = valor;
		nElem++;
	}

	public int[] getVetor() {
		return vetor;
	}

	public int getNElem() {
		return nElem;
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
	
	
	public Vetor copiar() {

        Vetor copia = new Vetor(this.nElem);

        for (int i = 0; i < this.nElem; i++) {
            copia.vetor[i] = this.vetor[i];
        }

        copia.nElem = this.nElem;

        return copia;
    }
}