package recursiva;

public class ComprimentoMax {
	public static void main(String[] args) {
		String sequencia = "1233345545678";
		int num = sequencia.length()-1;
		int quantidade = 0;
		int anterior = num-1;
		int aux = 0;
		System.out.println(sequenciaMaster(num, sequencia, anterior, quantidade, aux));
		
		
	}
	static int sequenciaMaster(int num, String sequencia, int anterior, int quantidade, int aux) {
		if(aux > quantidade) {
			quantidade = aux;
		}
		if (anterior == 0) {
			if (sequencia.charAt(anterior) < sequencia.charAt(num)) {
				aux++;
				if(aux>quantidade) {
					return aux;
				}else {
					return quantidade;
				}
			}else{
				return quantidade;
			}
		}else {
			if (sequencia.charAt(anterior) < sequencia.charAt(num)) {
				return sequenciaMaster(num-1, sequencia, anterior-1, quantidade, ++aux);
			}else{
				return sequenciaMaster(num-1, sequencia, anterior-1, quantidade, 0);
			}
		}
	}
}
