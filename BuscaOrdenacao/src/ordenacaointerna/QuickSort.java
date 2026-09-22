package ordenacaointerna;

public class QuickSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];

		System.out.println("Vetor original:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\n");

		quicksort(vetor, 0, vetor.length - 1);

		System.out.println("Ordenado:");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);
		}
	}

	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (esquerda + direita) / 2;
		int pivot = vetor[meio];

		int i = esquerda - 1;
		int j = direita + 1;
		boolean continuar = true;

		while (continuar) {
			do {
				i++;
			} while (vetor[i] < pivot);

			do {
				j--;
			} while (vetor[j] > pivot);

			if (i >= j) {
				continuar = false;
			} else {
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}

		return j;
	}
}