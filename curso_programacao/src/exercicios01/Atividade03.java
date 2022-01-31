package exercicios01;

import java.util.Scanner;

public class Atividade03 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D, diferencia;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferencia = (A*B-C*D);
		
		System.out.println("A diferencia é: " + diferencia);
		
		sc.close();
		
	}
}
