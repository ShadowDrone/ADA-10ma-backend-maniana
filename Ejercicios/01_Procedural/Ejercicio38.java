import java.util.Scanner;

/**
 * Ejercicio42
 */
public class Ejercicio38 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int hora, tiempo, resultado;
        System.out.println("Ingresar hora en formato hhmmss: ");
        hora = Entrada.nextInt();
        System.out.println("Ingresar tiempo en formato hhmmss: ");
        tiempo = Entrada.nextInt();
        resultado = sumar_hora(hora, tiempo);
        System.out.println(
                "\nLa nueva hora es: " + resultado / 10000 + ":" + resultado / 100 % 100 + ":" + (resultado % 100));
    }

    public static int sumar_hora(int h, int t) {
        int h_h = h / 10000;
        int h_m = h / 100 % 100;
        int h_s = h % 100;
        int t_h = t / 10000;
        int t_m = t / 100 % 100;
        int t_s = t % 100;
        int res_s = h_s + t_s;
        int res_m = h_m + t_m;
        int res_h = h_h + t_h;
        int res;
        if (res_s >= 60) {
            res_s -= 60;
            res_m++;
        }
        if (res_m >= 60) {
            res_m -= 60;
            res_h++;
        }
        if (res_h >= 24) {
            res_h -= 24;
        }
        res = res_h * 10000 + res_m * 100 + res_s;
        return res;
    }
}
