package aulas;

import java.util.Scanner;

public class Aula45 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int x = sc.nextInt();
		
		while (x != 0) {	
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma é: " + soma);
		
		sc.close();

	}

}
