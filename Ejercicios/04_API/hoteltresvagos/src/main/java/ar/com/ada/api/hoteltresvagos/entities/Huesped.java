package ar.com.ada.api.hoteltresvagos.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

import org.hibernate.annotations.NaturalId;

import ar.com.ada.api.hoteltresvagos.excepciones.*;

@Entity
@Table(name = "huesped")
// Named query usando JPQL donde se hace SELECT sobre el Objeto Huesped. En este
// caso se usa un Like para traer aquellos que contengan ese nombre
// El parametro ?1 indica que al query se le pasara UN parametro.
// El campo nombre indica el nombre de la funcion que debe tener en el
// Repository
// Yo recomiendo usar los NamedQueries en el Repo para no llenarlo en el objecto
@NamedQuery(name = "Huesped.findAllByNombreContiene", query = "FROM Huesped WHERE nombre like CONCAT('%', ?1,'%')")
// Este es un caso de named query igual al anterior, solo con 2 parametros
@NamedQuery(name = "Huesped.findAllByNombreAndDNI", query = "SELECT h FROM Huesped h WHERE h.nombre = ?1 AND h.dni = ?2")
// Este caso es un query usando SQL Puro, los parametros van en formato ? y se
// deben pasar en orden a la funcion del repo(ver PersonaRepository)
@NamedNativeQuery(name = "Huesped.findAllByNombreConAndDNISQLNativo", query = "SELECT * FROM huesped WHERE nombre like CONCAT('%', ?,'%') AND dni = ?", resultClass = Huesped.class)
public class Huesped {
    @Id
    @Column(name = "huesped_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int huespedId;
    private String nombre;
    @NaturalId
    private int dni;
    private String domicilio;
    @Column(name = "domicilio_alternativo")
    private String domicilioAlternativo;

    @OneToMany(mappedBy = "huesped", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Reserva> reservas = new ArrayList<>();

    public Huesped(String nombre) {
        this.nombre = nombre;

    }

    public Huesped() {
    }

    public int getHuespedId() {
        return huespedId;
    }

    public void setHuespedId(int huespedId) {
        this.huespedId = huespedId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) throws HuespedDNIException {

        if (dni < 0) {
            // no se ejecuta nada mas despues del throw
            throw new HuespedDNIException(this, "ocurrio un error con el DNI");

        }
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Huesped [dni=" + dni + ", nombre=" + nombre + "]";
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilioAlternativo() {
        return domicilioAlternativo;
    }

    public void setDomicilioAlternativo(String domicilioAlternativo) {
        this.domicilioAlternativo = domicilioAlternativo;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

}