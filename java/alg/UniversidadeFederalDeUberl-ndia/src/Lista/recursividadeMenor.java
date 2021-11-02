package Lista;

public class recursividadeMenor {
	public static void main(String[] args) {
		int vetor[] = {4,2,1};
		int menor = buscaMenor(vetor, 0, vetor.length-1);
		System.out.println(menor);
		
	}
	private static int buscaMenor(int[] vetor, int i, int f) {
		if(i==f) {
			return vetor[i];
		}
		else {
			int m = (i+f)/2;
			int n1 = (buscaMenor(vetor, i, m));
			int n2 = buscaMenor(vetor, m+1, f);
			
			if(n1<n2) {
				return n1;
			}else {
				return n2;
			}
			
		}
	}
	
	
}
