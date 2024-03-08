package mackenzie.exercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Olá, Sr(a). " + nome + ", é um prazer conhecê-lo.");
		
		sc.close();
	}
	
}
