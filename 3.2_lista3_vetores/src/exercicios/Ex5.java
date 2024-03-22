package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva uma frase: ");
		String frase = sc.nextLine();

		int vogais = 0;
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.toLowerCase().charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vogais++;
			}
		}
		
		System.out.printf("\nEsta frase tem %d vogais.", vogais);

		// ou... 
		
		vogais = 0;
		for (char c : frase.toLowerCase().toCharArray()) {
			switch (c) {
			case 'a', 'e', 'i', 'o', 'u':
				vogais++;
				break;
			}
		}

		System.out.printf("\nEsta frase tem %d vogais.", vogais);

		sc.close();
	}

}
