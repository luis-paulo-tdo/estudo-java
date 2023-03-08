package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		controlarEstoqueProduto(scanner);
		
		scanner.close();
	}
	
	public static void controlarEstoqueProduto(Scanner scanner) {
		
		Product product = new Product();
		
		System.out.println("Iniciando programa controle de estoque de um Produto.");
		System.out.println("Insira os dados do produto.");
		System.out.print("Nome: ");
		product.setName(scanner.next());
		System.out.print("Preço: ");
		product.setPrice(scanner.nextDouble());
		
		System.out.println();
		System.out.println("Dados do Produto\n" + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos adicionados em estoque: ");
		product.addProducts(scanner.nextInt());
		
		System.out.println();
		System.out.println("Dados Atualizados do Produto\n" + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos para serem removidos do estoque: ");
		product.removeProducts(scanner.nextInt());
		
		System.out.println();
		System.out.println("Dados Atualizados do Produto\n" + product);
	}
}
