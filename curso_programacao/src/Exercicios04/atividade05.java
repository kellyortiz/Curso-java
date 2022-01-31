package Exercicios04;

import java.util.Scanner;

public class atividade05 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
			
			int fatorial = 1;
			for (int i=1; i<=n; i++) {
				fatorial *= i;
			}
			
			System.out.println("O valor do fatorial é: " + fatorial);
			
			sc.close();
	}

}

