import java.util.Scanner;

/**
 * Ejercicio34
 */
public class EjercicioExtra06 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int dia, mes, anio;
        System.out.println("Ingresar dia: ");
        dia = Entrada.nextInt();
        System.out.println("Ingresar mes: ");
        mes = Entrada.nextInt();
        System.out.println("Ingresar año: ");
        anio = Entrada.nextInt();
        System.out.println("La fecha es: " + unificarFecha(dia, mes, anio));
    }

    public static long unificarFecha(int dia, int mes, int anio) {
        return anio * 10000 + mes * 100 + dia;
    }
}
