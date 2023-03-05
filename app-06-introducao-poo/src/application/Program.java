package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double triangulo1LadoA, triangulo1LadoB, triangulo1LadoC;
		double triangulo2LadoA, triangulo2LadoB, triangulo2LadoC;
		
		System.out.println("Digite os lados do Triângulo 1.");
		System.out.print("Lado A: ");
		triangulo1LadoA = scanner.nextDouble();
		System.out.print("Lado B: ");
		triangulo1LadoB = scanner.nextDouble();
		System.out.print("Lado C: ");
		triangulo1LadoC = scanner.nextDouble();
		
		System.out.println("\nDigite os lados do Triângulo 2.");
		System.out.print("Lado A: ");
		triangulo2LadoA = scanner.nextDouble();
		System.out.print("Lado B: ");
		triangulo2LadoB = scanner.nextDouble();
		System.out.print("Lado C: ");
		triangulo2LadoC = scanner.nextDouble();
		
		double triangulo1Semiperimetro = (triangulo1LadoA + triangulo1LadoB + triangulo1LadoC) / 2.0;
		double triangulo1Area = Math.sqrt(triangulo1Semiperimetro
				* (triangulo1Semiperimetro - triangulo1LadoA)
				* (triangulo1Semiperimetro - triangulo1LadoB)
				* (triangulo1Semiperimetro - triangulo1LadoC));
		
		double triangulo2Semiperimetro = (triangulo2LadoA + triangulo2LadoB + triangulo2LadoC) / 2.0;
		double triangulo2Area = Math.sqrt(triangulo2Semiperimetro
				* (triangulo2Semiperimetro - triangulo2LadoA)
				* (triangulo2Semiperimetro - triangulo2LadoB)
				* (triangulo2Semiperimetro - triangulo2LadoC));
		
		System.out.printf("%n%nÁrea do Triângulo 1: %.4f%n", triangulo1Area);
		System.out.printf("Área do Triângulo 2: %.4f%n", triangulo2Area);
		
		if (triangulo1Area > triangulo2Area) {
			System.out.print("A Área do Triângulo 1 é maior.");
		}
		else {
			System.out.print("A Área do Triângulo 2 é maior.");
		}
		
		scanner.close();
	}

}
