package model;

public class Pessoa {
	
	private String nome;
	private long cpf;
	private char sexo;
	private int idade;
	private Endereco endereco;
	private boolean fumante;
	
	
	public Pessoa(String nome, long cpf, char sexo, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	
	public Pessoa() {
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public boolean isFumante() {
		return fumante;
	}
	
}
