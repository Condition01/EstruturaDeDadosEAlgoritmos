package Lista;

public class funcaoH {
	public static void main(String[] args) {
		int m = 2;
		int n = 2;
		System.out.println(seqH(m, n));
	}
	static int seqH(int m,int n) {
		if(m == 1) {
			return n+1;
		}else if(n == 1) {
			return m+1;
		}else {
			return seqH(m, n-1) - seqH(m-1, n);
		}
	}
}
