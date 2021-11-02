package nonrecursiva;

public class SequenciaNum {
	public static void main(String[] args) {
		String sequencia = "112233445566";
		int contadorUm = 0;
		int contadorDois = 0;
		int cta = 0;
		int modResult = Integer.parseInt(Character.toString(sequencia.charAt(0)))%2;
		boolean real = true;
		while(Integer.parseInt(Character.toString(sequencia.charAt(cta)))%2==modResult) {
			contadorUm++;
			cta++;
		}
		for(int i=cta;i<sequencia.length() && real == true;i++) {
			if(Integer.parseInt(Character.toString(sequencia.charAt(i)))%2==modResult) {
				if(Integer.parseInt(Character.toString(sequencia.charAt(i-1)))%2!=modResult) {
					if(contadorDois != contadorUm) {
						real = false;
					}else {
						contadorDois = 0;
						contadorDois++;
					}
				}else {
					contadorDois++;
				}
			}else {
				if(Integer.parseInt(Character.toString(sequencia.charAt(i-1)))%2==modResult && i!= cta) {
					if(contadorDois != contadorUm) {
						real = false;
					}else {
						contadorDois = 0;
						contadorDois++;
					}
				}else {
					contadorDois++;
				}
			}
		}
		if(real == false) {
			System.out.println("Sequencia não alternante ");
		}else {
			System.out.println("Sequencia alternante em k = " + contadorDois);
		}
	
	}
}
