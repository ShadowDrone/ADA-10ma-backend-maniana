import java.util.Scanner;

/**
 * Ejercicio24
 */
public class Ejercicio26 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numero, millares, centenas, decenas, unidades;
        System.out.println("Ingresar un numero entre 1 3999: ");
        numero = Entrada.nextInt();
        millares = numero / 1000;
        centenas = (numero / 100) % 10;
        decenas = (numero / 10) % 10;
        unidades = numero % 10;
        System.out.println("\n");
        switch (millares) {
            case 1:
                System.out.println("M");
                break;
            case 2:
                System.out.println("MM");
                break;
            case 3:
                System.out.println("MMM");
                break;
        }
        switch (centenas) {
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("CC");
                break;
            case 3:
                System.out.println("CCC");
                break;
            case 4:
                System.out.println("CD");
                break;
            case 5:
                System.out.println("D");
                break;
            case 6:
                System.out.println("DC");
                break;
            case 7:
                System.out.println("DCC");
                break;
            case 8:
                System.out.println("DCCC");
                break;
            case 9:
                System.out.println("CM");
                break;
        }
        switch (decenas) {
            case 1:
                System.out.println("X");
                break;
            case 2:
                System.out.println("XX");
                break;
            case 3:
                System.out.println("XXX");
                break;
            case 4:
                System.out.println("XL");
                break;
            case 5:
                System.out.println("L");
                break;
            case 6:
                System.out.println("LX");
                break;
            case 7:
                System.out.println("LXX");
                break;
            case 8:
                System.out.println("LXXX");
                break;
            case 9:
                System.out.println("XC");
                break;
        }
        switch (unidades) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
        }
        System.out.println("\n");
        /*
         * System.out.println("millares: " + millares + "\n";
         * System.out.println("centenas: " + centenas + "\n";
         * System.out.println("decenas: " + decenas + "\n";
         * System.out.println("unidades: " + unidades + "\n";
         */
    }
}
