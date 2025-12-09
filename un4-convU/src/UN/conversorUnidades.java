package UN;

import java.util.Scanner;

public class conversorUnidades {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner entrada  = new Scanner(System.in);
        double valor, resultado;

        System.out.println("===CONVERCION DE UNIDADES ===");
        System.out.println("INGRESA EL VALOR QUE QUIERAS CONVERTIR");
        valor = entrada.nextDouble();

        System.out.println("ELIJA UNA OPCION DE CONVERCION");
        System.out.println("1 KILOMETROS A MILLAS ");
        System.out.println("2 CENTIGRADOS A FAHRENHEIT");
        System.out.println("3 METROS A PIES ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                resultado = valor * 0.62171;
                System.out.println(valor + "KILOMETROS SON" + resultado + "MILLAS.");
                break;
            case 2:
                resultado = valor * 9 / 5 + 32;
                System.out.println(valor + "CENTIGRADOS SON" + resultado + "FAHRENHEIT");
                break;
            case 3:
                resultado = valor * 3.28084;
                System.out.println(valor + "METROS" + resultado + "PIES");
                break;
        }
    }
}




