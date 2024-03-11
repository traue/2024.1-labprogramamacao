package exercicios;

import java.util.Scanner;

/*
	#2. Implemente um programa que armazene dois números inteiros quaisquer em duas variáveis, A e B, por exemplo.
	
	Em seguida efetue a troca dos valores de forma que a variável A passe a possuir o valor da variável B, e que a variável B passe a ter o valor da variável A.
	
	Por fim, apresente os novos conteúdos das variáveis A e B na tela.
*/

public class Ex2 {
	public static void main(String[] args) {

		int a, b, aux;
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor A: ");
		a = sc.nextInt();

		System.out.print("Valor B: ");
		b = sc.nextInt();

		System.out.println("Valores originais:");
		System.out.println("Valor A: " + a);
		System.out.println("Valor B: " + b);
		System.out.println("---------------");

		System.out.println("Valores trocados:");

		aux = a;
		a = b;
		b = aux;

		System.out.println("Valor A: " + a);
		System.out.println("Valor B: " + b);

	}
}
