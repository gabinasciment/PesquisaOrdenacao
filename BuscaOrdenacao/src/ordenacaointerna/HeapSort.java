package ordenacaointerna;

import java.util.Iterator;

public class HeapSort {
	public static void main(String[] args) {
		int[] vetor = new int[10];

		System.out.println("Vetor original:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\n");
		
		//Heap Sort 
		int n = vetor.length;
		for(int i = n /2 -1; i >=0;i--) {
			aplicarHeap(vetor,n,i);
		}
		for(int j = n -1; j > 0;j--) {
			int aux = vetor[0];
			vetor[0] = vetor[j];
			vetor[j] = aux;
			
			aplicarHeap(vetor,j,0);
		}
		

		System.out.println("Ordenado:");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		
		

	}
	private static void aplicarHeap(int[] vetor, int n, int i) {
		int raiz = i;
		int esquerda = 2 * i + 1;
		int direita = 2 *i + 2;
		
		if(esquerda < n && vetor[esquerda] > vetor[raiz]) {
			raiz = esquerda;
			
		}
		
		if(direita < n && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		
		if(raiz != i) {
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz]= aux;
			
			aplicarHeap(vetor,n,raiz);
			
			
		}
		
		
	}
	
	
}
