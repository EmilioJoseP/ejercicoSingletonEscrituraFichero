package ejercicoSingletonEscrituraFichero;

import java.io.IOException;

public class Coche {
	private Rueda rueda1;
	private Rueda rueda2;
	private Rueda rueda3;
	private Rueda rueda4;
	private Freno freno1;
	private Freno freno2;
	private Freno freno3;
	private Freno freno4;
	private Chasis chasis;
	private Log log1;

	public Coche() throws IOException {
		this.log1 = Log.getLog();
	}

	public Rueda getRueda1() {
		return this.rueda1;
	}

	public void setRueda1(Rueda rueda1) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Rueda 1");
		this.rueda1 = rueda1;
	}

	public Rueda getRueda2() {
		return this.rueda2;
	}

	public void setRueda2(Rueda rueda2) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Rueda 2");
		this.rueda2 = rueda2;
	}

	public Rueda getRueda3() {
		return this.rueda3;
	}

	public void setRueda3(Rueda rueda3) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Rueda 3");
		this.rueda3 = rueda3;
	}

	public Rueda getRueda4() {
		return this.rueda4;
	}

	public void setRueda4(Rueda rueda4) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Rueda 4");
		this.rueda4 = rueda4;
	}

	public Freno getFreno1() {
		return this.freno1;
	}

	public void setFreno1(Freno freno1) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Freno 1");
		this.freno1 = freno1;
	}

	public Freno getFreno2() {
		return this.freno2;
	}

	public void setFreno2(Freno freno2) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Freno 2");
		this.freno2 = freno2;
	}

	public Freno getFreno3() {
		return this.freno3;
	}

	public void setFreno3(Freno freno3) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Freno 3");
		this.freno3 = freno3;
	}

	public Freno getFreno4() {
		return this.freno4;
	}

	public void setFreno4(Freno freno4) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Freno 4");
		this.freno4 = freno4;
	}

	public Chasis getChasis() {
		return this.chasis;
	}

	public void setChasis(Chasis chasis) throws IOException {
		this.log1.insertarPaso("Coche: Atornillando Chasis");
		this.chasis = chasis;
	}
}
