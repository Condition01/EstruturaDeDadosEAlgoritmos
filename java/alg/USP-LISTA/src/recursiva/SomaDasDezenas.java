package recursiva;

public class SomaDasDezenas {
	public static void main(String[] args) {
		int num = 6666;
		int num2 = 0;
		System.out.println(functionReturn(num, num2));
	}
	static int functionReturn(int num, int num2) {
		if(num < 100) {
			return num + num2;
		}else {
			return functionReturn(num/100, num % 100);
		}
	}
}
