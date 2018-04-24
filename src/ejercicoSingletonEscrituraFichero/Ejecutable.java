package ejercicoSingletonEscrituraFichero;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		PiezasFactory pf = new PiezasFactory();

		while (menu == -1) {
			System.out.println(
					"¿Quieres crear un coche (Pulsa 1) o una moto (Pulsa 2)? Pulsa cualquier otro numero para salir");
			menu = scan.nextInt();
		}

		if (menu == 1) {
			Coche coche1 = new Coche();
			coche1.setRueda1(pf.crearRueda(1));
			coche1.setRueda2(pf.crearRueda(1));
			coche1.setRueda3(pf.crearRueda(1));
			coche1.setRueda4(pf.crearRueda(1));
			coche1.setFreno1(pf.crearFreno(1));
			coche1.setFreno2(pf.crearFreno(1));
			coche1.setFreno3(pf.crearFreno(1));
			coche1.setFreno4(pf.crearFreno(1));
			coche1.setChasis(pf.crearChasis(1));
		} else if (menu == 2) {
			Moto moto1 = new Moto();
			moto1.setRueda1(pf.crearRueda(2));
			moto1.setRueda2(pf.crearRueda(2));
			moto1.setFreno1(pf.crearFreno(2));
			moto1.setFreno2(pf.crearFreno(2));
			moto1.setChasis(pf.crearChasis(2));
		}

		scan.close();
	}

}
