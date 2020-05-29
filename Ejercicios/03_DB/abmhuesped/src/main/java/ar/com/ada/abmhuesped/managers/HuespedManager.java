package ar.com.ada.abmhuesped.managers;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import ar.com.ada.abmhuesped.entities.*;

public class HuespedManager {

    protected SessionFactory sessionFactory;

    public void setup() {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
                                                                                                  // from
                                                                                                  // hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw ex;
        }

    }

    public void exit() {
        sessionFactory.close();
    }

    public void create(Huesped huesped) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(huesped);

        session.getTransaction().commit();
        session.close();
    }

    public Huesped read(int huespedId) {
        Session session = sessionFactory.openSession();

        Huesped huesped = session.get(Huesped.class, huespedId);

        session.close();

        return huesped;
    }

    public Huesped readByDNI(int dni) {
        Session session = sessionFactory.openSession();

        Huesped huesped = session.byNaturalId(Huesped.class).using("dni", dni).load();

        session.close();

        return huesped;
    }

    public void update(Huesped huesped) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(huesped);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(Huesped huesped) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(huesped);

        session.getTransaction().commit();
        session.close();
    }

    /**
     * Este metodo en la vida real no debe existir ya qeu puede haber miles de
     * usuarios
     * 
     * @return
     */
    public List<Huesped> buscarTodos() {

        Session session = sessionFactory.openSession();

        /// NUNCA HARCODEAR SQLs nativos en la aplicacion.
        // ESTO es solo para nivel educativo
        Query query = session.createNativeQuery("SELECT * FROM huesped", Huesped.class);
        //query = session.createQuery("From Obse")
        List<Huesped> todos = query.getResultList();

        return todos;

    }

    /**
     * Busca una lista de huespedes por el nombre completo Esta armado para que se
     * pueda generar un SQL Injection y mostrar commo NO debe programarse.
     * 
     * @param nombre
     * @return
     */
    public List<Huesped> buscarPor(String nombre) {

        Session session = sessionFactory.openSession();

        // SQL Injection vulnerability exposed.
        // Deberia traer solo aquella del nombre y con esto demostrarmos que trae todas
        // si pasamos
        // como nombre: "' or '1'='1"
        Query query = session.createNativeQuery("SELECT * FROM huesped where nombre = '" + nombre + "'", Huesped.class);

        List<Huesped> huespedes = query.getResultList();

        return huespedes;

    }

}