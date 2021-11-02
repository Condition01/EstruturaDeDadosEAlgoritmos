package nonrecursiva;

public class HipotenusaInteiros {
	public static void main(String[] args) {
		int catetoUm, catetoDois, hipotenusa,n=10;
		boolean achou;
		for(hipotenusa = 1;hipotenusa <= n;hipotenusa++) {
			for(catetoUm = 1; catetoUm < hipotenusa  ;catetoUm++) {
				for(catetoDois = 1; catetoDois <hipotenusa; catetoDois++) {
					if(catetoUm*catetoUm + catetoDois*catetoDois == hipotenusa*hipotenusa) {
						System.out.println("Cateto1² (" + catetoUm*catetoUm + ") + Cateto2² (" + catetoDois*catetoDois + ") = " + " hipotenusa² (" + hipotenusa*hipotenusa + ")");
					}
				}
			}
		}
	}
}
