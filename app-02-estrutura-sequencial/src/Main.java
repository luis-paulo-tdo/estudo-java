import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int numero1 = 15;
		double decimal1 = 33.34597;
		
		int idade = 33;
		double altura = 1.7145;
		String nome = "Luis Paulo";
		
		System.out.println("Bom dia!");
		
		System.out.println("Agora s�o " + numero1 + " horas.");
		System.out.printf("A temperatura de hoje em � %.2fC�.%n", decimal1);
		System.out.printf("Neste ano, %s, voc� completou %d anos. Sua altura passou para %.2f.%n", nome, idade, altura);
		
		System.out.println("At� logo!");
	}

}
