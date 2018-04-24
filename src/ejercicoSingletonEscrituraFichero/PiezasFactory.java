package ejercicoSingletonEscrituraFichero;

import java.io.IOException;

public class PiezasFactory {
	private Log log1;

	public PiezasFactory() throws IOException {
		this.log1 = Log.getLog();
	}

	public Rueda crearRueda(int tipo) throws IOException {
		if (tipo == 1) {
			this.log1.insertarPaso("Coche: Fabricando Rueda");
			Rueda rueda = new Rueda();
			rueda.setTipo("Coche");
			return rueda;
		} else {
			this.log1.insertarPaso("Moto: Fabricando Rueda");
			Rueda rueda = new Rueda();
			rueda.setTipo("Moto");
			return rueda;
		}
	}

	public Freno crearFreno(int tipo) throws IOException {
		if (tipo == 1) {
			this.log1.insertarPaso("Coche: Fabricando Freno");
			Freno freno = new Freno();
			freno.setTipo("Coche");
			return freno;
		} else {
			this.log1.insertarPaso("Moto: Fabricando Freno");
			Freno freno = new Freno();
			freno.setTipo("Moto");
			return freno;
		}
	}

	public Chasis crearChasis(int tipo) throws IOException {
		if (tipo == 1) {
			this.log1.insertarPaso("Coche: Fabricando Chasis");
			Chasis chasis = new Chasis();
			chasis.setTipo("Coche");
			return chasis;
		} else {
			this.log1.insertarPaso("Moto: Fabricando Chasis");
			Chasis chasis = new Chasis();
			chasis.setTipo("Moto");
			return chasis;
		}
	}
}
