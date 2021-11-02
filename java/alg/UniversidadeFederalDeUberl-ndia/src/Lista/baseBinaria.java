package Lista;

public class baseBinaria {
	public static void main(String[] args) {
		int num = 133;
		int num2 = 1;
		System.out.println(inverter(baseBinaria(num)));
	}
	static String baseBinaria(int num) {
		if (num<2) {
			return Integer.toString(num);
		}else {
			return Integer.toString(num%2) + baseBinaria(num/2);
		}
	}
	static String inverter(String num) {
		if(Integer.parseInt(num)<2) {
			return num;
		}else {
			
			int numb = Integer.parseInt(num)%10;
			int numbb = Integer.parseInt(num)/10;
			return numb + inverter(Integer.toString(numbb));
		}
	
	}
}
