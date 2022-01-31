package exercicios01;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo01, codigo02, qtd01, qtd02;
	    double preco1, preco2, valorTotal;

	    codigo01 = sc.nextInt();
	    qtd01 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    codigo02 = sc.nextInt();
	    qtd02 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    valorTotal = (preco1 * qtd01) + (preco2 * qtd02);

	    System.out.printf("Total: R$ %.2f%n", valorTotal);
		
		sc.close();

	}

}
