import java.util.Scanner;

/**
 * Ejercicio31
 */
public class Ejercicio29 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int m, i, numero = 0, pasaporte = -1, asientos = 0, pasajeros = 0;
        double importe = 0, total = 0;
        String destino;
        System.out.println("Ingrese cantidad de vuelos: ");
        m = Entrada.nextInt();
        for (i = 1; i <= m; i++) {
            System.out.println("\nNumero de vuelo: ");
            numero = Entrada.nextInt();
            System.out.println("Destino: ");
            destino = Entrada.nextLine();
            System.out.println("Cantidad de asientos: ");
            asientos = Entrada.nextInt();
            while (pasaporte != 0) {
                System.out.println("\nNumero de pasaporte: ");
                pasaporte = Entrada.nextInt();
                if (pasaporte == 0)
                    break;
                System.out.println("Importe del pasaje en u$s: ");
                importe = Entrada.nextDouble();
                pasajeros++;
                total += importe;
            }
            System.out.println("\nNro. de vuelo: " + numero + ". Destino: " + destino + ".\n\n");
            System.out.println("Nro. de pasaporte Importe en u$s\n");
            System.out.println(pasaporte + " " + importe + "\n");
            System.out.println("\nTotal recaudado por el vuelo: u$s" + total + ".\n");
            System.out.println(
                    "Porcentaje de asientos libres del vuelo: " + (asientos - pasajeros) / asientos * 100 + "%.\n");
            System.out.println("Porcentaje de asientos ocupados del vuelo: " + pasajeros / asientos * 100 + "%.\n");
        }
        System.out.println("Total recaudado en el mes: u$s");
        System.out.println("Cantidad de veces seguidas que se dieron vuelos completos: ");
        System.out.println("El numero de vuelo que mas recaudo es: ");
    }
}
