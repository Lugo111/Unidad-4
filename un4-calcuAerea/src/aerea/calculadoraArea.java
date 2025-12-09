package aerea;

import java.util.Scanner;

public class calculadoraArea {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = 0;

        System.out.println("===== Calculadora de Área =====");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Elige una opción (1 o 2): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            // Círculo
            System.out.print("Ingresa el radio del círculo: ");
            double radio = sc.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
            System.out.printf("El área del círculo es: %.2f%n", area);

        } else if (opcion == 2) {
            // Rectángulo
            System.out.print("Ingresa la base del rectángulo: ");
            double base = sc.nextDouble();
            System.out.print("Ingresa la altura del rectángulo: ");
            double altura = sc.nextDouble();
            area = base * altura;
            System.out.printf("El área del rectángulo es: %.2f%n", area);

        } else {
            System.out.println("Opción no válida.");
            sc.close();
            return; // terminar el programa
        }

        // Comparar con 100
        if (area > 100) {
            System.out.println("El área es mayor que 100 unidades cuadradas.");
        } else {
            System.out.println("El área es menor o igual a 100 unidades cuadradas.");
        }


    }
}





