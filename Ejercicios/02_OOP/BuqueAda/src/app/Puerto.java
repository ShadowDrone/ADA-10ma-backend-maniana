package app;

public class Puerto {

    private int numero;
    private String nombre;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puerto(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    

}