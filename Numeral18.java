import java.util.Scanner;

public class Numeral18 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //todo: Escribir un programa en Java que lea dos números del teclado y diga cuál es el mayor y cual el menor

        //entrada

        System.out.println("Ingrese el primer número:");
        double data1 = scr.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double data2 = scr.nextDouble();

        //Proceso

        if (data1 > data2) {
            System.out.println("El primer número es mayor que el segundo número");
        } else if (data1 < data2) {
            System.out.println("El primer número es menor que el segundo número");
        }else {
                System.out.println("Los números son iguales");
            }
        }

    }

