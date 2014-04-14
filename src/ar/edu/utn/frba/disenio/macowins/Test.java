package ar.edu.utn.frba.disenio.macowins;

import java.util.Date;

import ar.edu.utn.frba.disenio.macowins.Pantalon;

public class Test {

	public static void main(String[] args) {

		Pantalon pantalon = new Pantalon();
		System.out.println("*** prueba para un pantal�n ***");
		System.out.println("su precio base es: "
				+ pantalon.precioBaseDeLaPrenda());
		pantalon.esImportada = true;
		System.out.println("es importada: " + pantalon.esImportada);
		System.out.println("su tasa de importacion es: "
				+ pantalon.tasaDeImportacion());
		System.out.println("su valor fijo del negocio es: "
				+ pantalon.ValorFijoDelNegocio);
		System.out.println("su precio base es: "
				+ pantalon.precioBaseDeLaPrenda());
		Armani armani = new Armani();
		pantalon.marca = armani;
		System.out.println("su coef de marca es: "
				+ pantalon.marca.dameElCoeficientePara(pantalon));
		System.out.println("su precio final entonces es: "
				+ pantalon.precioFinal());

		System.out.println("\n\n *** prueba para macowins ***");
		Macowins macowins = new Macowins();
		System.out.println(" - vendi el pantal�n con 3 de cantidad");
		macowins.vender(pantalon, 3);
		System.out.println(" - vendi el pantal�n con 5 de cantidad");
		macowins.vender(pantalon, 5);
		System.out.println(" el total de ventas es: " + macowins.ventas.size());
		System.out.println("las ganancias de hoy son: "
				+ macowins.gananciasDelDia(new Date()));

		System.out
				.println("\n\n *** prueba para nuevos c�lculos de precio base ***");
		Pantalon otroPantalon = new Pantalon();
		otroPantalon.telaUsada = 175;
		System.out.println("Un pantal�n con cantidad de tela usada: 175 ");
		System.out.println("su precio base es: "
				+ otroPantalon.precioBaseDeLaPrenda());

		Saco unSaco = new Saco();
		unSaco.cantidadBotones = 5;
		System.out.println("Un saco con cantidad de botones: 5 ");
		System.out.println("su precio base es: "
				+ unSaco.precioBaseDeLaPrenda());

		Zapato unZapato = new Zapato();
		unZapato.talle = 38;
		System.out.println("Un zapato con talle: 38 ");
		System.out.println("su precio base es: "
				+ unZapato.precioBaseDeLaPrenda());

		Sombrero unSombero = new Sombrero();
		unSombero.coefMetrosexualidad = 2;
		System.out
				.println("Un sombrero con coeficiente de metrosexualidad: 2 ");
		System.out.println("su precio base es: "
				+ unSombero.precioBaseDeLaPrenda());

	}

}
