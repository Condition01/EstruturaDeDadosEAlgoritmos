package Lista;

public class buscaVetor {
	public static void main(String[] args) {
		int vetor[] = {3,4,2,1,5,3};
		int num = 3;
		int inicio = 0;
		int fim = vetor.length;
		int meio = (inicio+fim)/2;
		int ref = meio;
		int achado = -1;
		System.out.println(buscaSeq(vetor, meio, num, achado, ref));
	}
	static int buscaSeq(int vetor[], int meio, int num, int achado,int ref) {
		if(meio<0) {
			return achado;
		}if(vetor[meio]==num) {
			achado = meio;
		}
		if(ref>vetor.length-1) {
			return buscaSeq(vetor, meio-1, num, achado, ref);
		}else if(vetor[ref]==num) {
			achado = ref;
		}
		achado = buscaSeq(vetor, meio-1, num, achado, ref+1);
		return achado;
	}
}
