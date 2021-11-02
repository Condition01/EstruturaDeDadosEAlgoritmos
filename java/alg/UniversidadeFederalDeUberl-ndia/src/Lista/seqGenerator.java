package Lista;

public class seqGenerator {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(seqGen(num));
	}
	static int seqGen(int num) {
		if(num == 1) {
			return 1;
		}else if(num == 2) {
			return 2;
		}else {
			return 2*seqGen(num-1) + 3*seqGen(num-2);
		}
	}
}
