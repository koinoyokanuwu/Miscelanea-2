import java.util.Scanner;

public class Numeral22 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        //todo: Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división n es posible.

        System.out.println("Ingrese dos números y estos se dividirán entre sí");
        System.out.println("Digite el primer número");
        int num1 = scr.nextInt();

        System.out.println("Digite el segundo número");
        int num2 = scr.nextInt();

        if (num2 == 0){
            System.out.println("No es posible realizar la operación");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado es: "+ resultado);
        }





    }
}
