package model;

public class Veiculo {

	private String fabricante;
	private String modelo;
	private int anoFabricacao;
	private String cor;
	private String placa;
	private int numPortas;
	private double kilometragem;
	private double valorDiaria;
	private TipoCambio tipoCambio;

	public Veiculo(String fabricante, String cor, String modelo, int anoFabricacao, String placa, int numPortas,
			double kilometragem, double valorDiaria, TipoCambio tipoCambio) {
		this.fabricante = fabricante;
		this.cor = cor;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.numPortas = numPortas;
		this.kilometragem = kilometragem;
		this.valorDiaria = valorDiaria;
		this.tipoCambio = tipoCambio;
	}

	public Veiculo() {
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public double getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public TipoCambio getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(TipoCambio tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(" - FABRICANTE: ").append(this.fabricante).append("\n");
		sb.append(" - MODELO: ").append(this.modelo).append("\n");
		sb.append(" - ANO DE FAB: ").append(this.anoFabricacao).append("\n");
		sb.append(" - COR: ").append(this.cor).append("\n");
		sb.append(" - KILOMETRAGEM: ").append(this.kilometragem).append("\n");
		sb.append(" - PLACA: ").append(this.placa).append("\n");
		sb.append(" - N PORTAS: ").append(this.numPortas).append("\n");
		sb.append(" - DIÁRIA: R$ ").append(this.valorDiaria).append("\n");
		sb.append(" - CÂMBIO: ").append(this.tipoCambio).append("\n");
		
		return sb.toString();
	}
}
