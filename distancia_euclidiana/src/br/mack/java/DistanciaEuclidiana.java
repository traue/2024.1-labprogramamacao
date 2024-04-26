package br.mack.java;

public class DistanciaEuclidiana {
		
	public double calculaDistanciaEuclidiana(Ponto a, Ponto b) {
		
		//1º passo: encontrar o ponto C
		Ponto c = new Ponto(a.x, b.y);
		
		//2º passo: encontrar a "base"
		int base = b.x - c.x;
		
		//3º passo: encontrar a "altura"
		int altura = a.y - c.y;
				
		//4º passo: calcular a distância
		double distancia = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		//5º passo: retorno do valor
		return distancia;
	}

}
