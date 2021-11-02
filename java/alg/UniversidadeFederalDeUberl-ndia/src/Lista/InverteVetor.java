package Lista;

public class InverteVetor {
	public static void main(String[] args) {
		Double vetor[] = new Double[10];
		int n = 1;
		int n2 = vetor.length-1;
		int comparisson = vetor.length/2;
		vetor = vetorPreenche(vetor, n);
		for(int i=0;i<10;i++) {
			System.out.println(vetor[i]);
		}
		vetor = vetorInverter(vetor, n, n2, comparisson);
		System.out.println("\n-------------------------------------\n");
		for(int i=0;i<10;i++) {
			
			System.out.println(vetor[i]);
		}
	}
	private static Double[] vetorPreenche(Double vetor[], int n) {
		if(n==10) {
			vetor[n-1] = Math.random()*101;
			return vetor;
		}else {
			vetor[n-1] = Math.random()*101;
			return vetorPreenche(vetor, ++n);
		}
	}
	private static Double[] vetorInverter(Double vet[], int n, int n2, int comparisson) {
		
		if(n==comparisson) {
			Double aux = vet[n-1];
			vet[n-1] = vet[n2];
			vet[n2] = aux;
			return vet;
		}else {
			Double aux = vet[n-1];
			vet[n-1] = vet[n2];
			vet[n2] = aux;
			return vetorInverter(vet, ++n, --n2,comparisson);
		}
	}
	
}
