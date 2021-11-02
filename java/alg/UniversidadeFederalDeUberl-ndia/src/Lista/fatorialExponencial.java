package Lista;

public class fatorialExponencial {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(fatorialExponencial(num, num));
	}
	static long potencia(long num, long expoente) {
		if (expoente==1) {
			return num;
		}else {
			return num * potencia(num, --expoente);
		}
	}
	static long fatorialExponencial(long num, long expoente) {
		if(expoente == 1) {
			return num;
		}else {
			return fatorialExponencial(potencia(num, expoente-1), expoente-1);
		}
	}
}
