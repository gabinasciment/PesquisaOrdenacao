package ordenacaointerna;

public class InsercaoDireta {
	public static void main(String[] args) {
		int []vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random ()* vetor.length);
		}
		
		System.out.println("Desordenado: ");
		for ( int i : vetor) {
			System.out.println(i);
		}
		
		int aux, j;
		/* começa int = 1 pois a primeira parte já está no lugar certo */
		
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			//j começa no i-1
			while( j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
			
		}
		
		System.out.println("Ordenado: ");
		for ( int i : vetor) {
			System.out.println(i);
		}
	}

}
