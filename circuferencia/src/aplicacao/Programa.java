package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor do raio: ");
		
		double radius = sc.nextDouble();
		double c = Calculadora.circuferencia(radius);
		double v = Calculadora.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculadora.PI);
		
		sc.close();
	}
}
