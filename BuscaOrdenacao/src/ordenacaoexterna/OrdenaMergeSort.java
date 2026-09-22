package ordenacaoexterna;

public class OrdenaMergeSort {
	public static void mergeSort(int[] array) {
		int length = array.length;
		if (length <= 1)
			return;

		int middle = length / 2;

		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];

		int j = 0;
		for (int i = 0; i < length; i++) {
			if (i < middle) {
				leftArray[i] = array[i];
			} else {
				rightArray[j] = array[i];
				j++;
			}
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);

	}

	public static void merge(int[] leftArray, int[] rightArray, int[] array) {
		// Seu código para juntar os sub-arrays ordenados
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;

			} else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}

	}

	public static void main(String[] args) {
		int[] codigosProdutos = { 5, 2, 8, 1, 9, 3, 7, 4, 6 };
		System.out.println("Array original:");
		for (int codigo : codigosProdutos) {
			System.out.print(codigo + " ");
		}
		System.out.println("\n");
		mergeSort(codigosProdutos);
		System.out.println("Array ordenado:");
		for (int codigo : codigosProdutos) {
			System.out.print(codigo + " ");
		}
	}
}