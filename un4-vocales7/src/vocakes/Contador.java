package vocakes;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                // Declarar arreglo de 10 caracteres
                char[] arreglo = new char[10];

                // Solicitar al usuario que ingrese 10 letras minúsculas
                System.out.println("Ingrese 10 letras minúsculas:");

                for (int i = 0; i < 10; i++) {
                    System.out.print("Letra " + (i + 1) + ": ");
                    String entrada = scanner.next();
                    arreglo[i] = entrada.charAt(0);
                }

                // Contador de vocales
                int contadorVocales = 0;

                // Recorrer el arreglo con un ciclo for y contar vocales
                for (int i = 0; i < arreglo.length; i++) {
                    char letra = arreglo[i];

                    // Verificar si es vocal (a, e, i, o, u)
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        contadorVocales++;
                    }
                }

                // Imprimir el resultado
                System.out.println("\nConteo total de vocales encontradas: " + contadorVocales);

                scanner.close();
            }
        }



