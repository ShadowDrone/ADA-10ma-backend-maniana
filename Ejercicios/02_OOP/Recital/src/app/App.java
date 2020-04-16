package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Ticket ticket2;// Aca se declara la variable ticket2 pero esta en NULO
        Ticket ticket1 = new Ticket();

        // accediento al atributo "id" del objeto ticket1
        ticket1.id = 2202002;
        ticket1.precio = 100;
        ticket1.ubicacion = "A3";

        ticket2 = new Ticket();

        ticket2.id = 2202003;
        ticket2.precio = 120;
        ticket2.ubicacion = "F6";

        Banda comanche = new Banda();
        comanche.nombre = "Comanche";
        comanche.cantidadIntegrantes = 6;

        Banda otraBanda;
        otraBanda = comanche;
        ticket1.banda = otraBanda;

        Banda otraBanda2 = new Banda();
        otraBanda2.nombre = "Los Palmeras";
        otraBanda2.cantidadIntegrantes = 10;

        otraBanda = otraBanda2;

        Asistente asistente = new Asistente();

        asistente.nombre = "Laura";
        asistente.dni = 40000000;
        asistente.id = 562;

        asistente.comprar(ticket1);
        asistente.comprar(ticket2);

        if (asistente.devolver(ticket2)) {
            System.out.println("Pude devolver el ticket " + ticket2.id);
        } else {
            System.out.println("Vamos a abogado");
        }

        Asistente tati = new Asistente();
        tati.nombre = "Tati";
        tati.id = 600;
        tati.dni = 200000000;

        asistente.regalar(ticket1, tati);

        asistente.asistir();
        asistente.ver(comanche);

        CocaCola coke1 = new CocaCola();
        coke1.nombre = "Coca Comun";
        coke1.precio = 200;

        CocaCola coke2 = new CocaCola();
        coke2.nombre = "Coca Zero";
        coke2.precio = 210;

        int lala;
        lala = Teclado.nextInt();

    }
}