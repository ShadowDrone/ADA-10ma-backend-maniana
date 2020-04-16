package app;


public class Ticket {

    //declaro el atributo id.
    //public es el accesor: significa que todos van a poder ver/modificar
    //despues tipo de dato
    //nombre del atributo
    public int id;

    public double precio;

    public String ubicacion;

    public Banda banda;

    public Asistente espectador;

    public boolean cancelarCompra() {
        //Aca metemos toda la logica de cancelacion de compra
        //devolviendo true o false
        
        return true;
    }
    public void imprimir() {
        System.out.println("Imprimiendo ticket " + this.id);
        System.out.println("Espectador: "+ this.espectador.nombre);
    }
}