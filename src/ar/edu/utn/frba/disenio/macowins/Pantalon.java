package ar.edu.utn.frba.disenio.macowins;

public class Pantalon extends Prenda {

	public int telaUsada;

	public int precioBaseDeLaPrenda() {
		return (250 + 1 * this.telaUsada);
	}
}
