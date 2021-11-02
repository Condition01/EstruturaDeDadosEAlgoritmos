package nonrecursiva;

public class sequenciaNumeros {
	public static void main(String[] args) {
		int x,y;
		int m=5, n=4;
		int xmax=0, ymax=0;
		int valorMax = 0;
		int valor;
		for(x=0;x<=m;x++) {
			for(y=0;y<=n;y++) {
				valor = (x*y) - (x*x) + y;
				if(valor > valorMax) {
					valorMax = valor;
					xmax = x;
					ymax = y;
				}
			}
		}
		System.out.println("Valor maximo da função representado x(" + xmax + ")" + " y(" + ymax + ") resultado --> " +valorMax);
	}
}
