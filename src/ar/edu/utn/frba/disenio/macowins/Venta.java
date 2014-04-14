package ar.edu.utn.frba.disenio.macowins;

import ar.edu.utn.frba.disenio.macowins.Prenda;
import java.util.*;

public class Venta {
	public Date fecha;
	public int cantidad;
	public Prenda prenda;

	public double importe() {
		return (this.cantidad * this.prenda.precioFinal());
	}

}
