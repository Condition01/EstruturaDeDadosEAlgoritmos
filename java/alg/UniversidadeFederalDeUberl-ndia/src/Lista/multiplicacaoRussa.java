package Lista;

public class multiplicacaoRussa {
	public static void main(String[] args) {
		int A = 27;
		int B = 82;
		System.out.println(functionMultRussa(A, B));
	}
	static int functionMultRussa(int A, int B) {
		if(A <= 1) {
			return B;
		}else if(A%2==1){
			return B + functionMultRussa(A/2, B*2);
		}else {
			return functionMultRussa(A/2, B*2);
		}
	}
}
