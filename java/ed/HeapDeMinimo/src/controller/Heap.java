package controller;

public class Heap {
	int vetor[];
	int n;
	
	public Heap(int size) {
		vetor = new int[size];
		n = 0;
	}
	
	public void inserir(int element) {
		vetor[++n] = element;
		subir(n);
	}
	
	public void subir(int filho) {
		int pai = filho / 2;
		if(pai >=1) {
			if(vetor[pai]>vetor[filho]) {
				int aux = vetor[pai];
				vetor[pai] = vetor[filho];
				vetor[filho] = aux;
				subir(pai);
			}
		}
	}
	
	public void remover() {
		vetor[0] = vetor[n];
		n--;
		descer(n);
	}
	
	public void descer(int pai) {
		int filhoEsq = pai*2;
		int filhoDir = pai*2+1;
		int menor = pai;
		
		if(filhoEsq <= n) {
			if(filhoEsq < pai) {
				menor = filhoEsq;
			}
		}if(filhoDir <= n) {
			if(filhoDir < menor) {
				menor = filhoDir;
			}
		}
		if(menor != pai) {
			int aux = vetor[pai];
			vetor[pai] = vetor[menor];
			vetor[menor] = aux;
			descer(menor);
		}
	}
}
