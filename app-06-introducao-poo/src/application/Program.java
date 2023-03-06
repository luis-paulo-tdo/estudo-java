package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Triangle triangulo1 = new Triangle();
		Triangle triangulo2 = new Triangle();
		
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
		
		scanner.close();
	}

}
