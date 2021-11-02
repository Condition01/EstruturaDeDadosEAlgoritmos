package recursiva;

public class OcorrenciasNum {
	public static void main(String[] args) {
		int num = 1222345;
		int numeroTeste = 2;
		int contador = 0;
		System.out.println(ocorrenciasNum(num, numeroTeste, contador));
	}
	
	static int ocorrenciasNum(int num, int numeroTeste, int contador) {
		if(num<10) {
			if(num == numeroTeste) {
				contador++;
				return contador;
			}else {
				return contador;
			}
		}else {
			if(num%10==numeroTeste) {
				return ocorrenciasNum(num/10, numeroTeste, ++contador);
			}else {
				return ocorrenciasNum(num/10, numeroTeste, contador);
			}
		}
	}
}
