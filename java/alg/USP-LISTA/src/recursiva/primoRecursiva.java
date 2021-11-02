package recursiva;

public class primoRecursiva {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(functionPrimo(n));
	}
	static int functionPrimo(int n) {
		if (n==0) {
			return 0;
		}else {
			if(verificaPrimo(n,n, 0)==2) {
				return n + functionPrimo(n-1);
			}else {
				return functionPrimo(n-1);
			}
		}
	}
	static int verificaPrimo(int n,int n2, int contador) {
		if(n2==0) {
			return contador;
		}else {
			if(n%n2==0) {
				return verificaPrimo(n, (n2-1), contador+1);
			}else {
				return verificaPrimo(n, (n2-1), contador);
			}
		}
	}
}
