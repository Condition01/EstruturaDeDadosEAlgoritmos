package wait;

public class now {
	public static void main(String[] args) {
		String palavra = "abc";
		int num = palavra.length()-1;
		System.out.println(functionRetornaImpar(palavra, num));
	}
	static String functionRetornaImpar(String palavra, int num) {
		if(num==0) {
			return Character.toString(palavra.charAt(num));
		}else if (num%2==0){
			return Character.toString(palavra.charAt(num)) + functionRetornaImpar(palavra, --num);
		}else {
			return functionRetornaImpar(palavra, --num);
		}
	}
}
