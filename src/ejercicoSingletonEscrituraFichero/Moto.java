package ejercicoSingletonEscrituraFichero;

import java.io.IOException;

public class Moto {
	private Rueda rueda1;
	private Rueda rueda2;
	private Freno freno1;
	private Freno freno2;
	private Chasis chasis;
	private Log log1;

	public Moto() throws IOException {
		this.log1 = Log.getLog();
	}

	public Rueda getRueda1() {
		return this.rueda1;
	}

	public void setRueda1(Rueda rueda1) throws IOException {
		this.log1.insertarPaso("Moto: Atornillando Rueda 1");
		this.rueda1 = rueda1;
	}

	public Rueda getRueda2() {
		return this.rueda2;
	}

	public void setRueda2(Rueda rueda2) throws IOException {
		this.log1.insertarPaso("Moto: Atornillando Rueda 2");
		this.rueda2 = rueda2;
	}

	public Freno getFreno1() {
		return this.freno1;
	}

	public void setFreno1(Freno freno1) throws IOException {
		this.log1.insertarPaso("Moto: Atornillando Freno 1");
		this.freno1 = freno1;
	}

	public Freno getFreno2() {
		return this.freno2;
	}

	public void setFreno2(Freno freno2) throws IOException {
		this.log1.insertarPaso("Moto: Atornillando Freno 2");
		this.freno2 = freno2;
	}

	public Chasis getChasis() {
		return this.chasis;
	}

	public void setChasis(Chasis chasis) throws IOException {
		this.log1.insertarPaso("Moto: Atornillando Chasis");
		this.chasis = chasis;
	}
}
