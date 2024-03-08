package mackenzie.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Minutos de estudo: ");
		double minutos = sc.nextInt();

		System.out.print("Pocentagem de aprendizado: ");
		float porcetagemAprendizado = sc.nextFloat();

		String quebra = "\n";

		sc.nextLine();
		System.out.print("Que dia é hoje: ");
		String diaSemana = sc.nextLine();

		System.out.printf(
				"Hoje é %s Faz %e minutos que comecei a aprender Java e%sjá entendi quase %.1f de tudo que foi discutido até aqui.",
				diaSemana, minutos, quebra, porcetagemAprendizado);

		sc.close();

	}
}
