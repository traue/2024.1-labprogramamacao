package views;

import java.util.Scanner;

import model.Aluno;
import model.Curso;


public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Curso curso = new Curso();
		
		Aluno x = new Aluno("Enzo", 13);
		
		
		System.out.println("--- DADO DO ALUNO ---");
		
		System.out.print(" > RA: ");
		aluno.ra = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" > Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print(" > Idade: ");
		aluno.idade = sc.nextInt();
		
		System.out.print(" > CPF: ");
		aluno.cpf = sc.nextLong(); 
		sc.nextLine();
		
		System.out.print(" > Sexo: ");
		aluno.sexo = sc.nextLine().charAt(0);
		
		System.out.println("--- DADO DO CURSO ---");
		
		System.out.print(" > Nome do curso: ");
		curso.nome = sc.nextLine();
		
		System.out.print(" > Carga Horária: ");
		curso.ch = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" > Tipo de curso: ");
		curso.tipo = sc.nextLine();
		
		System.out.print(" > Valor total: R$ ");
		curso.valorTotal = sc.nextFloat();
		
		aluno.curso = curso;
		
		//todo: "mini atividade": Fazer o endereço
		//todo2: Implementar o professor, a disciplina etc.
		
		sc.close();
		
		System.out.print("Total de horas do curso:" + curso.ch);
		System.out.print("\nValor total do curso:" + curso.valorTotal);
		System.out.print("\nValor por hora:" + curso.valorPorHora());
	}
	
}
