package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scanner = new Scanner(System.in);
		
		forEach();
		
		scanner.close();
	}
	
	public static void forEach() {
		
		// Sintaxe For Each
		
		System.out.println("Percorrendo Arrays com o For Each.");
		String[] vetorForEach = new String[] { "Maria", "Bob", "Alex" };
		
		int numeroForEach = 1;
		for (String item : vetorForEach) {
			System.out.println("Item #" + numeroForEach + ": " + item);
			numeroForEach++;
		}
	}
	
	public static void boxingUnboxingWrapper() {
		
		// Conversão de Tipos Primitivos em Tipos Referência e vice-versa
		
		int numeroBoxing = 20;
		Object objetoBoxing = numeroBoxing;
		System.out.println("Valor de um inteiro encaixotado: " + objetoBoxing);
		
		int numeroUnboxing = (int) objetoBoxing;
		System.out.println("Valor de um inteiro desencaixotado: " + numeroUnboxing);
	}
	
	public static void calcularMediaPrecos() {
		
		// Array de Tipos Referência
		
		System.out.println("Iniciando programa de cálculo de média aritmética de preços de um conjunto de produtos.");
		System.out.print("Digite a quantidade de preços que você deseja calcular a média: ");
		int quantidade = scanner.nextInt();
		Product[] produtos = new Product[quantidade];
		
		for (int i = 0; i < produtos.length; ++i) {
			
			scanner.nextLine();
			System.out.printf("\nDigite os dados do Produto #%d%n", i + 1);
			
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Preço: R$");
			double preco = scanner.nextDouble();
			
			produtos[i] = new Product(nome, preco);
		}
		
		double somatorio = 0.0;
		for (int i = 0; i < produtos.length; ++i) {
			somatorio += produtos[i].getPrice();
		}
		
		double media = somatorio / quantidade;
		System.out.printf("\nMédia dos preços: R$%.2f", media);
	}

	public static void calcularMediaAlturas() {
		
		// Array de Tipos Primitivos
		
		System.out.println("Iniciando programa de cálculo de média aritmética de alturas.");
		System.out.print("Digite a quantidade de alturas que você deseja calcular a média: ");
		int quantidade = scanner.nextInt();
		double[] alturas = new double[quantidade];
		
		for (int i = 0; i < quantidade; ++i) {
			System.out.printf("Digite a altura #%d: ", i + 1);
			alturas[i] = scanner.nextDouble();
		}
		
		double somatorio = 0.0;
		for (int i = 0; i < quantidade; ++i) {
			somatorio += alturas[i];
		}
		
		double media = somatorio / quantidade;
		System.out.printf("Média das alturas: %.2f", media);
	}
}
