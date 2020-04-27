package app;

import java.util.*;

public class LogisticaAdaM {

    public static Scanner Teclado = new Scanner(System.in);

    private List<Puerto> puertos = new ArrayList<>();

    public void cargarContenedores(Buque buqueAda) {

        int idContenedor;
        double peso;
        Puerto puerto;

        for (int i = 0; i < 6; i++) {

            System.out.println("Ingrese el id de contenedor " + (i + 1));

            idContenedor = Teclado.nextInt();

            System.out.println("Ingrese el peso del contenedor en Kgs");

            peso = Teclado.nextDouble();

            Contenedor contenedor = new Contenedor(idContenedor, peso);

            puerto = seleccionaPuerto();

            contenedor.setPuerto(puerto);

            buqueAda.agregarContenedor(contenedor);
        }

    }

    public Puerto seleccionaPuerto() {

        System.out.println("Ingrese el puerto de destino(1,2,3)");
        int nroPuerto;
        nroPuerto = Teclado.nextInt();

        Puerto puerto = buscarPuerto(nroPuerto);

        return puerto;

    }

    public void inicializarPuertos() {
        Puerto puerto = new Puerto(1, "Puerto Madero");

        this.puertos.add(puerto);

        puerto = new Puerto(2, "Puerto Madryn");

        this.puertos.add(puerto);

        puerto = new Puerto(3, "Puerto Deseado");

        this.puertos.add(puerto);
    }

    public List<Puerto> getPuertos() {
        return puertos;
    }

    public void setPuertos(List<Puerto> puertos) {
        this.puertos = puertos;
    }

    public Puerto buscarPuerto(int numero) {
        for (Puerto puerto : puertos) {
            if (puerto.getNumero() == numero)
                return puerto;
        }
        return null;
    }
}