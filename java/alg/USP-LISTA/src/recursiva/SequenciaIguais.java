package recursiva;

public class SequenciaIguais {
	public static void main(String[] args) {
		String sequencia = "54332221";
		int num = sequencia.length()-1;
		int quantidade = 0;	
		int anterior = 0;
		System.out.println(functionRecursiva(num, sequencia, quantidade, anterior));
		
	}
	static int functionRecursiva(int num, String sequencia, int quantidade, int anterior) {
		if(num==0) {
			if(sequencia.charAt(anterior)==sequencia.charAt(num)) {
				return ++quantidade;
			}else {
				return quantidade;
			}
		}else {
			if(sequencia.charAt(anterior)==sequencia.charAt(num)) {
				return functionRecursiva((num-1), sequencia, ++quantidade, num);
			}else {
				return functionRecursiva((num-1), sequencia, quantidade, num);
			}
		}
	}
}
