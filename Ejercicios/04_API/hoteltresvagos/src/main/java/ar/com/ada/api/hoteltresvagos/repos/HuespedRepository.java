package ar.com.ada.api.hoteltresvagos.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;
import ar.com.ada.api.hoteltresvagos.entities.*;

@Repository
public interface HuespedRepository extends JpaRepository<Huesped, Integer> {
    Huesped findByNombre(String nombreHuesped);

    Huesped findByDni(Integer dni);

    // Este caso aplica al named query creado en el objeto huesped, fijarse que el
    // nombre del named query coincide con el nombre de este metodo
    // y ademas posee un parametro
    List<Huesped> findAllByNombreContiene(String nombre);

    // Igual al caso anterior pero con 2 parametros.
    List<Huesped> findAllByNombreAndDNI(String nombre, Integer dni);

    // Este caso es diferente y es el que recomiendo, se pone el @Query arriba del
    // metodo que queremos "crear" por interface
    // En este caso hace un select sobre las huespedes ordenada por nombre
    // recordar que esta sintaxis es JPQL
    @Query("select h from Huesped h order by nombre")
    List<Huesped> findAllOrderByNombre();

    // Mismo caso anterior, salvo que en este se le pone "nombre" al paremtro. En
    // nuestro caso el nombre del parametro es ":dni"
    @Query("SELECT h FROM Huesped h WHERE h.dni = :dni")
    List<Huesped> findByDNIVersion2(@Param("dni") Integer descripcion);
}
