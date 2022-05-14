import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1 {

    public static void main(String[] args) {
        int contador = 1;
        FileWriter escribir = null;

        ArrayList<Integer> primos = new ArrayList<Integer>();

        for (int i = 1; i <= 500; i++) {
            primos.add(i);
        }

        Iterator<Integer> it = primos.iterator();

        for (int i = 1; i < 500; i++) {
            if (contador * contador < 500) {
                contador++;
                it=primos.iterator();
                while (it.hasNext()) {
                	int numero = it.next();
                    System.out.println(numero);
                    System.out.println(contador);
                    System.out.println(primos.get(primos.size()-1));
                    
                    // numero != contador para que no borre el número con el que estás comprobando
                    if (numero % contador == 0 && numero != contador) {
                        it.remove();
                    }
                }

            }
        }

        try {
            escribir = new FileWriter("primos.txt");
            for (Integer numeros : primos) {

                escribir.write(numeros + "\n");

            }
            if (escribir != null) {
                escribir.close();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}