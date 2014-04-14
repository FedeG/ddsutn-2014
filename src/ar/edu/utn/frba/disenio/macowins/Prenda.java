package ar.edu.utn.frba.disenio.macowins;

public abstract class Prenda {

	public Marca marca;

	public boolean esImportada;

	public static int ValorFijoDelNegocio = 100;

	public double tasaDeImportacion() {
		if (this.esImportada == true) {
			return 1.3;
		} else {
			return 1;
		}
	}

	public int precioBaseDeLaPrenda() {
		return this.precioBaseDeLaPrenda();
	}

	public double precioFinal() {
		return (this.ValorFijoDelNegocio + this.precioBaseDeLaPrenda())
				* this.tasaDeImportacion()
				* this.marca.dameElCoeficientePara(this);
	}

}
