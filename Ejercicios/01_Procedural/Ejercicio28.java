import java.util.Scanner;

/**
 * Ejercicio30
 */
public class Ejercicio28 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String domicilio, nombre, apellido, domicilio_max = "";
        char tipo, sexo, nivel, nivel_completo = 'N';
        int cantidad = -1, i, edad, cantidad_max = 0, a = 0, cp = 0, cs = 0, ct = 0, cu = 0;
        double c = 0, c1 = 0, c2 = 0, a2 = 0, cm = 0, cf = 0;
        // double porcentaje_analf;
        while (cantidad != 0) {
            System.out.println("Ingresar cantidad de integrantes: ");
            cantidad = Entrada.nextInt();
            if (cantidad == 0)
                break;

            System.out.println("Ingresar domicilio: ");
            domicilio = Entrada.nextLine();
            System.out.println("Ingresar tipo de vivienda (C, D): ");
            tipo = Entrada.nextLine().charAt(0);

            if (cantidad > cantidad_max && tipo == 'd') {
                cantidad_max = cantidad;
                domicilio_max = domicilio;
            }
            for (i = 1; i <= cantidad; i++) {
                System.out.println("\nNombre: ");
                nombre = Entrada.nextLine();
                System.out.println("Apellido: ");
                apellido = Entrada.nextLine();
                System.out.println("Edad: ");
                edad = Entrada.nextInt();
                System.out.println("Sexo (M, F): ");
                sexo = Entrada.nextLine().charAt(0);
                ;
                System.out.println("Nivel de estudios alcanzados (N, P, S, T, U): ");
                nivel = Entrada.nextLine().charAt(0);

                a = a + edad;
                a2 = a2 + edad;
                if (nivel != 'n') {
                    System.out.println("Completo? (I, C): ");
                    nivel_completo = Entrada.nextLine().charAt(0);
                    ;

                }
                c++;
                if ((nivel == 'p' && nivel_completo == 'c') || nivel == 's' || nivel == 't' || nivel == 'u') {
                    if (sexo == 'm')
                        System.out.println("\nEl senior " + nombre + ' ' + apellido + " de " + edad
                                + " anios tiene los estudios primarios completos.\n");
                    else
                        System.out.println("\nLa seniora " + nombre + ' ' + apellido + " de " + edad
                                + " anios tiene los estudios primarios completos.\n");
                }
                if (edad > 10 && nivel == 'n')
                    c1++;
                if (nivel == 'p' && nivel_completo == 'i')
                    cp++;
                if (nivel == 's' && nivel_completo == 'i')
                    cs++;
                if (nivel == 't' && nivel_completo == 'i')
                    ct++;
                if (nivel == 'u' && nivel_completo == 'i')
                    cu++;
                if (sexo == 'm')
                    cm++;
                else
                    cf++;
            }
            System.out.println("\nEl promedio de edad de esta familia es de " + a / c + "anios.\n\n");
            c2 = c2 + c;
            c = 0;
            a = 0;
        }
        System.out.println("\nEl porcentaje de analfabetismo es del " + c1 / c2 * 100 + "%.\n");
        if (cantidad_max != 0)
            System.out.println(
                    "El domicilio de la familia con mayor cantidad de integrantes que viven en departamento es: "
                            + domicilio_max + ".\n");
        else
            System.out.println("No hay departamentos en esta ciudad.\n");
        System.out.println("El promedio de edad de la ciudad es de " + a2 / c2 + " anios.\n\n");
        System.out.println("La cantidad de encuestados con nivel primario incompleto es: " + cp + ".\n");
        System.out.println("La cantidad de encuestados con nivel secundario incompleto es: " + cs + ".\n");
        System.out.println("La cantidad de encuestados con nivel terciario incompleto es: " + ct + ".\n");
        System.out.println("La cantidad de encuestados con nivel universitario incompleto es: " + cu + ".\n\n");
        System.out.println("El porcentaje de encuestados de sexo masculino es del " + (cm / c2 * 100) + "%.\n");
        System.out.println("El porcentaje de encuestados de sexo femenino es del " + (cf / c2 * 100) + "%.\n");
        /*
         * System.out.println("domicilio: " + domicilio); System.out.println("tipo: " +
         * tipo); System.out.println("cantidad: " + cantidad);
         */
    }
}
