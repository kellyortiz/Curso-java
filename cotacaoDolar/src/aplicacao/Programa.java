package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o preço do dolar? ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quanto de dolar você deseja comprar? ");
		double quantidade = sc.nextDouble();
		
		double resultado = Conversor.dolarReal(quantidade, precoDolar);
		System.out.printf("O valor em real é = %.2f%n", resultado);
		
		sc.close();
	}

}
