package ar.edu.utn.frba.disenio.macowins;

public class Sarkany implements Marca {

	public double dameElCoeficientePara(Prenda unaPrenda) {
		if (unaPrenda.precioBaseDeLaPrenda() > 500) {
			return 1.35;
		} else {
			return 1.1;
		}

	}
}
