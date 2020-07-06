package ar.com.ada.api.rrhh.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.rrhh.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer>{ 
    
    
}