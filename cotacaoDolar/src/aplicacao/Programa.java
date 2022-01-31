package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual � o pre�o do dolar? ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quanto de dolar voc� deseja comprar? ");
		double quantidade = sc.nextDouble();
		
		double resultado = Conversor.dolarReal(quantidade, precoDolar);
		System.out.printf("O valor em real � = %.2f%n", resultado);
		
		sc.close();
	}

}
