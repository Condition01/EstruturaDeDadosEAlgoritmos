package Lista;

public class sequenciaFibo {
	public static void main(String[] args) {
		int num = 6;
		System.out.println(functionFibo(num));
	}
	static int functionFibo(int num) {
		if(num==0) {
			return 0;
		}else if(num==1){
			return 1;
		}else {
			return functionFibo(num-1) + functionFibo(num-2);
		}
	}
}
