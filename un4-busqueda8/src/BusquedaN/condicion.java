package BusquedaN;


import java.util.Scanner;

    public class condicion {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Declarar arreglo de 7 números enteros
            int[] numeros = new int[7];

            System.out.println("Ingrese 7 números enteros:");

            // Llenar el arreglo
            for (int i = 0; i < 7; i++) {
                System.out.print("Número " + (i + 0) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Pedir número a buscar
            System.out.print("\nIngrese un número para buscarlo: ");
            int buscado = scanner.nextInt();

            // Búsqueda con while
            int i = 0;
            boolean encontrado = false;

            while (i < numeros.length) {

                if (numeros[i] == buscado) {
                    System.out.println("\nNúmero encontrado en la posición (índice): " + i);
                    encontrado = true;
                    break;  // Terminar ciclo inmediatamente
                }

                i++; // seguir buscando
            }

            // Si no se encontró
            if (!encontrado) {
                System.out.println("\nEl número NO se encontró en el arreglo.");
            }


        }
    }


