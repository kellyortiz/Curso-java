package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira os dados do retangulo: ");
		
		System.out.print("Altura: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.print("Base: ");
		retangulo.base = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		sc.close();

	}

}
