package exercicios;

import java.util.Scanner;

/*

#1. Faça um programa Java que solicite ao usuário que informe o ano de seu nascimento. Então, calcule e apresente a sua idade na tela.

Obs: você precisará de um objeto do tipo java.util.Scanner

 */
public class Ex1 {

	public static void main(String[] args) {

		int anoNascimento, idade;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu ano de nascimento: ");
		anoNascimento = sc.nextInt();

		idade = 2024 - anoNascimento;

		// System.out.println("Você possui " + idade + " anos!");
		// ou
		System.out.printf("Você possui %d anos!", idade);
		
		sc.close();

	}

}
