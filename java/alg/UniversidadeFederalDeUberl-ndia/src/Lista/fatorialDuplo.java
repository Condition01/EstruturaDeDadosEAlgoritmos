package Lista;

public class fatorialDuplo {
	public static void main(String[] args) {
		int num = 7;
		System.out.println(functionFatorialDuplo(num));
	}
	static int functionFatorialDuplo(int num) {
		if (num == 1) {
			return num;
		}else {
			return num * functionFatorialDuplo(num-2);
		}
	}
}
