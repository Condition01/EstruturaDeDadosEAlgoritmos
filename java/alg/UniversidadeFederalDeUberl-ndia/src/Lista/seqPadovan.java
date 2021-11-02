package Lista;

public class seqPadovan {
	public static void main(String[] args) {
		int num = 9;
		System.out.println(functionPadovan(num));
	}
	static int functionPadovan(int num) {
		if(num == 0 || num == 1 || num == 2) {
			return 1;
		}else {
			return functionPadovan(num-2) + functionPadovan(num-3);
		}
	}
}
