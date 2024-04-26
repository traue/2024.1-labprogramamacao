package br.mack.java.teste;

import java.util.Scanner;

import br.mack.java.DistanciaEuclidiana;
import br.mack.java.Ponto;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ponto a = new Ponto();
		Ponto b = new Ponto();
		double distancia;
		
		System.out.println("Informe os pontos....");
		
		System.out.println("   Do ponto A...:");
		System.out.print("    > X: ");
		a.x = sc.nextInt();
		System.out.print("    > Y: ");
		a.y = sc.nextInt();
		
		System.out.println("   Do ponto B...:");
		System.out.print("    > X: ");
		b.x = sc.nextInt();
		System.out.print("    > Y: ");
		b.y = sc.nextInt();
		
		distancia = new DistanciaEuclidiana().calculaDistanciaEuclidiana(a, b);
		
		System.out.printf("A distância entre A(%d,%d) e B(%d,%d) é %.2f", a.x, a.y, b.x, b.y, distancia);
		
		sc.close();
		
	}
	
}
