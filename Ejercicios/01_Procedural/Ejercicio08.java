import java.util.Scanner;

/**
 * Ejercicio08
 */
public class Ejercicio08 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int mes, anio, dias = 0;
        System.out.println("Ingresar anio: ");
        anio = Entrada.nextInt();
        System.out.println("Ingresar mes: ");
        mes = Entrada.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (bisiesto(anio))
                    dias = 29;
                else
                    dias = 28;
                break;
        }
        System.out.println("El mes tiene " + dias + " dias.");

    }

    static boolean bisiesto(int anio) {
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0))
            return true;
        else
            return false;
    }

}
