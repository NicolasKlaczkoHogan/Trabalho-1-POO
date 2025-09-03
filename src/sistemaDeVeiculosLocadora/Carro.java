package sistemaDeVeiculosLocadora;

public class Carro extends Veiculo {

	private int portasQuant;

	/**
	 * @return the portasQuant
	 */
	public int getPortasQuant() {
		return portasQuant;
	}

	/**
	 * @param portasQuant the portasQuant to set
	 */
	public void setPortasQuant(int portasQuant) {
		this.portasQuant = portasQuant;
	}

	@Override
	public Double calcularAlugel(int dias) {
		// TODO Auto-generated method stub
		
		return (double) (50.00+getValorDiaria()*dias);
	}
	
}
