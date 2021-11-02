package recursiva;

public class SequenciaPares {
	public static void main(String[] args) {
		String seqUm = "123456";
		String seqDois = "123456";
		int num = seqUm.length()-1;
		System.out.println(functionSerie(seqUm, seqDois, num));
	}
	static int functionSerie(String seqUm, String seqDois, int num) {
		if(num == 0) {
			if(seqUm.charAt(num)%2==0 &&  seqDois.charAt(num)%2==0) {
				return (Integer.parseInt(Character.toString(seqUm.charAt(num))) + Integer.parseInt(Character.toString(seqDois.charAt(num))));
			}else {
				return 0;
			}
		}else {
			if(seqUm.charAt(num)%2==0 &&  seqDois.charAt(num)%2==0) {
				return (Integer.parseInt(Character.toString(seqUm.charAt(num))) + Integer.parseInt(Character.toString(seqDois.charAt(num))))
							+ functionSerie(seqUm, seqDois, num-1);
			}else {
				return + functionSerie(seqUm, seqDois, num-1);
			}
		}
	}
}
