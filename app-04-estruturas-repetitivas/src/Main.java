import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// C�digo para demonstrar a utiliza��o do debug no Eclipse
		
		System.out.println("Calculadora de �rea e Pre�o de um Terreno. Vamos come�ar?");
		
		System.out.print("Defina a largura: ");
		double largura = scanner.nextDouble();
		
		System.out.printf("Defina o comprimento: ");
		double comprimento = scanner.nextDouble();
		
		System.out.printf("Defina o metro quadrado do terreno: ");
		double metroQuadrado = scanner.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("%nResultado:%n");
		System.out.printf("�rea = %.2f%n", area);
		System.out.printf("Pre�o = %.2f%n", preco);
		
		scanner.close();
	}

}
