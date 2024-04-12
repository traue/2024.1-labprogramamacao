package model;

public class Aluno extends Pessoa {
	
	private int ra;
	private Curso curso;
	
	//método construtor de aluno com parâmetros
	public Aluno(String nome, int idade) {
		super(nome, 0, ' ', idade, null);
	}
	

	public Aluno(String nome, long cpf, char sexo, int idade, Endereco endereco, int ra, Curso curso) {
		super(nome, cpf, sexo, idade, endereco);
		this.ra = ra;
		this.curso = curso;
	}


	//método construtor padrão	
	public Aluno() {
	}


	public int getRa() {
		return ra;
	}


	public void setRa(int ra) {
		this.ra = ra;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}	
	
}
