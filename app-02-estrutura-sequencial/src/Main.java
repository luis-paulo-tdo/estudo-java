import java.util.Locale;

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
		
		System.out.println("At� logo!");
	}

}
