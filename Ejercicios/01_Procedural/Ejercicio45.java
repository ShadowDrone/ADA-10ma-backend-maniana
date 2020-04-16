import java.util.Scanner;

/**
 * Ejercicio48
 */
public class Ejercicio45 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int celular, tiempo, i, min_utilizados;
        Integer min_excedidos = 0;
        Integer min_libres = 0;
        Double costo = 0D, cargo_extra = 0D, monto = 0D;
        String nombre = "", direccion = "";
        char tipo;
        for (i = 0; i < 3; i++) {
            while (true) {
                System.out.println("\nNo. de celular: ");
                celular = Entrada.nextInt();

                if (celular == 0)
                    break;
                System.out.println("Nombre: ");
                nombre = Entrada.nextLine();
                System.out.println("Direccion: ");
                direccion = Entrada.nextLine();
                System.out.println("Tiempo utilizado: ");
                tiempo = Entrada.nextInt();
                System.out.println("Tipo de abono: ");
                tipo = Entrada.nextLine().charAt(0);
                min_utilizados = toMin(tiempo);
                asignar_valores_segun_tipo(tipo, costo, min_libres, cargo_extra);
                calcular_monto(costo, min_libres, cargo_extra, min_utilizados, min_excedidos, monto);
                // array nombre[i] = nombre
                // array direccion[i] = direccion
                // ...
                // i++ // cuantos elementos???
            } // termina while
            mostrar_turno(i);
            System.out.println("Nombre Direccion Minutos libres Minutos excedidos Monto Total\n");
            // for i
            // System.out.println(nombre [i] + ...
            System.out.println(
                    nombre + '\t' + direccion + "\t" + min_libres + "\t\t" + min_excedidos + "\t\t $" + monto + '\n');
        } // termina
    }

    public static void calcular_monto(double costo, int min_libres, double cargo_extra, int min_utilizados,
            Integer min_excedidos, Double monto) {
        min_excedidos = min_utilizados - min_libres;
        if (min_excedidos < 0)
            min_excedidos = 0;
        monto = (costo + min_excedidos * cargo_extra) * 1.21;
    }

    /*
     * void solicitar_datos (int& celular, string& nombre, string& direccion, int&
     * tiempo, char& tipo) { System.out.println("\nNo. de celular: "; celular;
     * cin.ignore(); if (celular == 0) break; System.out.println("Nombre: ";
     * getline(cin, nombre); System.out.println("Direccion: "; getline(cin,
     * direccion); System.out.println("Tiempo utilizado: "; tiempo;
     * System.out.println("Tipo de abono: "; tipo; }
     */
    public static void mostrar_turno(int i) {
        if (i == 0)
            System.out.println("\nTurno mañana \n\n");
        else if (i == 1)
            System.out.println("\nTurno tarde \n\n");
        else
            System.out.println("\nTurno noche \n\n");
    }

    public static void asignar_valores_segun_tipo(int tipo, Double costo, Integer min_libres, Double cargo_extra) {
        switch (tipo) {
            case 'a':
                costo = 70D;
                min_libres = 300;
                cargo_extra = 0.09;
                break;
            case 'b':
                costo = 55D;
                min_libres = 200;
                cargo_extra = 0.15;
                break;
            case 'c':
                costo = 40D;
                min_libres = 100;
                cargo_extra = 0.21;
                break;
            case 'd':
                costo = 28D;
                min_libres = 60;
                cargo_extra = 0.29;
                break;
            case 'e':
                costo = 19D;
                min_libres = 40;
                cargo_extra = 0.37;
                break;
        }
    }

    public static int toMin(int t) {
        int horas = t / 100;
        int minutos = t % 100;
        return minutos + horas * 60;
    }
}
