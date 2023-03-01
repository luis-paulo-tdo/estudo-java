import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Estrutura Condicional If-Else
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas s�o?");
		hora = scanner.nextInt();
		
		if (hora < 12) {			
			System.out.printf("%nBom dia!");
		} else {
			if (hora < 18) {
				System.out.printf("%nBoa tarde!");
			} else {
				System.out.printf("%nBoa noite!");
			}
		}
		
		System.out.printf("%n");
		
		// Operadores de Atribui��o Cumulativos
		
		System.out.println("Quantos minutos voc� consumiu em sua liga��o?");
		int minutos = scanner.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
		
		System.out.printf("%nValor da conta = R$ %.2f%n", conta);
		
		// Estrutura Condicional Switch-Case
		
		System.out.println("Que dia da semana � hoje?");
		int dia = scanner.nextInt();
		String resultado;
		
		switch (dia) {
		case 1:
			resultado = "Domingo";
			break;
		case 2:
			resultado = "Segunda";
			break;
		case 3:
			resultado = "Ter�a";
			break;
		case 4:
			resultado = "Quarta";
			break;
		case 5:
			resultado = "Quinta";
			break;
		case 6:
			resultado = "Sexta";
			break;
		case 7:
			resultado = "S�bado";
			break;
		default:
			resultado = "Valor inv�lido";
			break;
		}
		
		System.out.printf("%nDia da semana: %s", resultado);
		System.out.printf("%n");
		
		scanner.close();
	}

}
