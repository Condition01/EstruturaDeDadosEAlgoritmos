package Lista;

public class imprimeCresc {
	public static void main(String[] args) {
		int num = 21;
		int num2 = 0;
		System.out.println(imprimeCresc(num, num2));
	}
	static int imprimeCresc(int num, int num2) {
		
		if(num2 == num) {
			return num;
		}else {
			System.out.println(num2);
			return imprimeCresc(num, ++num2);
		}
	}
}
