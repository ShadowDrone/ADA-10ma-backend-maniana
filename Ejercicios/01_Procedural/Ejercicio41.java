import java.util.Scanner;

/**
 * Ejercicio47
 */
public class Ejercicio41 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int dia, mes, anio, fecha, fecha_min = 0, c = 0, d = 0, e = 0;
        boolean b = false;
        char sexo, sexo_min = ' ';
        System.out.println("Ingresar datos: " + "\n");
        while (true) {
            System.out.println("\nDia: ");
            dia = Entrada.nextInt();
            if (dia == 0)
                break;
            System.out.println("Mes: ");
            mes = Entrada.nextInt();
            ;
            System.out.println("Año: ");
            anio = Entrada.nextInt();
            System.out.println("Sexo: ");
            sexo = Entrada.nextLine().charAt(0);
            fecha = anio * 10000 + mes * 100 + dia;
            if (mes == 10)
                c++;
            if (fecha < 19900709)
                d++;
            if (sexo == 'f' && fecha < 19821221 && fecha >= 19820921)
                e++;
            if (!b) {
                fecha_min = fecha;
                sexo_min = sexo;
                b = true;
            }
            if (fecha < fecha_min && b) {
                fecha_min = fecha;
                sexo_min = sexo;
            }
        }
        System.out.println("\nEn el mes de octubre de todos los años nacieron " + c + "personas.\n");
        System.out.println("Antes del 9 de julio de 1990 nacieron " + d + " personas.\n");
        System.out.println("En la primavera del 1982 nacieron " + e + " mujeres.\n");
        if (sexo_min == 'm')
            System.out.println("El sexo de la persona mas vieja es: masculino.\n");
        else
            System.out.println("El sexo de la persona mas vieja es: femenino.\n");
    }
}
