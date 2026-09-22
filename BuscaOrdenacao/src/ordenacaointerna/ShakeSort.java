package ordenacaointerna;

import java.util.Arrays; // Importação necessária para imprimir o vetor facilmente

public class ShakeSort {
	// Vetor já preenchido com números desordenados para o teste
	int[] vetor = { 5, 9, 2, 8, 1, 3, 4, 7, 0, 6 };

	public void ordenar() {
		int esq, dir, i, j, temp;

		esq = 1;
		dir = vetor.length - 1;
		j = dir;

		do {
			// Passagem da direita para a esquerda
			for (i = dir; i >= esq; i--) {
				if (vetor[i - 1] > vetor[i]) {
					temp = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = temp;
					j = i;
				}
			}
			esq = j + 1;

			// Passagem da esquerda para a direita
			for (i = esq; i <= dir; i++) {
				if (vetor[i - 1] > vetor[i]) {
					temp = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = temp;
					j = i;
				}
			}
			dir = j - 1;

		} while (esq <= dir);
	}

	// Método principal para rodar o teste
	public static void main(String[] args) {
        // 1. Instancia a classe
        ShakeSort teste = new ShakeSort();
        
        // 2. Mostra como o vetor está antes
        System.out.println("Vetor ANTES da ordenação:");
        System.out.println(Arrays.toString(teste.vetor));
        
        // 3. Chama o método que faz a ordenação
        teste.ordenar();
        
        // 4. Mostra como o vetor ficou depois
        System.out.println("Vetor DEPOIS da ordenação:");
        System.out.println(Arrays.toString(teste.vetor));
    }
}