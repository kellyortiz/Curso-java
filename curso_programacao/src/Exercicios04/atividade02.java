package Exercicios04;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int somaIn = 0;
		int somaOut = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			
			if(x >= 10 && x<=20) {
				somaIn += 1;
			}
			else {
				somaOut += 1;
				
			}
		}
			System.out.println("in: " + somaIn);
			System.out.println("out: " + somaOut);
			
			sc.close();
	}
}
