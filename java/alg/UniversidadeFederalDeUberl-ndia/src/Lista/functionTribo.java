package Lista;

public class functionTribo {
	public static void main(String[] args) {
		int num = 7;
		System.out.println(functionTribo(num));
	}
	static int functionTribo(int num) {
		if(num==0) {
			return 0;
		}else if(num==1){
			return 0;
		}else if(num==2){
			return 1;
		}else {
			return  functionTribo(num-3) + functionTribo(num-2) + functionTribo(num-1);
		}
	}
}
