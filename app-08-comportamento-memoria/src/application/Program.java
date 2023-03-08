package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Iniciando programa de cálculo de média artmética de alturas.");
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
		
		scanner.close();
	}

}
