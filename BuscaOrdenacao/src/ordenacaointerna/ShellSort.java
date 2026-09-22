package ordenacaointerna;

public class ShellSort {
	public static void main(String[] args) {
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}

		System.out.println("Desordenado: ");
		for (int i : vetor) {
			System.out.println(i);
		}
		
		int h = 1;
		int n = vetor.length;
		while(h < n) {
			// regra de shell
			h = h * 3 + 1;
		}
		//arredonda pra baixo
		
		h = ( int)Math.floor( h /3);
		int elemento,j;
		while( h > 0) {
			for (int i = h; i < n; i++) {
				elemento = vetor[i];
				//passa pelos elementos
				j = i;
				while( j >=h && vetor[j - h] > elemento) {
					vetor[j] = vetor[j - h];
					j = j -h;
				}
				vetor[j] = elemento;				
				
			}
			h= h/2;
		}
		
		System.out.println("Ordenado");
		for (int i : vetor) {
			System.out.println(i);
		}
		
		
	}

}
