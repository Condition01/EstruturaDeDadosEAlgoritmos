package catalan;

public class Principal {

	public static void main(String[] args) {

		int paramFinal = 4;
		CatalanRecursivo cr = new CatalanRecursivo();
		for (int i = 0; i < paramFinal; i++) {
			System.out.println(cr.catalan(i));
		}
	}

}