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
		System.out.printf("Preço = %.2f%n", preco);
		
		scanner.close();
	}

}
