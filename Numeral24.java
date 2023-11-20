import java.util.Scanner;

public class Numeral24 {

    public static void main(String[] args) {
        //todo: Dadas las longitudes de los tres lados de un triángulo determinar si es equilátero o no.
        Scanner scr = new Scanner(System.in);

        System.out.println("Indicaremos si las medidas ingresadas forman un triángulo equilátero");
        System.out.println("Ingrese la medida #1");
        float medida1 = scr.nextFloat();
        System.out.println("Ingrese la medida #2");
        float medida2 = scr.nextFloat();
        System.out.println("Ingrese la medida #3");
        float medida3 = scr.nextFloat();

        if (medida1 == medida2 && medida1 == medida3) {

            System.out.println("Estas medidas corresponden a un triángulo equilátero");

        } else {
            System.out.println("Estas medidas no corresponden a un triángulo equilátero");
        }

    }


}
