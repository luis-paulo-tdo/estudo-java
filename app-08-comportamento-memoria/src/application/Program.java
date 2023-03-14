package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		scanner = new Scanner(System.in);
		
		matrizes();
		
		scanner.close();
	}
	
	public static void matrizes() {
		
		System.out.println("Manipulando Matrizes no Java.");
		System.out.print("Digite o tamanho cúbico da matriz: ");
		
		int tamanho = scanner.nextInt();
		int[][] matriz = new int[tamanho][tamanho];
		
		System.out.println();
		for (int i = 0; i < matriz.length; ++i) {
			for (int j = 0; j < matriz[i].length; ++j) {
				System.out.printf("Digite o valor da linha %d e colunca %d: ", i, j);
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Estrutura da Matriz:");
		for (int i = 0; i < matriz.length; ++i) {
			System.out.print("|\t");
			for (int j = 0; j < matriz[i].length; ++j) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("|\n");
		}
		
		System.out.println();
		System.out.print("Números da diagonal principal: ");
		for (int i = 0; i < matriz.length; ++i) {
			System.out.print(matriz[i][i] + "\t");
		}
		
		System.out.println();
		System.out.print("Quantidade de números negativos: ");
		int quantidadeNegativos = 0;
		for (int i = 0; i < matriz.length; ++i) {
			for (int j = 0; j < matriz[i].length; ++j) {
				if (matriz[i][j] < 0) {
					quantidadeNegativos++;
				}
			}
		}
		System.out.print(quantidadeNegativos);
	}
	
	public static void listas() {
		
		System.out.println("Manipulando Listas no Java.");
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Alex");
		nomes.add("Bob");
		nomes.add("Anna");
		
		System.out.println();
		System.out.println("Imprimindo os nomes adicionados em uma lista com o método add():");
		imprimirNomes(nomes);
		
		System.out.println();
		System.out.println("Adicionando Marco na posição 2 com o add(posicao, nome):");
		
		nomes.add(2, "Marco");
		imprimirNomes(nomes);
		System.out.println("Utilizando método size() para obter o tamanho da lista: " + nomes.size());
		
		System.out.println();
		System.out.println("Removendo Anna da lista com o remove(nome):");
		
		nomes.remove("Anna");
		imprimirNomes(nomes);
		
		System.out.println();
		System.out.println("Usando removeIf(predicado) para remover todos os nomes que começam com a letra 'M':");
		
		nomes.removeIf(n -> n.charAt(0) == 'M');
		imprimirNomes(nomes);
		System.out.println("Usando o indexOf(nome) para encontrar a posição de Bob: " + nomes.indexOf("Bob"));
		System.out.println("Usando o indexOf(nome) com um nome que não está na lista: " + nomes.indexOf("Marco"));
		
		System.out.println();
		System.out.println("Adicionando novamente todos os nomes na lista:");
		nomes.add("Maria");
		nomes.add("Anna");
		nomes.add("Marco");
		imprimirNomes(nomes);
		
		System.out.println();
		System.out.println("Filtrando nomes que começam apenas com a letra 'M':");
		List<String> nomesM = nomes.stream().filter(n -> n.charAt(0) == 'M').collect(Collectors.toList());
		imprimirNomes(nomesM);
		
		System.out.println();
		System.out.println("Primeiro nome com letra 'B': " + nomes.stream().filter(n -> n.charAt(0) == 'B').findFirst().orElse(null));
	}
	
	private static void imprimirNomes(List<String> nomes) {
		for (String nome : nomes) {
			System.out.println("- " + nome);
		}
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
