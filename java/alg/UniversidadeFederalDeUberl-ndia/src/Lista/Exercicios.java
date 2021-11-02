package Lista;

public class Exercicios {
	public static void main(String[] args) {
		int num = 123456789;
		int contador = 1;
		int contadorAux = 1;
		int multiplicador = 1;
		contador = functionContador(num, contador);
		multiplicador = functionMultiplicador(num, multiplicador);
		System.out.println(functionInverter(num, contador, multiplicador, contadorAux));
		
	}
	static int functionInverter(int num, int contador, int multiplicador, int contadorAux) {
		if(contadorAux == contador) {
			return num;
		}else {
			return (num%10 * multiplicador) + functionInverter(num/10, contador, multiplicador/10, contadorAux+1); 
		}
	}
	static int functionMultiplicador(int num, int multiplicador) {
		if(num < 10) {
			return multiplicador;
		}else{
			return functionMultiplicador(num/10, multiplicador*10);
		}
	}
	static int functionContador(int num, int contador) {
		if(num < 10) {
			return contador;
		}else{
			return functionContador(num/10, ++contador);
		}
	}
}
