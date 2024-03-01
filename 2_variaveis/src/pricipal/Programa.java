package pricipal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		/*
		 * Isso é um bloco de comentário
		 */

		// isso é um comentário em linha

		//explicação do nextline após a leituira dos valores:
		//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
		
		Scanner sc = new Scanner(System.in); //representará a entrada de dados
		
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt(); // entrada de variável do tipo inteira
		sc.nextLine();
		
		System.out.print("Saldo em conta: R$ ");
		float saldoEmConta = sc.nextFloat(); //entrada de variável do tipo ponto flutuante
		sc.nextLine();
		
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine(); // variável do tipo Textual
		
		System.out.print("Agora seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.println("Qual seu sexo: ");
		
		//String teste = sc.nextLine().substring(0, 2); //para pegar um pedaço da cadeia
		
		char sexo = sc.nextLine().charAt(0);
		
		System.out.print("Você fuma? [S] Sim | [N] Não: ");
		
		char fuma = sc.nextLine().toUpperCase().charAt(0);
		
		boolean fumante; // variável do tipo booleana (v/f)
		
		if (fuma == 'S') {
			fumante = true;
		} else {
			fumante = false;
		}
		
		//ou:
		fumante = fuma == 'S';


		System.out.println("Olá " + nome + " " + sobrenome + ", tudo bem?");
		
		System.out.println("Você tem " + idade + " anos. Legal!");
		
		System.out.println("Hoje sua conta está com um saldo de: R$ " 
				+ saldoEmConta + " (pobre!)");
		
		if (fumante) {
			System.out.println("Você fuma! Blé");
		} else {
			System.out.println("Você não fuma, uhu!");
		}
		
		sc.close();
		
		//desafio do tio (p/ semana que vem):
		//montar uma calculadora IMC

	}
	
}
