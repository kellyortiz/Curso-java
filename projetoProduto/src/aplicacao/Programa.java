package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira os dados do produto: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produtos produtos = new Produtos(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Informações do produto: " + produtos);
		
		System.out.println();
		System.out.print("Insira o número de produtos a serem adicionados em estoque: ");
		quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtos);
		
		System.out.println();
		System.out.print("Insira o número de produtos a serem removidos em estoque: ");
		quantidade = sc.nextInt();
		produtos.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtos);
		
		sc.close();
	}
}
