package Aulas;
import java.util.Locale;

public class aula24 {

	public static void main(String[] args) {

		int y = 32;
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		String nome = "Maria";
		

		System.out.println("Numero inteiro: " + x);
		
		// Antes do locale fica com virgula o double
		System.out.printf("Formatação de duas casas decimais: " + "%.2f%n", x);
		System.out.printf("Formatação de quatro casas decimais: " + "%.4f%n", x);
		
		// Depois do locale fica com ponto o double
		Locale.setDefault(Locale.US);
		System.out.printf("Formatação de duas casas decimais com locale: " + "%.2f%n", x);
		System.out.printf("Formatação de quatro casas decimais com locale: " + "%.4f%n", x);
		
		// Concatenar elementos
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
