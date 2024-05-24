package mack.tipos;

public class Aluno {

	private String nome;
	private int ra;
	private String email;

	public Aluno(String nome, int ra, String email) {
		this.nome = nome;
		this.ra = ra;
		this.email = email;
	}

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ra).append(" - ").append(nome).append(" - ").append(email);
		return sb.toString();
	}

}