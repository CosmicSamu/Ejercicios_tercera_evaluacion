import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {

		FileWriter escribir = null;
		FileWriter escribir2 = null;
		FileWriter escribir3 = null;
		FileReader leer = null;
		FileReader leer2 = null;

		escribir = new FileWriter("texto1.txt");
		escribir2 = new FileWriter("texto2.txt");
		escribir3 = new FileWriter("texto3.txt");
		leer = new FileReader(args[0]);
		leer2 = new FileReader(args[1]);

		escribir.write("Hola que tal \nme llamo samu\nhoy es jueves");
		escribir2.write("Me gustan las patatas\ny los dias de verano\ny montar en bici");

		if (escribir != null) {
			escribir.close();
		}
		if (escribir2 != null) {
			escribir2.close();
		}
		// tiene que leer despues de que se cierre el documento por escritura

		int c;
		leer = new FileReader("texto1.txt");

		ArrayList<Character> caracteres = new ArrayList();

		while ((char) (c = leer.read()) != '\n') {
			caracteres.add((char) c);
		}

		if (leer != null) {
			leer.close();
			for (Character caracter : caracteres) {
				escribir3.write(caracter);
			}

		}
		int v;
		leer2 = new FileReader("texto2.txt");

		ArrayList<Character> caracteres2 = new ArrayList();

		while ((char) (v = leer2.read()) != '\n') {
			caracteres2.add((char) v);
		}

		if (leer2 != null) {
			leer2.close();
			escribir3.write("\n");
			for (Character caracter2 : caracteres2) {
				escribir3.write(caracter2);
			}
			if (escribir3 != null) {
				escribir3.close();
			}

		}
	}

}
