import java.util.Scanner;

/**
 * Ejercicio02
 */
public class Ejercicio03 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int anio;
        int mes;
        int dia;

        System.out.println("Ingresar dia:");
        dia = Entrada.nextInt();
        System.out.println("Ingresar mes:");
        mes = Entrada.nextInt();
        System.out.println("Ingresar año:");
        anio = Entrada.nextInt();
        System.out.println("El resultado es: " + ((anio * 10000) + (mes * 100) + dia));
    }
}