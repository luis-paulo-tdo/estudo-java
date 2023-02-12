import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int numero1 = 15;
		double decimal1 = 33.34597;
		
		int idade = 33;
		double altura = 1.7145;
		String nome = "Luis Paulo";
		
		System.out.printf("Bom dia!%n%n");
		
		// Exemplos Sa�da de Dados
		
		System.out.println("4.4. Sa�da de Dados em Java:");
		System.out.println("Agora s�o " + numero1 + " horas.");
		System.out.printf("A temperatura de hoje em � %.2f Graus Celsius.%n", decimal1);
		System.out.printf("Neste ano, %s, voc� completou %d anos. Sua altura passou para %.2f.%n%n", nome, idade, altura);
		
		// Exemplos de Processamento de Dados
		
		int numero2;
		double decimal2;
		
		numero2 = 5;
		decimal2 = 2 * numero2;
		
		double baseMenor, baseMaior, alturaTrapezio, area;
		
		baseMenor = 6.0;
		baseMaior = 8.0;
		alturaTrapezio = 5.0;
		area = (baseMenor + baseMaior) / 2.0 * alturaTrapezio;
		
		int numero3, numero4;
		double resultado1;
		
		numero3 = 5;
		numero4 = 2;
		resultado1 = (double) numero3 / numero4;
		
		double decimal3;
		int numero5;
		
		decimal3 = 5.0;
		numero5 = (int) decimal3;
		
		System.out.println("4.5. Processamento de Dados em Java e Casting:");
		System.out.println("O valor do numero2 �: " + numero2);
		System.out.printf("O valor do numero3 �: %.1f%n", decimal2);
		System.out.printf("A �rea do trap�zio �: %.1f%n", area);
		System.out.printf("A divis�o de numero3 por numero4 �: %.1f%n", resultado1);
		System.out.printf("O valor de numero5 �: %d%n%n", numero5);
		
		Scanner sc = new Scanner(System.in);
		String entrada;
		double decimal4;
		int numero6;
		char caractere1;
		
		System.out.println("4.6. Entrada de Dados em Java - Parte 1:");
		System.out.print("Digite um texto: ");
		entrada = sc.next();
		System.out.printf("Texto: [%s]%n", entrada);
		System.out.print("Agora digite um n�mero: ");
		numero6 = sc.nextInt();
		System.out.printf("N�mero: [%d]%n", numero6);
		System.out.print("Agora digite um decimal: ");
		decimal4 = sc.nextDouble();
		System.out.printf("Decimal: [%.2f]%n", decimal4);
		System.out.print("Agora digite um caractere: ");
		caractere1 = sc.next().charAt(0);
		System.out.printf("Caractere: [%c]%n%n", caractere1);
		
		String texto1, texto2, texto3;
		
		System.out.println("4.7. Entrada de Dados em Java - Parte 2:");
		System.out.println("Digite um texto de tr�s linhas:");
		sc.nextLine();
		texto1 = sc.nextLine();
		texto2 = sc.nextLine();
		texto3 = sc.nextLine();
		
		System.out.printf("%nTexto:%n");
		System.out.println(texto1);
		System.out.println(texto2);
		System.out.printf("%s%n%n", texto3);
		
		sc.close();
		
		System.out.println("At� logo!");
	}

}
