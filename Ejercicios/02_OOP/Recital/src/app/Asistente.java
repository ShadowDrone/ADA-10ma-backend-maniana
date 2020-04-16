package app;

public class Asistente {
    public int id;
    public String nombre;
    public int dni;


    public void comprar(Ticket ticket) {
        //Aqui dentro va toda la logica de la compra del ticket por parte del asistente.
        ticket.espectador = this;
    }

    public void comprar(Bebida bebida) {
        //aca logica de comprar la bebida
    }

    public boolean devolver(Ticket ticket){
        //Logica si puedo devolver o no el ticket.
        //asumimos que podemos

        return true;
    }

    public void regalar(Ticket ticket, Asistente beneficiado){
        //Logica de regalo.
        ticket.espectador = beneficiado;
    }

    public void asistir() {

    }

    /**
     * Este metodo lo que hace es que el asistente presencie la banda
     * @param banda: es el objeto banda
     */
    public void ver(Banda banda) {

    }

}