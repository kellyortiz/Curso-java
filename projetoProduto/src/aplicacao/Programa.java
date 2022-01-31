package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.println("Insira os dados do produto: ");
		
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Informações do produto: " + produto);
		
		System.out.println();
		System.out.print("Insira o número de produtos a serem adicionados em estoque: ");
		
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Insira o número de produtos a serem removidos em estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}
}
