package exercicios;

import java.util.Scanner;

public class Ex1_v2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String vetor[] = new String[10];
		int soma = 0;

		System.out.print("Entrada: ");

		vetor = sc.nextLine().split(" ");

		for (String x : vetor) {
			soma += Integer.parseInt(x);
		}

		System.out.println("Soma dos valores: " + soma);
		
		sc.close();
	}
}
