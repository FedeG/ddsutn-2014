package ar.edu.utn.frba.disenio.macowins;

public class Zapato extends Prenda {

	public int talle;

	public int precioBaseDeLaPrenda() {
		return (400 + (5 * this.talle));
	}
}
