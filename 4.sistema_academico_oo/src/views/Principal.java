package views;

import java.util.Scanner;

import model.Aluno;
import model.Curso;
import model.Endereco;


public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Curso curso = new Curso();
		
		Aluno x = new Aluno();
		x.setNome("João");
		x.setIdade(19);
		//...
		
		Endereco r = new Endereco();
		Curso c2 = new Curso();
		
		Aluno y = new Aluno("Fulnao", 1234, 'W', 18, r, 321, c2);
		y.setNome("Ana");
		
		//x.nome = "Enzo";
		x.setNome("Enzo");
		System.out.println(x.getNome());
		
		
		System.out.println("--- DADO DO ALUNO ---");
		
		System.out.print(" > RA: ");
		aluno.setRa(sc.nextInt());
		sc.nextLine();
		
		System.out.print(" > Nome: ");
		aluno.setNome(sc.nextLine());
		
		System.out.print(" > Idade: ");
		aluno.setIdade(sc.nextInt());
		
		System.out.print(" > CPF: ");
		aluno.setCpf(sc.nextLong()); 
		sc.nextLine();
		
		System.out.print(" > Sexo: ");
		aluno.setSexo(sc.nextLine().charAt(0));
		
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
		
		aluno.setCurso(curso);
		
		//todo: "mini atividade": Fazer o endereço
		//todo2: Implementar o professor, a disciplina etc.
		
		sc.close();
		
		System.out.print("Total de horas do curso:" + curso.ch);
		System.out.print("\nValor total do curso:" + curso.valorTotal);
		System.out.print("\nValor por hora:" + curso.valorPorHora());
	}
	
}
