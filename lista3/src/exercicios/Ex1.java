package exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0;

//		for (int i = 0; i < vetor.length; i++) {
//			System.out.printf("Informe um valor para a %dº posição: ", i + 1);
//			vetor[i] = sc.nextInt();
//			soma += vetor[i];
//		}
		
//		int i = 0;
//		while (i < vetor.length) {
//			System.out.printf("Informe um valor para a %dº posição: ", i + 1);
//			vetor[i] = sc.nextInt();
//			soma += vetor[i];
//			i++;
//		}
		
		int i = 0;
		do {
			System.out.printf("Informe um valor para a %dº posição: ", i + 1);
			vetor[i] = sc.nextInt();
			soma += vetor[i];
			i++;
		} while(i < vetor.length);
		

		System.out.print("\nEntrada: ");
		for (i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}

		System.out.println("\nSoma dos valores: " + soma);

		sc.close();
	}
}
