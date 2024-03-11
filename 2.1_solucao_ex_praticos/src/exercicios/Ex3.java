package exercicios;

import java.util.Scanner;

/*

#3. Supondo que cada aluno fará 3 atividades ao longo do bimestre, faça um programa em Java que calcule a média ponderada considerando as notas destas avaliações.

Atribua valores (quais você desejar) para as notas das 3 provas (tipo double) e seus respectivos pesos (tipo int), depois calcule e mostre a média ponderada dessas notas.

Caso de teste:

peso1 = 3; peso2 = 3; peso3 = 4;
p1 = 8; p2 = 9; p3 = 7;
Para esses valores a média ponderada será 7.9
*/
public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double p1, p2, p3, media;
		int peso1, peso2, peso3;

		System.out.print("Informa a nota P1: ");
		p1 = sc.nextDouble();

		System.out.print("Informa a nota P2: ");
		p2 = sc.nextDouble();

		System.out.print("Informa a nota P3: ");
		p3 = sc.nextDouble();

		peso1 = 3;
		peso2 = 3;
		peso3 = 4;

		media = ((p1 * peso1) + (p2 * peso2) + (p3 * peso3)) / (peso1 + peso2 + peso3);

		System.out.println("A média deste alunos é: " + media);

	}

}
