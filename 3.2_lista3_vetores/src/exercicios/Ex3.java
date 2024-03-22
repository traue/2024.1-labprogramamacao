package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String vetor[] = new String[10];
		int maior, posicaoMaior;

		System.out.println("Informe os dados do conjunto (10 valores inteiros):");

		vetor = sc.nextLine().split(" ");

		maior = Integer.parseInt(vetor[0]);
		posicaoMaior = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (Integer.parseInt(vetor[i]) > maior) {
				maior = Integer.parseInt(vetor[i]);
				posicaoMaior = i;
			}
		}

		System.out.printf("O maior valor é %d ocupando a %dª posição do arranjo.", maior, posicaoMaior + 1);

		sc.close();
	}

}
