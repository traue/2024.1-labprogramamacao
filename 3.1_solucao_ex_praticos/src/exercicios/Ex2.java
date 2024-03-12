package exercicios;

import java.util.Scanner;

/*
 * #2. Modifique o código de modo a pedir também que seja 
 *     informado o nome do usuário, personalizando a mensagem que apresenta a idade.
 */
public class Ex2 {
	public static void main(String[] args) {

		String nome;
		int anoNascimento, idade;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();

		System.out.print("Informe seu ano de nascimento: ");
		anoNascimento = sc.nextInt();

		idade = 2024 - anoNascimento;

		// System.out.println("Olá " + nome + ", tudo bem? Você possui " + idade + " anos!");
		// ou
		System.out.printf("Olá %s, tudo bem? Você possui %d anos!", nome, idade);
		
		sc.close();

	}
}
