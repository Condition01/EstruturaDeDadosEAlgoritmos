package Lista;

public class recursivParDecres {
	public static void main(String[] args) {
		int num = 211;
		int num2 = num;
		System.out.println(imprimeCresc(num, num2));
	}

	static int imprimeCresc(int num, int num2) {
		if (num2 == 0) {
			return num2;
		}else {
			if(num2%2==0) {
				System.out.println(num2);	
			}
			return imprimeCresc(num, --num2);
		}
	}
}
