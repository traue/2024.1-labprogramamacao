package model;

public class Curso {
	
	public String nome;
	public String tipo;
	public int ch;
	public float valorTotal;
	
	public Curso(String nome, String tipo, int ch, float valorTotal) {
		this.nome = nome;
		this.tipo = tipo;
		this.ch = ch;
		this.valorTotal = valorTotal;
	}
	
	public Curso() {
		
	}
	
	public double valorPorHora() {
		return valorTotal / ch;
	}
	
	
	
}
