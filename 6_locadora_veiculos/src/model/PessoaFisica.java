package model;

							//é; herença
public class PessoaFisica extends Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, String endereco, String email, String telefone, String cpf, String rg) {
		super(endereco, email, telefone);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public PessoaFisica() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
