import java.util.Scanner;

public class Numeral17 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //entrada
        System.out.println("Identificar si un número es positivo o negativo");
        System.out.println("Ingrese el número a validar: ");
        double data = scr.nextDouble();

        //proceso
        if (data >= 0){
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }
}




