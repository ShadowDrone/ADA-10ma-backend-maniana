package app;

public class Websodio extends Episodio {

    public Websodio(int numero, String nombre, int duracion, String url) {

        super(numero, nombre, duracion);

        this.url = url;
    }

    public String url;

    @Override /// Anotacion que indica que el metodo se sobre - escribe(redefinicion)
    public void reproducir() {
        System.out.println("Reproduciendo websodio " + this.getNumero() + " " + this.getNombre() + " url: " + this.url);
    }

    /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }
}