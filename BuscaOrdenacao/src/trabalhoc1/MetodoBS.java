package trabalhoc1;

public class MetodoBS {
	
		  int[] vetor;
		    int nElem;

		    public MetodoBS(int[] vetor) {
		        this.vetor = vetor;
		        this.nElem = vetor.length;
		    }
		    public void bubblesort() {
		        int n, i, j;
		        int temp;

		        n = this.nElem - 1;

		        do {
		            i = 0;
		            for (j = 0; j < n; j++) {

		                if (this.vetor[j] > this.vetor[j + 1]) {
		                    temp = this.vetor[j];
		                    this.vetor[j] = this.vetor[j + 1];
		                    this.vetor[j + 1] = temp;
		                    i = j;
		                }
		            }
		            n = i;
		        } while (n >= 1);
		    }
	}


