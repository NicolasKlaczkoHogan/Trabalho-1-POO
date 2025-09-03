package sistemaDeVeiculosLocadora;

public class Moto extends Veiculo {

	private int cilindrada;

	@Override
	public Double calcularAlugel(int dias) {
		// TODO Auto-generated method stub
		return (double) ((getValorDiaria()*dias)*0.95);
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
