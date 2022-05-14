import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {

		FileReader leer = null;

		try {
			int c;
			leer = new FileReader("primos.txt");

			while ((c = leer.read()) != -1) {
				System.out.print((char) c);
			}

		} finally {
			if (leer != null) {
				leer.close();
			}
		}

	}
}
