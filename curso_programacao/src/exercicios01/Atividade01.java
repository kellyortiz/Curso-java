package exercicios01;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(" A soma é: " + (soma = a + b));
		
		sc.close();
		
	}

}
