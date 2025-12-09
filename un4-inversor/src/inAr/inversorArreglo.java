package inAr;

import java.util.Scanner;

    public class inversorArreglo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Declarar un arreglo de 5 números enteros
            int[] numeros = new int[5];

            // Pedir los 5 números al usuario
            System.out.println("Ingresa 5 números enteros:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt(); // Guarda el número en el arreglo
            }

            // Mostrar los números en orden inverso
            System.out.println("\nNúmeros en orden inverso:");

            for (int i = 4; i >= 0; i--) {
                System.out.println(numeros[i]);
            }
        }
    }





