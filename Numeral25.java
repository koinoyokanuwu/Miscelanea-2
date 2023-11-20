import java.util.Scanner;

public class Numeral25 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        //todo:  Dados dos números A y B sumarlos si al menos uno de ellos es negativo en caso contrario multiplicarlos.

        //entrada
        System.out.println("Ingresar dos números, sumarlos si es negativo, si es positivo, multiplicarlos");
        System.out.println("Ingrese el primer número");
        double num1 = scr.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2 = scr.nextDouble();
        double resultado = 0;
        //proceso
        if (num1 < 0 || num2 < 0) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es:  " + resultado);
        }
         else {
             resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        }


    }


}

