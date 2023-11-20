import java.util.Scanner;

public class Numeral19 {
    public static void main(String[] args) {
        //todo: Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en pantalla el menor y el mayor de todos ellos.
        Scanner scr = new Scanner(System.in);
        //entrada
        System.out.println("Ingrese tres números para calcular cuál es el mayor y el menor de todos ellos");

        System.out.println("Digite el primer número:");
        float data1 = scr.nextFloat();

        System.out.println("Digite el segundo número");
        float data2 = scr.nextFloat();

        System.out.println("Digite el tercer número");
        float data3 = scr.nextFloat();

        //proceso
        if (data1 > data2 && data1 > data3){
            if (data2 > data3){
                System.out.println("El número mayor es; " + data1 + " y el número menor es: " + data3);
            }else {
                System.out.println("El número mayor es; " + data1 + " y el número menor es: " + data2);
            }
        }

        if (data2 > data1 && data2 > data3){
            if (data1 > data3){
                System.out.println("El número mayor es: " + data2 + " y el número menor es: " + data1);
            }else {
                System.out.println("El número mayor es: " + data2 + " y el número menor es: " + data3);
            }
        }

        if (data3 > data1 && data3 > data2){
            if (data2 > data1){
                System.out.println("El número mayor es:" + data3 + " y el número menor es: " + data1);
            }
            else {
                System.out.println("El número mayor es:" + data3 + " y el número menor es: " + data2);
            }
        }

    }
}
