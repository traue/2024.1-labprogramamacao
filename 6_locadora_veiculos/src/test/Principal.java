package test;

import java.util.ArrayList;
import java.util.Scanner;

import model.PessoaFisica;
import model.TipoCambio;
import model.Veiculo;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<>();
		ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				imprimeMenu();
				System.out.print("\n>> Sua escolha: ");
				int opc = sc.nextInt();

				switch (opc) {
				case 0:
					System.out.println("Até a próxima!");
					sc.close();
					System.exit(0);
					break;
				case 1: //cadastro de veículo
					veiculos.add(novoVeiculo(sc));
					System.out.println("\n *** VEÍCULO CADASTRADO! ***");
					break;
				case 2:
					// inicia o cadastro do cliente
					System.out.println("Que tipo de pessoas quer cadastrar: [1] Física | [2] Jurídica");
					int tipoPessoa = sc.nextInt();
					if (tipoPessoa == 1) {
						pessoasFisicas.add(cadastraPessoaFisica(sc));
					}
					break;
				case 5: //listagem de veículo
					listarVeiculos(veiculos);
					break;
				default:
					break;
				}
			}
		}
	}
	
	private static PessoaFisica cadastraPessoaFisica(Scanner sc) {
		sc.nextLine();
		PessoaFisica pf = new PessoaFisica();
		
		System.out.println("INFORME OS DADOS DA PESSOA:");
		System.out.print("NOme: ");
		pf.setNome(sc.nextLine());
		
		//..
		
		return pf;
	}
	
	private static void listarVeiculos(ArrayList<Veiculo> listaVeiculos) {
		if (listaVeiculos.size() == 0) {
			System.err.println("\n***** SEM VEÍCULOS CADASTRADOS! *****");
			return;
		}
		
		System.out.println("\n***** LISTA DE VEÍCULOS *****");
		for (Veiculo v : listaVeiculos) { //foreach
			System.out.println(v.toString());
			System.out.println("------------------");
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
		//System.out.println(v.toString());
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
