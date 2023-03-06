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
		
		System.out.println("Digite os lados do Triângulo 1.");
		System.out.print("Lado A: ");
		triangulo1.ladoA = scanner.nextDouble();
		System.out.print("Lado B: ");
		triangulo1.ladoB = scanner.nextDouble();
		System.out.print("Lado C: ");
		triangulo1.ladoC = scanner.nextDouble();
		
		System.out.println("\nDigite os lados do Triângulo 2.");
		System.out.print("Lado A: ");
		triangulo2.ladoA = scanner.nextDouble();
		System.out.print("Lado B: ");
		triangulo2.ladoB = scanner.nextDouble();
		System.out.print("Lado C: ");
		triangulo2.ladoC = scanner.nextDouble();
		
		double triangulo1Semiperimetro = (triangulo1.ladoA + triangulo1.ladoB + triangulo1.ladoC) / 2.0;
		double triangulo1Area = Math.sqrt(triangulo1Semiperimetro
				* (triangulo1Semiperimetro - triangulo1.ladoA)
				* (triangulo1Semiperimetro - triangulo1.ladoB)
				* (triangulo1Semiperimetro - triangulo1.ladoC));
		
		double triangulo2Semiperimetro = (triangulo2.ladoA + triangulo2.ladoB + triangulo2.ladoC) / 2.0;
		double triangulo2Area = Math.sqrt(triangulo2Semiperimetro
				* (triangulo2Semiperimetro - triangulo2.ladoA)
				* (triangulo2Semiperimetro - triangulo2.ladoB)
				* (triangulo2Semiperimetro - triangulo2.ladoC));
		
		System.out.printf("%nÁrea do Triângulo 1: %.4f%n", triangulo1Area);
		System.out.printf("Área do Triângulo 2: %.4f%n%n", triangulo2Area);
		
		if (triangulo1Area > triangulo2Area) {
			System.out.print("A Área do Triângulo 1 é maior.");
		}
		else {
			System.out.print("A Área do Triângulo 2 é maior.");
		}
		
		scanner.close();
	}

}
