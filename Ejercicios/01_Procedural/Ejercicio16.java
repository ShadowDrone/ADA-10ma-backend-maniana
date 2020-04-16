import java.util.Scanner;

/**
 * Ejercicio13
 */
public class Ejercicio16 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double sueldo;
        int c, d, e, f;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        System.out.println("Ingresar sueldo:");
        sueldo = Entrada.nextDouble();
        while (sueldo != 0) {
            if (sueldo < 2000)
                c++;
            else if (sueldo < 3000)
                d++;
            else if (sueldo < 5000)
                e++;
            else
                f++;
            sueldo = Entrada.nextDouble();
        }
        System.out.println("\n" + c + " empleados ganan menos de $2.000");
        System.out.println(d + " empleados ganan $2.000 o mas pero menos de $3.000");
        System.out.println(e + " empleados ganan $3.000 o mas pero menos de $5.000");
        System.out.println(f + " empleados ganan $5.000 o mas");
    }
}
