import java.util.Scanner;

public class Numeral21 {
        public static void main(String[] args) {

                    Scanner scr = new Scanner(System.in);

                    //todo: ingresar dos números, si a es > b sumarlos, sino restarlos

                    //entrada
                    System.out.println("Ingresar dos números, si a > b, sumarlos, sino restarlos");
                    System.out.println("Ingrese el primer número");
                    double num1 = scr.nextDouble();
                    System.out.println("Ingrese el segundo número");
                    double num2 = scr.nextDouble();
                    //proceso
                    if (num1 > num2) {
                        double suma = num1 + num2;
                        System.out.println("el número 'a' es > al número 'b' y la suma es " + suma);
                    } else if (num1 < num2) {
                        double resta = num1 - num2;
                        System.out.println("el número 'a' es > al número 'b' y la resta es " + resta);
                    } else {
                        System.out.println("Son iguales");
                    }


                }


            }



