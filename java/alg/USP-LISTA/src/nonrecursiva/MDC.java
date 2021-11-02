package nonrecursiva;

public class MDC {
	public static void main(String[] args) {
		int numUm = 8;
		int numDois = 15;
		int maior;
		int mdc = 0;
		if(numUm>numDois) {
			maior = numUm;
		}else {
			maior = numDois;
		}
		for(int i=2;i<=maior;i++) {
			if(numUm%i==0 && numDois%i==0) {
				mdc= i;
			}
		}
		if(mdc == 0) {
			System.out.println("numeros não contém MDC");
		}else {
			System.out.println("MDC = " + mdc);
		}
	}
}
