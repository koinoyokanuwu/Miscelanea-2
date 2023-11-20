import java.util.Scanner;

public class Numeral31 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //todo: Realizar un algoritmo que determine si un año es bisiesto o no lo es.

        //entrada
        System.out.println("Ingrese un año y se determinará si es bisiesto");
        System.out.println("Ingrese el año:");

        boolean bisiesto = false;
        int anio = scr.nextInt();

        if (anio % 400 == 0) {
            bisiesto = true;
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            bisiesto = true;
        }else {
            bisiesto = false;
        }

        if (bisiesto){
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisiesto");
        }

    }
}
