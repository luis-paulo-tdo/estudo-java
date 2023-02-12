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
		
		double decimal5 = 3.0;
		double decimal6 = 4.0;
		double decimal7 = -5.0;
		double resultado2, resultado3, resultado4;
		
		System.out.println("4.8. Fun��es Matem�ticas em Java:");
		resultado2 = Math.sqrt(decimal5);
		resultado3 = Math.sqrt(decimal6);
		resultado4 = Math.sqrt(25.0);
		System.out.println("[Raiz Quadrada]");
		System.out.println("Raiz quadrada de " + decimal5 + " = " + resultado2);
		System.out.println("Raiz quadrada de " + decimal6 + " = " + resultado3);
		System.out.printf("Raiz quadrada de 25 = %.1f%n%n",resultado4);
		
		resultado2 = Math.pow(decimal5, decimal6);
		resultado3 = Math.pow(decimal5, 2.0);
		resultado4 = Math.pow(5.0, 2.0);
		System.out.println("[Pot�ncia]");
		System.out.println(decimal5 + " elevado a " + decimal6 + " = " + resultado2);
		System.out.println(decimal5 + " elevado ao quadrado = " + resultado3);
		System.out.printf("5 elevado ao quadrado = %.1f%n%n", resultado4);
		
		resultado2 = Math.abs(decimal6);
		resultado3 = Math.abs(decimal7);
		System.out.println("[Valor Absoluto]");
		System.out.println("Valor absoluto de " + decimal6 + " = " + resultado2);
		System.out.printf("Valor absoluto de %.1f = %.1f%n%n", decimal7, resultado3);
		
		sc.close();
		
		System.out.println("At� logo!");
	}

}
