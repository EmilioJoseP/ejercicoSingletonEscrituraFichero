package ejercicoSingletonEscrituraFichero;

public class PiezasFactory {
	
	public Rueda crearRueda(int tipo) {
		if (tipo == 1) {
			Rueda rueda = new Rueda();
			rueda.setTipo("Coche");
			return rueda;
		} else {
			Rueda rueda = new Rueda();
			rueda.setTipo("Moto");
			return rueda;
		}
	}

	public Freno crearFreno(int tipo) {
		if (tipo == 1) {
			Freno freno = new Freno();
			freno.setTipo("Coche");
			return freno;
		} else {
			Freno freno = new Freno();
			freno.setTipo("Moto");
			return freno;
		}
	}

	public Chasis crearChasis(int tipo) {
		if (tipo == 1) {
			Chasis chasis = new Chasis();
			chasis.setTipo("Coche");
			return chasis;
		} else {
			Chasis chasis = new Chasis();
			chasis.setTipo("Moto");
			return chasis;
		}
	}
}
