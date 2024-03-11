package exercicios;

/*
	#1. Implemente um programa do tipo Olá Mundo Java, com o objetivo de construir a estrutura básica e apresentar uma mensagem de boas vindas na tela.
	Para isso:
	
	declare uma variável e atribua a ela o seu nome; e
	em seguida, apresente na tela a seguinte mensagem:
	"Olá, <seu_nome>!"
	"Bem vindo ao seu primeiro programa em Java."
	Obs: não é necessário ler os dados a partir do teclado, por enquanto.
*/
public class Ex1 {

	public static void main(String[] args) {

		String nome = "Thiago G. Traue";

		//System.out.println("Olá " + nome + "!\nBem vindo ao seu primeiro programa Java.");
		//ou:
		System.out.printf("Olá %s!\nBem-vindo ao sseu primeiro programa Java.", nome);

	}

}
