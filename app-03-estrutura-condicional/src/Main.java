import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
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
		
		scanner.close();
	}

}
