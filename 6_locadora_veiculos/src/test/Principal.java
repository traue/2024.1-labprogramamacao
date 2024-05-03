package test;

import java.util.ArrayList;
import java.util.Scanner;

import model.Fabricante;
import model.Veiculo;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<>();
		int opc = imprimeMenu();

		do {
			switch (opc) {
			case 1:
				veiculos.add(cadastraVeiculo());
				break;
			case 2:
				// inicia o cadastro do cliente
				break;
			default:
				break;
			}
		} while (imprimeMenu() != 0);

	}

	private static int imprimeMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("****** MENU ******");
		System.out.println("[1] - Cadastrar veículo");
		System.out.println("[2] - Cadastrar cliente");
		System.out.println("[3] - Realização locação");
		System.out.println("[4] - Realização devolução");
		System.out.println("[0] - Sair");
		System.out.print("\n>> Sua escolha: ");
		int opc = sc.nextInt();
		sc.close();
		return opc;
	}

	private static Veiculo cadastraVeiculo() {
		Veiculo v = new Veiculo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados do veículo cadastrado:");

//		for (Fabricante f : Fabricante.values()) {
//			System.out.println(" - " + f);
//		}

		System.out.println("Fabricante: ");
		String fab = sc.nextLine();
		// sc.nextLine();
		v.fabricante = Fabricante.valueOf(fab);

		System.out.print("Cor: ");
		v.cor = sc.nextLine();
		// ...
		sc.close();
		return v;
	}

}
