package calculadora;


import java.util.Scanner;

public class calcularPromedio {


    // Función que calcula el promedio
    public static float calcularPromedio(float[] arreglo, int tamaño) {
        float suma = 0;

        for (int i = 0; i < tamaño; i++) {
            suma += arreglo[i];
        }

        return suma / tamaño;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar un arreglo de 5 calificaciones flotantes
        float[] calificaciones = new float[5];

        // 2. Llenar el arreglo pidiendo al usuario
        System.out.println("Ingrese 5 calificaciones:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        // 3. Llamar a la función para obtener el promedio
        float promedio = calcularPromedio(calificaciones, 5);

        // 4. Mostrar el resultado final
        System.out.println("\nEl promedio de las 5 calificaciones es: " + promedio);


    }


}
