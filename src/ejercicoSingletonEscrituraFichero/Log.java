package ejercicoSingletonEscrituraFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
	private static Log log1;
	private File fichero;
	private FileWriter fw;

	private Log() throws IOException {
		this.fichero = new File("Pasos.txt");
		this.fw = new FileWriter(this.fichero, true);
	}

	public static Log getLog() throws IOException {
		if (log1 == null) {
			log1 = new Log();
		}

		return log1;
	}

	public void insertarPaso(String paso) throws IOException {
		this.fw.write(paso + "\n");
	}

	public void cerrarFichero() throws IOException {
		this.fw.close();
	}

}
