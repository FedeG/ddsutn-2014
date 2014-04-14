package ar.edu.utn.frba.disenio.macowins;

public class Sombrero extends Prenda {

	public int coefMetrosexualidad;

	public int precioBaseDeLaPrenda() {
		return (150 + (1 * this.coefMetrosexualidad));
	}
}
