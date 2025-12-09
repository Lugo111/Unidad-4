package GeneradordeSecuencia;
import java.util.Scanner;
public class generarSecuencia {


    // Función pedida en el ejercicio
    public static void generarSecuencia(int N) {

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el valor de N
        System.out.print("Ingrese un número entero positivo: ");
        int N = scanner.nextInt();

        // Llamar a la función
        generarSecuencia(N);

    }
}


