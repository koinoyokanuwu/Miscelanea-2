import java.util.Scanner;

public class Numeral27 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        //todo: Pidiendo el ingreso de la base y la altura de un cuadrilátero, indicar si es cuadrado o rectángulo. Para cualquiera de los dos casos mostrar el perímetro y la superficie de la figura.

        float perimetro = 0;
        float superficie = 0;

        //entrada
        System.out.println("Ingrese base y altura, se devolverá el perímetro, superficie y si es un cuadrado rectángulo");
        System.out.println("Ingrese la base");
        float base = scr.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = scr.nextFloat();

        if (base == altura){
            System.out.println("El cuadrilátero es un cuadrado");
            perimetro = base * 4;
            superficie = base * base;
        }else {
            System.out.println("El cuadrilátero es un rectángulo");
            perimetro = (base * 2) + (altura * 2);
            superficie = base * altura;
        }

        System.out.println("El perímetro: " + perimetro + " y la superficie es: " + superficie);

    }
}
