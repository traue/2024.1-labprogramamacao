package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de elementos do conjunto: ");
		int qtdElemtnos = sc.nextInt();

		int vetor[] = new int[qtdElemtnos];

		// leitura dos dados
		for (int i = 0; i < qtdElemtnos; i++) {
			System.out.printf("Informe o %dº elemento: ", i + 1);
			vetor[i] = sc.nextInt();
		}

		System.out.print("Dados na ordem original: ");
		for (int v : vetor) {
			System.out.printf("%d, ", v);
		}

		// maniulação do vetor
		for (int i = 0; i < qtdElemtnos; i++) {
			for (int j = i; j < qtdElemtnos; j++) {
				if (vetor[i] == 0) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}

		System.out.print("\nDados reorganizados....: ");
		for (int v : vetor) {
			System.out.printf("%d, ", v);
		}

		sc.close();

	}
}
