package aulas;

public class Aula59 {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";

		// letra minuscula
		String s01 = original.toLowerCase();
		
		// letra maiscula	
		String s02 = original.toUpperCase();
		
		//tirar o espaço
		String s03 = original.trim();
		
		//Inicio da recortagem de string
		String s04 = original.substring(2);
		
		//Inicio e fim da recortagem de string
		String s05 = original.substring(2,9);
		
		//Substituir caracter ou substring		
		String s06 = original.replace('a', 'x');
		
		// Onde localiza a primeira e ultima ocorrencia
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " + original + "-");
		System.out.println("toLoweCase: " + s01 + "-");
		System.out.println("toUpperCase: " + s02 + "-");
		System.out.println("trim: " + s03 + "-");
		System.out.println("substring: " + s04 + "-");
		System.out.println("substring (2.9): " + s05 + "-");
		System.out.println("replace ('a', 'x'): " + s06 + "-");
		System.out.println("indexOf ('bc'): " + i + "-");
		System.out.println("lastIndexOf ('bc'): " + j + "-");
	}

}
