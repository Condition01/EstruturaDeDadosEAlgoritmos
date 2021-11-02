package Lista;

public class superFatorial {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(sequencia(num));
	}
	static int fatorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num * fatorial(--num);
		}
	}
	static int sequencia(int num) {
		if(num == 1) {
			return num;
		}else {
			return fatorial(num) * sequencia(--num);
		}
	}
}
