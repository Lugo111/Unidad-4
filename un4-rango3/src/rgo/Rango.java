package rgo;

import java.util.Scanner;

public class Rango {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        int inicio, fin,suma = 0;
        System.out.println("INGRESA EL INICIO DEL RANGO");
        inicio = entrada.nextInt();
        System.out.println("INGRESA EL FIN DEL RANGO");
        fin = entrada.nextInt();
        if (inicio <= fin){
            for (int i= inicio; i<= fin; i++) {
                suma = suma + i;
            }
            System.out.println("LA SUMA DE TODOS LOS NUMEROS ENTRE" + inicio+ "y" + fin + "ES:" + suma);
        } else{
            System.out.println("EL INICIO DEL RANGO DEBE SER MENOR O IGUAL AL FIN DEL RANGO");
        }


    }
}




