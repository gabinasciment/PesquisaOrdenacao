package ordenacaointerna;

public class SelecaoDireta {

	public static void main(String[] args) {

		int[] numeros = { 5, 10, 7, 1, 4, 9, 3, 11 };

		selectionSort(numeros);
		for (int i : numeros) {
			System.out.println(i);
		}

		}

	

	public static void selectionSort(int[] array) {
		int menor;
		int aux;
		/*
		 * tamanho - 1 quer dizer que quando chegar no penultimo não preciso procurar o
		 */
		/* percorre o array iniciando com i, pega o menor e joga o menor no começo */
		for (int i = 0; i < array.length - 1; i++) {
			menor = i;
			// pega o menor
			// i +1 - compara a partir do atual
			for (int j = i + 1; j < array.length; j++) {
				if (array[menor] > array[j]) {
					menor = j;
				}
			}
			// faz a troca para o primeiro
			aux = array[i];
			array[i] = array[menor];
			array[menor] = aux;
		}

	}

}
