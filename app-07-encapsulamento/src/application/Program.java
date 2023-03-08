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
		
		System.out.println("Iniciando programa controle de estoque de um Produto.");
		System.out.println("Insira os dados do produto.");
		System.out.print("Nome: ");
		String name = scanner.next();
		System.out.print("Preço: ");
		double price = scanner.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Dados do Produto\n" + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos adicionados em estoque: ");
		int newQuantity = scanner.nextInt();
		product.addProducts(newQuantity);
		
		System.out.println();
		System.out.println("Dados Atualizados do Produto\n" + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos para serem removidos do estoque: ");
		newQuantity = scanner.nextInt();
		product.removeProducts(newQuantity);
		
		System.out.println();
		System.out.println("Dados Atualizados do Produto\n" + product);
	}
}
