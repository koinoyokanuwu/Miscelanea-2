import java.util.Scanner;

public class Numeral23 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        //todo:numDia es una variable numérica que puede tomar 7 valores, ellos son 1, 2, 3, 4, 5, 6 o 7. Mostar el nombre el nombre del día de la semana que corresponde al valor de la variable numDia.

        System.out.println("Identifique el número que corresponde a cada día de la semana");
        System.out.println("Ingrese el número a validar");
        int numDia = scr.nextInt();
        if (numDia == 1){
            System.out.println("El día 1 es lunes");
        } else if (numDia == 2) {
            System.out.println("El día 2 es martes");
        } else if (numDia == 3) {
            System.out.println("El día 3 es miércoles");
        } else if (numDia == 4) {
            System.out.println("El día 4 es jueves");
        } else if (numDia == 5) {
            System.out.println("El día 5 es viernes");
        } else if (numDia == 6) {
            System.out.println("El día 6 es sábado");
        } else if (numDia == 7) {
            System.out.println("El día 7 es domingo");
        } else
            System.out.println("El número ingresado no es válido");}
    }



