public class Palindromo {

	public static void main(String[] args) {

		String a = "hellolleh";
		String b = "henrique";
		palindromo(a)
	}

	public static void palindromo(String palavra) {

		String nova = palavra.toLowerCase();

		for (int i = 0; i < nova.length(); i++) {
			char entrada = nova.charAt(i);
			char saida = nova.charAt((nova.length() - i) - 1);
			
			if (entrada == saida) {
				System.out.println("YES, " + entrada + ", " + saida);
			} else {
				System.out.println("NO, " + entrada + ", " + saida);
			}

		}

	}
}
