package Lista;

public class hiperFatorial {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(hiperFat(num));
	}
	static int potencia(int num, int expoente) {
		if(expoente == 1) {
			return num;
		}else {
			return num * potencia(num, --expoente);
		}
	}
	static int hiperFat(int num) {
		if(num == 1) {
			return 1;
		}else {
			return potencia(num, num) * hiperFat(--num);
		}
	}
}
