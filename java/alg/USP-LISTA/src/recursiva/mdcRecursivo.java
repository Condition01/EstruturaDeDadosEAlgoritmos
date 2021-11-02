package recursiva;

public class mdcRecursivo {
	public static void main(String[] args) {
		int numUm = 20;
		int numDois = 8;
		int achado = 0;
		int maior;
		if(numUm > numDois) {
			maior = numUm;
		}else {
			maior = numDois;
		}
		achado = mdcRecursion(numUm, numDois, achado, maior);
		if(achado==0) {
			System.out.println("não existe MDC");
		}else {
			System.out.println("MDC = " + achado);
		}
		
	}
	static int mdcRecursion(int numUm, int numDois, int achado, int maior) {
		if(maior == 2) {
			if(numUm%maior==0 & numDois%maior==0) {
				if(maior > achado) {
					return maior;
				}
				return achado;
			}
			else {
				return achado;
			}
		}else {
			if(numUm%maior==0 & numDois%maior==0) {
				return maior;
			}else {
				return mdcRecursion(numUm, numDois, achado, maior-1);
			}
		}
	}
}
