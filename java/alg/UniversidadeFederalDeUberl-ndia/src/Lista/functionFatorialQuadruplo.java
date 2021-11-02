package Lista;

public class functionFatorialQuadruplo {
	public static void main(String[] args) {
		int num = 5;
		int i = 0;
		System.out.println(functionFatorialQuadruplo(num, i));
	}
	static int functionFatorialQuadruplo(int num, int i) {
		if(i == 0) {
			i++;
			return num = (functionFatorialQuadruplo(2*num, 2*num)) / functionFatorialQuadruplo(num, num);
		}else {
			if(i==1) {
				return num;
			}else {
				return num * functionFatorialQuadruplo(num-1, --i);
			}
		}
	}
}
