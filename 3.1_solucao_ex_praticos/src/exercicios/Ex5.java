package exercicios;

import java.util.Scanner;

/*
 * #5. Imagens digitais tem as informações de cor de seus pixels usualmente expressos
 * em RGB. Nessa notação, cada cor é dada como uma combinação de vermelho (red), verde (green) e 
 * azul (blue).
 * 
 * As quantidades (intensidade) em cada um desses canais é dada por um valor inteiros, 
 * entre 0 e 255. Assim, a cor vermelha por exemplo pode ser representada por RGB(255, 0, 0).
 * Em sistemas Web, por outro lado, é comum expressar esses valores em hexadecimal ao 
 * invés de decimal. Aqui, a cor vermelha seria dada como 0xFF0000.
 * 
 * Sabendo que cada valores decimais dados entre 0 e 255 correspondem a dois 
 * dígitos em hexadecimal, faça um programa em Java que leia três valores inteiros, 
 * entre 0 e 255, representando respectivamente os valores dos canais R, G e B de uma 
 * certa cor; converta e apresente na tela o seu equivalente expresso em hexadecimal.
 * 
 */
public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int R, G, B;

		System.out.print("R: ");
		R = sc.nextInt();

		System.out.print("G: ");
		G = sc.nextInt();

		System.out.print("B: ");
		B = sc.nextInt();

		System.out.printf("A cor rgb(%03d, %03d, %03d) correponde a 0x%s%s%s", R, G, B, Integer.toHexString(R),
				Integer.toHexString(G), Integer.toHexString(B));

		sc.close();
	}

}
