package model;

public class Aluno extends Pessoa {
	
	public int ra;
	public Curso curso;
	
	//método construtor de aluno com parâmetros
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//método construtor padrão	
	public Aluno() {
		
	}
	
}
