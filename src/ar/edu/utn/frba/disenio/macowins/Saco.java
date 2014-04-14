package ar.edu.utn.frba.disenio.macowins;

public class Saco extends Prenda {

	public int cantidadBotones;

	public int precioBaseDeLaPrenda() {
		return (300 + (10 * this.cantidadBotones));
	}
}
