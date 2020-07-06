package ar.com.ada.api.rrhh.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.rrhh.entities.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
    
    Empleado findByNombre (String nombre);
    Empleado findByDni (int id);

}