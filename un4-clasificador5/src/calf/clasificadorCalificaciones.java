package calf;

import java.util.Scanner;

public class clasificadorCalificaciones {


    public static String clasificarCalificacion(int nota) {
        if (nota >= 90 && nota <=100) {
            return "sobresaliente";
        } else if (nota >= 80) {
            return "notable";
        } else if (nota >= 70) {
            return "aprobado";
        } else if (nota >= 0) {
            return "reprobatorio";
        } else {
            return "calificacion invalida";
        }
    }
    public static void main (String[] args) {
        Scanner sc = new
                Scanner(System.in);
        System.out.println("INGRESE SU CALIFICACION (0-100)");
        int nota = sc.nextInt();
        String resultado = clasificarCalificacion(nota);
        System.out.println("RESULTADO:" + resultado);


    }
}




