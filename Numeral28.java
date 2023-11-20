import java.util.Scanner;

public class Numeral28 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        //todo: Un negocio hace descuentos en las ventas de sus productos. Si la compra es inferior a $100 el descuento es del 5%, si es mayor o igual a 100 y menor a 200 el descuento es del 10% sino será del 15%. Dado el precio de la venta mostrar el descuento realizado en pesos y el precio final con descuento.

        //entrada
        System.out.println("Ingrese el precio del producto y se le devolverá el precio con descuento, con base al valor del precio");
        System.out.println("Ingrese el precio del producto: ");

        double precio = scr.nextDouble();
        double descuento = 0;

        if (precio < 100){
            descuento = precio * 0.05;
        } else if (precio >= 100 && precio < 200) {
            descuento = precio * 0.1;
        }else{
            descuento = precio * 0.2;
        }

        System.out.println("El descuento a realizar es de $" + descuento + " el precio final es de $" + (precio - descuento));

    }
}
