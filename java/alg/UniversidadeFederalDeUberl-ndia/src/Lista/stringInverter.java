package Lista;

public class stringInverter {
	public static void main(String[] args) {
		String element = "asd";
		int i = element.length() - 1;
		System.out.println(invertString(element, i));
	}

	static String invertString(String element, int i) {
		if (i == 0) {
			return Character.toString(element.charAt(i));
		} else {
			return Character.toString(element.charAt(i)) + invertString(element, --i);
		}
	}
}
