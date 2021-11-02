package Lista;

public class seqPell {
	public static void main(String[] args) {
		int num = 6;
		System.out.println(sequenciaDePell(num));
	}
	static int sequenciaDePell(int num) {
		if(num == 0) {
			return 0;
		}else if(num == 1) {
			return 1;
		}else {
			return 2*sequenciaDePell(num-1) + sequenciaDePell(num-2);
		}
	}
}
