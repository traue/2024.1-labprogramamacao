package model;

public class Pessoa {

	private String endereco;
	private String email;
	private String telefone;

	public Pessoa(String endereco, String email, String telefone) {
		super();
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public Pessoa() {
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
