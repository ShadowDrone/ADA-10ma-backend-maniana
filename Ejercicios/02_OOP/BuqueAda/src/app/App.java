package app;

public class App {

    /**
     * Un buque de carga traslada 100 contenedores a tres diferentes puertos del
     * país. Los puertos se identifican con los números 1, 2 y 3. De cada contenedor
     * que el buque traslade se registran los siguientes datos: - Identificación del
     * contenedor - Peso del contenedor en kg - Puerto de arribo(un valor de 1 a 3).
     * Se pide calcular e informar: 1) El peso total que el buque debe trasladar 2)
     * La identificación del contenedor de mayor peso 3) La cantidad de contenedores
     * que debe trasladar a cada puerto
     */
    public static void main(String[] args) throws Exception {

        LogisticaAdaM logistica = new LogisticaAdaM();

        logistica.inicializarPuertos();

        Buque buqueAda = new Buque();

        logistica.cargarContenedores(buqueAda);

        System.out.print("El peso total del buque es " + buqueAda.calcularPesoTotal());

        Contenedor contenedorM = buqueAda.buscarContenedorMaximo();

        System.out.println("El contenedor mas pesado es " + contenedorM.getIdContenedor() + " y su peso es "
                + contenedorM.getPeso());

        for (Puerto puerto : logistica.getPuertos()) {
            System.out.println("El puerto " + puerto.getNombre() + " van " + buqueAda.contarContenedores(puerto));
        }

    }
}