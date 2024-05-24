package mack.testes;

import java.util.Scanner;

import mack.servicos.ServicoImpressao;
import mack.tipos.Aluno;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ServicoImpressao<String> si = new ServicoImpressao<>();
		ServicoImpressao<Aluno> siAluno = new ServicoImpressao<>();
		
		System.out.print("Qual o tamanho da fila: ");
		int tamanho = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < tamanho; i++) {
//			System.out.printf("Informe o %dº valor: ", i + 1);
//			String dado = sc.nextLine();
//			si.insereElemento(dado);
			
			System.out.printf("Informe o NOME do %dº aluno: ", i + 1);
			String nome = sc.nextLine();
			
			System.out.printf("Informe o RA do %dº aluno: ", i + 1);
			int ra = sc.nextInt();
			
			sc.nextLine();
			
			System.out.printf("Informe o E-MAIL do %dº aluno: ", i + 1);
			String mail = sc.nextLine();
			
			Aluno a = new Aluno(nome, ra, mail);
			siAluno.insereElemento(a);
		}
		
		System.out.println("**************************");
		
		System.out.println("Primeiro da fila: " + siAluno.primeiroDaFila());
		System.out.print("Fila completa: ");
		siAluno.imprime();
		
		sc.close();
		
	}
	
}
