package app;

public class Websodio extends Episodio {

    public String url;

    @Override ///Anotacion que indica que el metodo se sobre - escribe(redefinicion)
    public void reproducir() {
        System.out.println("Reproduciendo websodio " + this.numero + " " +
         this.nombre + " url: "+ this.url);
    }
}