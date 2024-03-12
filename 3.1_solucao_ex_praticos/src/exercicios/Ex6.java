package exercicios;

import java.util.Scanner;

/*
 * #6. A Cia. Engenharia de Tráfego – CET de uma certa cidade deseja sincronizar os semáforos, 
 * melhorando assim o fluxo dos carros nas vias públicas.
 * 
 * A intenção é de que, quando um semáforo abrir (ficar verde), os veículos que estavam parados nele
 * tendam a encontrar os próximos semáforos também abertos. Para que isto seja feito os semáforos 
 * subsequentes precisam abrir um pouco depois, dependendo da velocidade permitida na via e 
 * da distância que há entre eles.
 *  
 * Consideremos que, quando o semáforo abre, 
 * um veículo começa a acelerar até atingir a 
 * velocidade permitida e então a mantém até chegar ao próximo semáforo; levando, obviamente, um 
 * certo tempo para percorrer essa distância.
 * 
 * Para que o próximo semáforo possa ser encontrado aberto, ele deverá abrir um pouco antes da 
 * chegada do veículo (3 segundos antes).
 * 
 * Faça um programa que determine quanto tempo depois um semáforo deve abrir, considerando que 
 * sejam dadas as seguintes informações:
 * 
 *  a distância entre os dois semáforos;
 *  a velocidade permitida da via; e
 *  a aceleração típica dos carros.
 *  
 */
public class Ex6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Distância entre os semáforos (m): ");
		double distancia = sc.nextDouble();

		System.out.print("Velocidade permitida na via (Km/h): ");
		double vPermitida = sc.nextDouble() / 3.6;

		System.out.print("Aceleração típica (m/s): ");
		double aceleracao = sc.nextDouble();

		double tAceleracao = vPermitida / aceleracao;
		double tViagem = distancia / vPermitida;
		double tTotal = tAceleracao + tViagem;
		double tAbertura = tTotal - 3;

		System.out.printf("Tempo de abertura: %.2f segundos.", tAbertura);

		sc.close();
	}

}
