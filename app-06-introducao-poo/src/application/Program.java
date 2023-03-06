package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Triangle;

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
		product.name = scanner.next();
		System.out.print("Pre�o: ");
		product.price = scanner.nextDouble();
		System.out.print("Quantidade: ");
		product.quantity = scanner.nextInt();
		
		System.out.println("\nDados do Produto");
		System.out.println("Nome: " + product.name);
		System.out.printf("Pre�o: R$%.2f%n", product.price);
		System.out.println("Quantidade: " + product.quantity);
	}

	public static void calcularAreaTriangulo(Scanner scanner) {
		
		Triangle triangulo1 = new Triangle();
		Triangle triangulo2 = new Triangle();
		
		System.out.println("Iniciando programa de c�lculo e compara��o de �reas de dois Tri�ngulos.");
		System.out.println("Digite os lados do Tri�ngulo 1.");
		System.out.print("Lado A: ");
		triangulo1.ladoA = scanner.nextDouble();
		System.out.print("Lado B: ");
		triangulo1.ladoB = scanner.nextDouble();
		System.out.print("Lado C: ");
		triangulo1.ladoC = scanner.nextDouble();
		
		System.out.println("\nDigite os lados do Tri�ngulo 2.");
		System.out.print("Lado A: ");
		triangulo2.ladoA = scanner.nextDouble();
		System.out.print("Lado B: ");
		triangulo2.ladoB = scanner.nextDouble();
		System.out.print("Lado C: ");
		triangulo2.ladoC = scanner.nextDouble();
		
		double areaTriangulo1 = triangulo1.area();
		double areaTriangulo2 = triangulo2.area();
		
		System.out.printf("%n�rea do Tri�ngulo 1: %.4f%n", areaTriangulo1);
		System.out.printf("�rea do Tri�ngulo 2: %.4f%n%n", areaTriangulo2);
		
		if (areaTriangulo1 > areaTriangulo2) {
			System.out.print("A �rea do Tri�ngulo 1 � maior.");
		}
		else {
			System.out.print("A �rea do Tri�ngulo 2 � maior.");
		}
	}
}
