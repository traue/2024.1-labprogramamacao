package exercicios;

import javax.swing.JOptionPane;

/*
 * #4. O custo de um carro novo ao consumidor é a soma do 
 * custo de fábrica com a porcentagem do distribuidor e dos 
 * impostos (aplicados ao custo de fábrica).
 * 
 * Supondo que o percentual do distribuidor seja de 28% e 
 * os impostos de 45%, escrever um programa para calcular e 
 * apresentar o custo final de um carro ao consumidor dado que o 
 * custo de fábrica seja informado pelo usuário.
 * 
 * Obs: Utilize as janelas de diálogo nas interações com o usuário
 */
public class Ex4 {

	public static void main(String[] args) {

		float vFabrica, vDist, vCons;
		float imposto;
		String resultado = "";

		vFabrica = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do carro na fábrica:"));
		resultado += String.format("Valor na fábrica: R$ %.2f\n", vFabrica);

		imposto = vFabrica * 0.28f;
		vDist = vFabrica + (vFabrica * 0.28f);
		resultado += String.format("Valor para o distribuidor: R$ %.2f\n", vDist);
		resultado += String.format("Impostos: R$ %.2f\n", imposto);

		imposto = (vDist * 0.45f);
		vCons = vDist + (vDist * 0.45f);
		resultado += String.format("Valor para o consumidor final: R$ %.2f\n", vCons);
		resultado += String.format("Impostos: R$ %.2f\n", imposto);

		JOptionPane.showMessageDialog(null, resultado);

	}

}
