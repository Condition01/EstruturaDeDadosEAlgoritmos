package Lista;

public class multNaturais {
	public static void main(String[] args) {
		int num = 5;
		int num2 = 4;
		System.out.println(multSeq(num, num2));
	}
	static int multSeq(int num, int num2) {
		if(num2==1) {
			return num;
		}else {
			return num + multSeq(num, --num2);
		}
	}
	
}
