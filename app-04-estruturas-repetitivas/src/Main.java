import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// Código para demonstrar a utilização do debug no Eclipse
		
		System.out.println("Calculadora de Área e Preço de um Terreno. Vamos começar?");
		
		System.out.print("Defina a largura: ");
		double largura = scanner.nextDouble();
		
		System.out.printf("Defina o comprimento: ");
		double comprimento = scanner.nextDouble();
		
		System.out.printf("Defina o metro quadrado do terreno: ");
		double metroQuadrado = scanner.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("%nResultado:%n");
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n%n", preco);
		
		
		// Estrutura Repetitiva Enquanto (While)
		
		System.out.println("Calculadora de Soma While. Digite uma sequência de números a serem somados. Ao final digite 0 para obter o resultado:");
		int indexWhile = 1;
		int somatorioWhile = 0;
		
		System.out.printf("Número %d: ", indexWhile);
		int numeroWhile = scanner.nextInt();
		indexWhile++;
		
		while (numeroWhile != 0) {
			somatorioWhile += numeroWhile;
			System.out.printf("Número %d: ", indexWhile);
			numeroWhile = scanner.nextInt();
			indexWhile++;
		}
		
		System.out.printf("Soma Final = %d%n%n", somatorioWhile);
		
		
		// Estrutura Repetitiva Para (For)
		
		System.out.println("Calculadora de Soma For.");
		System.out.print("Digite a quantidade de números que serão usados na soma: ");
		int repeticoesFor = scanner.nextInt();
		int somatorioFor = 0;
		
		for (int indexFor = 1; indexFor <= repeticoesFor; ++indexFor) {
			System.out.printf("Número %d: ", indexFor);
			int numeroFor = scanner.nextInt();
			somatorioFor += numeroFor;
		}
		
		System.out.printf("Soma Final = %d%n%n", somatorioFor);
		
		scanner.close();
	}

}
