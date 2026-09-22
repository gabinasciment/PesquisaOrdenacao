package ordenacaointerna;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " " );
			System.out.println();

		}

		// bubble sort O(N^2)
		int aux;
		for (int i = 0; i < vetor.length; i++) {// O(n)
			// o j sempre começa no i +1
			for (int j = i + 1; j < vetor.length; j++) { //O(n-1)
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}

			}

		}
		
		System.out.println("VETOR ORDENADO: ");
		for (int i : vetor) {
			System.out.print(i +  " ");
		}
	}
}
