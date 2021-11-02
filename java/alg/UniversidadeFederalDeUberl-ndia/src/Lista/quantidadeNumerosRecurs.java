package Lista;

public class quantidadeNumerosRecurs {
	public static void main(String[] args) {
		int sequencia = 123222;
		int num = 2;
		int quantidade = 0;
		System.out.println(functionSerie(sequencia, num, quantidade));
	}
	static int functionSerie(int sequencia, int num, int quantidade) {
		if(sequencia < 10) {
			if(sequencia%10==num) {
				quantidade++;
			}
			return quantidade;
		}else {
			if(sequencia%10==num) {
				return functionSerie(sequencia/10, num, ++quantidade);
			}else {
				return functionSerie(sequencia/10, num, quantidade);
			}
		}
	}
}
