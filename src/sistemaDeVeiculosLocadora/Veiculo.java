package sistemaDeVeiculosLocadora;

public abstract class Veiculo {

	private String marca;
	private int ano;
	private String modelo;
	private Double valorDiaria;
	private String placa;
	private Double alugel;
	
	public abstract Double calcularAlugel(int dias);

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the valorDiaria
	 */
	public Double getValorDiaria() {
		return valorDiaria;
	}

	/**
	 * @param valorDiaria the valorDiaria to set
	 */
	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the alugel
	 */
	public Double getAlugel() {
		return alugel;
	}

	/**
	 * @param alugel the alugel to set
	 */
	public void setAlugel(Double alugel) {
		this.alugel = alugel;
	}
	
}
