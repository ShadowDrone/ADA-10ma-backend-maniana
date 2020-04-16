package app;

public class Deportista extends Persona {
    
    //Atributos de Instancia
    public double altura;
    public double peso;
    public int medallas;
    public String deporte;
    public int nroDeportivo;
    
    public void participar(Olimpiada olimpiada){
        olimpiada.inscribir(this);
    }
    //Metodos de Instancia
    public void entrenar() {
        System.out.println("Hola estoy entrenando.");
    }


}