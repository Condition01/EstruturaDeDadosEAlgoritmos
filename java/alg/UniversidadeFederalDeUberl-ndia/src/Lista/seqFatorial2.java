package Lista;

public class seqFatorial2 {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(functionFatorial(num));
	}
	static String functionFatorial(int num) {
		if(num == 0) {
			return "b";
		}else if(num == 1) {
			return "a";
		}else {
			return functionFatorial(num-1) + functionFatorial(num-2);
		}
	}
}
