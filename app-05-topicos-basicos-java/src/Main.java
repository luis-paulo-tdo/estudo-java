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
			System.out.printf("Credencial Válida!%n%n");
		} else {
			System.out.printf("Credencial Inválida!%n%n");
		}
		
		// Funções para Manipulação de String
		
		String sentencaString = "abcde FGHIJ ABC abc DEFG     ";
		String sentencaMinuscula = sentencaString.toLowerCase();
		String sentencaMaiuscula = sentencaString.toUpperCase();
		String sentencaSemEspaco = sentencaString.trim();
		String sentencaSubstring1 = sentencaString.substring(2);
		String sentencaSubstring2 = sentencaString.substring(2, 9);
		String sentencaReplace1 = sentencaString.replace('a', 'x');
		String sentencaReplace2 = sentencaString.replace("abc", "xy");
		int primeiraPosicaoString = sentencaString.indexOf("bc");
		int ultimaPosicaoString = sentencaString.lastIndexOf("bc");
		
		String frutasString = "Maçã Banana Limão Laranja";
		String[] frutasVetorString = frutasString.split(" ");
		
		System.out.println("Agora, vamos manipular a seguinte sentença: [" + sentencaString + "]");
		System.out.println("------------------------------------------------");
		System.out.printf("[%s] \t| Convertendo todas as letras para minúsculo \t\t| toLowerCase%n", sentencaMinuscula);
		System.out.printf("[%s] \t| Convertendo todas as letras para maiúsculo \t\t| toUpperCase%n", sentencaMaiuscula);
		System.out.printf("[%s] \t\t| Removendo os espaços das extremidades \t\t| trim%n", sentencaSemEspaco);
		System.out.printf("[%s] \t\t| Sem com os dois primeiros caracteres recortados \t| substring(2)%n", sentencaSubstring1);
		System.out.printf("[%s] \t\t\t\t| Recortada do segundo ao nono caractere \t\t| substring(2, 9)%n", sentencaSubstring2);
		System.out.printf("[%s] \t| Trocando o caractere 'a' por 'x' \t\t\t| replace('a', 'x')%n", sentencaReplace1);
		System.out.printf("[%s] \t\t| Trocando a string \"abc\" por \"xy\" \t\t\t| replace(\"abc\", \"xy\")%n", sentencaReplace2);
		System.out.printf("[%s] \t| Encontrando a primeira posição da string \"bc\": %d \t| indexOf(\"bc\")%n", sentencaString, primeiraPosicaoString);
		System.out.printf("[%s] \t| Encontrando a última posição da string \"bc\": %d \t| lastIndexOf(\"bc\")%n%n", sentencaString, ultimaPosicaoString);
		
		System.out.println("Agora, vamos dividir as frutas da seguinte sentença com a função split(\" \"): [" + frutasString + "]");
		System.out.println("Fruta 1: " + frutasVetorString[0]);
		System.out.println("Fruta 2: " + frutasVetorString[1]);
		System.out.println("Fruta 3: " + frutasVetorString[2]);
		System.out.println("Fruta 4: " + frutasVetorString[3]);
		
		System.out.printf("Manipulações de sentenças realizadas com sucesso!%n%n");
		
		scanner.close();
	}

}
