public class Palindromo {

	public static void main(String[] args) {

		String a = "hellolleh";
		String b = "henrique";
		palindromo(a);
	}

//	public static void palindromo(String palavra) {
//
//		StringBuilder nova = new  StringBuilder(palavra.toLowerCase());
//
//		for (int i = 0; i < nova.length()/2; i++) {
//			if (nova.charAt(i) != nova.reverse().charAt(i)) {
//				System.out.println("NO" );
//				return;
//			}
//		}
//		System.out.println("YES" );
//	}

	public static void palindromo(String palavra) {
		StringBuilder nova = new StringBuilder(palavra.toLowerCase());

		if (!palavra.toLowerCase().equals(nova.reverse().toString())) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
	}
}
