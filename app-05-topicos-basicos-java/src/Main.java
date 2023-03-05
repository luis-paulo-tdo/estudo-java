import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Operadores Bitwise em Java
		
		Scanner scanner = new Scanner(System.in);
		int numeroBitwise1 = 89;
		int numeroBitwise2 = 60;
		
		System.out.println("Iniciando Operações Bitwise:");
		System.out.printf("89 & 60 = %d%n", numeroBitwise1 & numeroBitwise2);
		System.out.printf("89 | 60 = %d%n", numeroBitwise1 | numeroBitwise2);
		System.out.printf("89 ^ 60 = %d%n", numeroBitwise1 ^ numeroBitwise2);
		System.out.printf("Operações Bitwise finalizadas.%n%n");
		
		System.out.println("Iniciando Teste do Sexto Bit...");
		System.out.print("Digite o código de sua credencial: ");
		int mascaraBitwise = 0b100000;
		int codigoBitwise = scanner.nextInt();
		
		if ((codigoBitwise & mascaraBitwise) != 0) {
			System.out.println("Credencial Válida!");
		} else {
			System.err.println("Credencial Inválida!");
		}
		
		scanner.close();
	}

}
