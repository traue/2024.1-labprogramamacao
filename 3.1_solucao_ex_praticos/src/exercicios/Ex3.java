package exercicios;

import java.util.Scanner;

/*
 * #3. Desenvolva um programa para a conversão entre escalas de 
 *     temperatura. O usuário deverá informar uma medida de 
 *     temperatura dada graus Celsius, calcular o equivalente em 
 *     Fahrenheit e apresentar o resultado na tela.
 */
public class Ex3 {

	public static void main(String[] args) {

		float tC, tF;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a temperatura em Celsius: ");
		tC = sc.nextFloat();

		tF = ((9 * tC) / 5) + 32;

		System.out.printf("Temperatura em Fahrenheit: %.2fºF", tF);
		
		sc.close();
	}

}
