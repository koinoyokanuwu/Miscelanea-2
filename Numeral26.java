import java.util.Scanner;

public class Numeral26 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        //todo: Pidiendo el día y el mes de nacimiento mostrar el signo.

        //entrada
        System.out.println("Ingrese su dia y mes de nacimiento y se le devolverá su signo zodiacal");
        System.out.println("Ingrese el día de nacimiento");
        int dia = scr.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = scr.nextInt();
        String signo = "";

        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)){
            signo = "aries";
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)){
            signo = "tauro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)){
            signo = "géminis";
        }else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)){
            signo = "cáncer";
        }else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)){
            signo = "leo";
        }else if ((dia >= 23 && mes == 8) || (dia <= 23 && mes == 9)){
            signo = "virgo";
        }else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)){
            signo = "libra";
        }else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)){
            signo = "escorpio";
        }else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)){
            signo = "sagitario";
        }else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)){
            signo = "capricornio";
        }else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)){
            signo = "acuario";
        }else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)){
            signo = "piscis";
        } else {
            signo = "inválido";
        }

        System.out.println("Su signo es: " + signo);
    }
}
