package Lista;

public class multInteiros {
	public static void main(String[] args) {
		int num = 3;
		int num2 = 5;
		System.out.println(multiRecurs(num, num2));
	}
	static int multiRecurs(int num, int num2) {
		if(num2==1) {
			return num;
		}else {
			return num + multiRecurs(num, --num2);
		}
	}
}
