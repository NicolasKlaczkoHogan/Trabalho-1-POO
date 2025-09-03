package sistemaDeVeiculosLocadora;

public class Principal {


	public static void main (String[] args ) {
		
		Carro v1 = new Carro();
		v1.setAno(205);
		v1.setMarca("fiat");
		v1.setModelo("uno");
		v1.setPlaca("123321");
		v1.setPortasQuant(3);
		v1.setValorDiaria(200.00);
		v1.setAlugel(v1.calcularAlugel(3));
		System.out.println("moddelo: "+v1.getModelo()+" placa: "+v1.getPlaca()+" presso: "+v1.getAlugel());
		
		Moto v2 = new Moto();
		v2.setAno(2030);
		v2.setMarca("harley");
		v2.setModelo("fat boy");
		v2.setPlaca("3614");
		v2.setCilindrada(500);
		v2.setValorDiaria(300.00);
		v2.setAlugel(v2.calcularAlugel(5));
		System.out.println("moddelo: "+v2.getModelo()+" placa: "+v2.getPlaca()+" presso: "+v2.getAlugel());
		
		Caminhao v3 = new Caminhao();
		v3.setAno(205);
		v3.setMarca("otobots");
		v3.setModelo("optimus prime");
		v3.setPlaca("89514");
		v3.setCapacidadeCarga(6530.51);
		v3.setValorDiaria(780.00);
		v3.setAlugel(v3.calcularAlugel(10));
		System.out.println("moddelo: "+v3.getModelo()+" placa: "+v3.getPlaca()+" presso: "+v3.getAlugel());
		
	}
	
}
