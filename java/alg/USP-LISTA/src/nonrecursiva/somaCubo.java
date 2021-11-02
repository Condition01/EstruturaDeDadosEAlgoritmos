package nonrecursiva;

public class somaCubo {
	public static void main(String[] args) {
		int base = 4;
		int aux = 1;
		int soma = 0;
		for(int i=1;i<=base;i++) {
			for(int j=1;j<=i;j++) {
				
				if(i==base) {
					soma += aux;
				}
				aux += 2;
			}
			
		}
		System.out.println(soma);
	}
}
