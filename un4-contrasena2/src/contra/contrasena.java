package contra;

import java.util.Scanner;

public class contrasena {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenaCorrecta = "ingenieria2025";
        String contrasenaIngresada;
        int intentos =0;
        while (intentos <3){
            System.out.println("INTRODUCE LA CONTRASENA:");
            Scanner scanner = new Scanner(System.in);

            contrasenaIngresada = scanner.nextLine();
            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("ACCESO CONCEDIDO");
                break;
            }else {
                System.out.println("CONTRSENA INCORRECTA");
                intentos++;
            }
            if (intentos==3){
                System.out.println("ACCESO DENEGADO. CONTACTE SOPORTE");
            }
        }
    }
}


