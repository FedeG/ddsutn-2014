package ar.edu.utn.frba.disenio.macowins;

import ar.edu.utn.frba.disenio.macowins.Venta;
import ar.edu.utn.frba.disenio.macowins.Prenda;
import java.text.SimpleDateFormat;
import java.util.*;

public class Macowins {

	public Collection<Venta> ventas = new ArrayList<Venta>();

	public void vender(Prenda unaPrenda, int unaCantidad) {
		Venta unaVenta = new Venta();
		unaVenta.cantidad = unaCantidad;

		unaVenta.fecha = new Date();

		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// System.out.println(dateFormat.format((unaVenta.fecha)));

		unaVenta.prenda = unaPrenda;
		this.agregarVenta(unaVenta);
	}

	public void agregarVenta(Venta unaVenta) {
		this.ventas.add(unaVenta);
	}

	public double gananciasDelDia(Date fecha) {

		double ganancias = 0;

		for (Venta unaVenta : this.ventas) {
			if (getZeroTimeDate(unaVenta.fecha).equals(getZeroTimeDate(fecha))) {
				ganancias = ganancias + unaVenta.importe();
			}
		}

		return ganancias;
	}

	public static Date getZeroTimeDate(Date fecha) {

		Date res = fecha;
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fecha);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		res = calendar.getTime();

		return res;
	}

}
