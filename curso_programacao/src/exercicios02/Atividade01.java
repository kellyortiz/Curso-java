package exercicios02;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		num = sc.nextInt();	
		
		if (num < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("N�o negativo");
		}
		
		sc.close();
	}

}
