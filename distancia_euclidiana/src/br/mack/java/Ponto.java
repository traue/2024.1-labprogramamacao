package br.mack.java;

public class Ponto {
	
	String nome;
	public int x, y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
		this.nome = "";
	}
	
	public Ponto(int x, int y, String nome) {
		this.x = x;
		this.y = y;
		this.nome = nome;
	}
	
	public Ponto() {
		
	}
	
}
