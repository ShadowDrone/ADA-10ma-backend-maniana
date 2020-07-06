package ar.com.ada.api.rrhh.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.rrhh.entities.Empleado;
import ar.com.ada.api.rrhh.entities.Empleado.EmpleadoEstadoEnum;
import ar.com.ada.api.rrhh.excepciones.EmpleadoException;
import ar.com.ada.api.rrhh.models.requests.InfoBasicaEmpleadoRequest;
import ar.com.ada.api.rrhh.models.requests.SueldoInfoRequest;
import ar.com.ada.api.rrhh.models.responses.GenericResponse;
import ar.com.ada.api.rrhh.services.CategoriaService;
import ar.com.ada.api.rrhh.services.EmpleadoService;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;
    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/empleados") // Se pide info basica a Front
    public ResponseEntity<?> crearEmpleado(@RequestBody InfoBasicaEmpleadoRequest info) {
        Empleado empleado = new Empleado();
        GenericResponse resp = new GenericResponse();
        try {

            empleado.setNombre(info.nombre);
            empleado.setEdad(info.edad);
            empleado.setSueldo(info.sueldo);
            empleado.setDni(info.dni);
            empleado.setFechaAlta(new Date());
            empleado.setEstadoId(EmpleadoEstadoEnum.ACTIVO);
            empleado.setCategoria(categoriaService.buscarCategoriaPorId(info.categoriaId));
            empleadoService.crearEmpleado(empleado);
        } catch (EmpleadoException empEx) {

            resp.isOk = false;
            resp.message = "Error " + empEx.getErrorType();

            return ResponseEntity.badRequest().body(resp);
        }

        resp.isOk = true;
        resp.id = empleado.getEmpleadoId();
        resp.message = "Empleado generado con éxito";

        return ResponseEntity.ok(resp);
    }

    @GetMapping("/empleados")
    public ResponseEntity<?> listarEmpleados() {

        return ResponseEntity.ok(empleadoService.listarEmpleados());

    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<?> buscarEmpleadoPorId(@PathVariable int id) {
        Empleado empleado = empleadoService.traerEmpleadoPorId(id);

        if (empleado != null) {
            return ResponseEntity.ok(empleado);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        // return ResponseEntity.notFound().build();
    }

    @PutMapping("/empleados/{id}/sueldos")
    public ResponseEntity<?> actualizarSueldoEmpleado(@PathVariable int id, @RequestBody SueldoInfoRequest infoNueva) {

        Empleado empleadoOriginal = empleadoService.traerEmpleadoPorId(id);

        if (empleadoOriginal != null) {

            empleadoService.actualizarSueldoEmpleado(empleadoOriginal, infoNueva.sueldoNuevo);

            GenericResponse resp = new GenericResponse();
            resp.isOk = true;
            resp.id = empleadoOriginal.getEmpleadoId();
            resp.message = "Se ha actualizado con exito";

            return ResponseEntity.ok(resp);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<?> borrarEmpleado(@PathVariable int id) {

        Empleado empleado = empleadoService.traerEmpleadoPorId(id);

        if (empleado != null) {

            empleadoService.borrarEmpleado(empleado);

            GenericResponse resp = new GenericResponse();
            resp.isOk = true;
            resp.id = empleado.getEmpleadoId();
            resp.message = "Fue eliminado con exito";

            return ResponseEntity.ok(resp);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
