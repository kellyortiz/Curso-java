package exercicios04;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divis�o impossivel");
			}
			// exception
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}

		}
		sc.close();
	}
	
	

}
