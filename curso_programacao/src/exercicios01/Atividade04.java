package exercicios01;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numeroFunc, horasTrab;
		double salario, salarioTotal;
		
		numeroFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		salario = sc.nextDouble();
		
		salarioTotal = horasTrab * salario;
		
		System.out.printf("O numero do funcionário é: " + numeroFunc + " o total a pagar é: " + "%.2f%n", salarioTotal);

		sc.close();
	}

}
