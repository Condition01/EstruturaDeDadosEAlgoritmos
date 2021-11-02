package Lista;

public class functionTetraNaci {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(functionTetra(num));
	}
	static int functionTetra(int num) {
		if(num==0) {
			return 0;
		}else if(num==1){
			return 0;
		}else if(num==2){
			return 0;
		}else if(num==3) {
			return 1;
		}else {
			return  functionTetra(num-4) + functionTetra(num-3) + functionTetra(num-2) + functionTetra(num-1);
		}
	}
}
