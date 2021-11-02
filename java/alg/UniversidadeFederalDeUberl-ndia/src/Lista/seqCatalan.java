package Lista;

public class seqCatalan {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(functionCatalan(num));
	}
	static int functionCatalan(int num) {
		if (num == 0) {
			return 1;
		}else {
			 return (2*((2*num) - 1)/(num+1)*functionCatalan(num-1));// + functionCatalan(num-2);
		}
	}
	
}
