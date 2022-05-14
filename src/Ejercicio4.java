import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {

		FileWriter escribir = null;
		FileReader leer = null;
		FileWriter escribir2 = null;

		try {
			escribir = new FileWriter("palabras.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		escribir.write("antena \nhelicoptero \njupiter \nboniato \nzorro \ncabeza ");

		if (escribir != null) {
			escribir.close();
		}
		int c = 0;
		leer = new FileReader(args[0]+".txt");

		ArrayList<Character> caracteres = new ArrayList();
		ArrayList<String> cadenas = new ArrayList();

		while (c != -1) {
			while ((char) (c = leer.read()) != '\n' && c != -1) {
				System.out.println((char) c);
				caracteres.add((char) c);
				System.out.println(caracteres);

			}

			String hola = "";
			for (Character palabra : caracteres) {
				hola += palabra;
			}
			cadenas.add(hola);
			System.out.println(cadenas);
			caracteres.clear();
		}
		Collections.sort(cadenas);
		Iterator<String> it = cadenas.iterator();
		escribir2 = new FileWriter(args[0] + "_sort.txt");
		while (it.hasNext()) {
			escribir2.write(it.next() + "\n");
		}
		if (escribir2 != null) {
			escribir2.close();
		}
		if (leer != null) {
			leer.close();
		}

	}
}
