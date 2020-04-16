import java.util.Scanner;

/**
 * Ejercicio17
 */
public class Ejercicio21 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int fecha, fecha_max, fecha_min;
        String nombre, nombre_max, nombre_min;
        System.out.println("Ingresar nombre (\"fin\" para finalizar): ");
        nombre = Entrada.nextLine();
        System.out.println("Ingresar fecha de nacimiento en formato ddmmaaaa: ");
        fecha = Entrada.nextInt();
        fecha = formato(fecha);
        fecha_max = fecha;
        fecha_min = fecha;
        nombre_max = nombre;
        nombre_min = nombre;
        while (nombre != "fin") {
            if (fecha > fecha_max) {
                fecha_max = fecha;
                nombre_max = nombre;
            }
            if (fecha < fecha_min) {
                fecha_min = fecha;
                nombre_min = nombre;
            }
            System.out.println("Ingresar nombre (\"fin\" para finalizar): ");
            nombre = Entrada.nextLine();
            System.out.println("Ingresar fecha de nacimiento en formato ddmmaaaa: ");
            fecha = Entrada.nextInt();
            fecha = formato(fecha);
        }
        System.out.println("\nEl nombre de la persona de mayor edad es " + nombre_min);
        System.out.println("El nombre de la persona de menor edad es " + nombre_max);
    }

    static int formato(int f) {
        int dia, mes, anio;
        dia = f / 1000000;
        mes = (f / 10000) % 100;
        anio = f % 10000;
        return anio * 10000 + mes * 100 + dia;
    }
}
