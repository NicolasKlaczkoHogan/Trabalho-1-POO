package sistemaDeVeiculosLocadora;

public class Caminhao extends Veiculo {

	private Double capacidadeCarga;

	@Override
	public Double calcularAlugel(int dias) {
		// TODO Auto-generated method stub
		return (Double) (200.00+getValorDiaria()*dias);
	}

	/**
	 * @return the capacidadeCarga
	 */
	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	/**
	 * @param capacidadeCarga the capacidadeCarga to set
	 */
	public void setCapacidadeCarga(Double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
}
