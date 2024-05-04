package test;

import java.util.ArrayList;
import java.util.Scanner;

import model.TipoCambio;
import model.Veiculo;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				imprimeMenu();
				System.out.print("\n>> Sua escolha: ");
				int opc = sc.nextInt();

				switch (opc) {
				case 1:
					veiculos.add(novoVeiculo(sc));
					break;
				case 2:
					// inicia o cadastro do cliente
					break;
				case 0:
					System.out.println("Até a próxima!");
					sc.close();
					System.exit(0);
					break;
				default:
					break;
				}
			}
		}

	}

	private static Veiculo novoVeiculo(Scanner sc) {
		Veiculo v = new Veiculo();
		sc.nextLine();
		System.out.println("Informe os dados do veículo a ser cadastrado:");

		System.out.print("Fabricante: ");
		v.setFabricante(sc.nextLine());

		System.out.print("Modelo: ");
		v.setModelo(sc.nextLine());

		System.out.print("Ano: ");
		v.setAnoFabricacao(sc.nextInt());
		sc.nextLine();

		System.out.print("Cor: ");
		v.setCor(sc.nextLine());

		System.out.print("Placa: ");
		v.setPlaca(sc.nextLine());

		System.out.print("Nº de portas: ");
		v.setNumPortas(sc.nextInt());
		sc.nextLine();

		System.out.print("Kilimetragem: ");
		v.setKilometragem(sc.nextInt());
		sc.nextLine();

		System.out.print("Tipo de câmbio: [1] manual | [2] aumático");
		int tipo = sc.nextInt();
		sc.nextLine();
		v.setTipoCambio(tipo == 1 ? TipoCambio.manual : TipoCambio.automatico);

		System.out.print("Valor da diária: R$ ");
		v.setValorDiaria(sc.nextFloat());

		return v;
	}

	private static void imprimeMenu() {
		System.out.println("****** MENU ******");
		System.out.println("[1] - Cadastrar veículo");
		System.out.println("[2] - Cadastrar cliente");
		System.out.println("[3] - Realizar locação");
		System.out.println("[4] - Realizar devolução");
		System.out.println("[5] - Listar Veículos");
		System.out.println("[6] - Listar clientes");
		System.out.println("[0] - Sair");
	}
}
