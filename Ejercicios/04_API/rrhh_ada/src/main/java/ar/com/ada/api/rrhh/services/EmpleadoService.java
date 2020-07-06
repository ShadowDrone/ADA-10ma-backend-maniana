package ar.com.ada.api.rrhh.services;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import ar.com.ada.api.rrhh.entities.Empleado;
import ar.com.ada.api.rrhh.entities.Empleado.EmpleadoEstadoEnum;
import ar.com.ada.api.rrhh.excepciones.EmpleadoException;
import ar.com.ada.api.rrhh.repos.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void grabar(Empleado e) throws EmpleadoException {
        EmpleadoValidationType r = this.verificarEmpleado(e);

        if (r != EmpleadoValidationType.EMPLEADO_OK)
            throw new EmpleadoException(r);

        empleadoRepository.save(e);

    }

    public void crearEmpleado(Empleado empleado) throws EmpleadoException {
        this.grabar(empleado);
    }

    public List<Empleado> listarEmpleados() {

        return empleadoRepository.findAll();

    }

    public Empleado traerEmpleadoPorId(int empleadoId) {

        Optional<Empleado> eo = empleadoRepository.findById(empleadoId);

        if (eo.isPresent()) {
            return eo.get();
        }
        return null;

    }

    public void actualizarSueldoEmpleado(Empleado empleadoOriginal, BigDecimal sueldo) {

        empleadoOriginal.setSueldo(sueldo);

        empleadoRepository.save(empleadoOriginal);

    }

    public void actualizarEstado(Empleado empleado, EmpleadoEstadoEnum estadoId) {

        empleado.setEstadoId(estadoId);

        empleadoRepository.save(empleado);
    }

    public void borrarEmpleado(Empleado empleado) {

        this.actualizarEstado(empleado, EmpleadoEstadoEnum.DESVINCULADO);

    }

    public enum EmpleadoValidationType {

        EMPLEADO_OK, 
        EMPLEADO_DUPLICADO, 
        EMPLEADO_INVALIDO, 
        SUELDO_NULO, 
        EDAD_INVALIDA, 
        NOMBRE_INVALIDO,
        EMPLEADO_DATOS_INVALIDOS

    }

    /**
     * Verifica que el nombre no esté nulo, La edad sea mayor a 0, El sueldo sea
     * mayor a 0, El estado, la fecha de alta y baja no estén en nulo.
     * 
     * @param empleado
     * @return
     */

    public EmpleadoValidationType verificarEmpleado(Empleado empleado) {

        if (empleado.getNombre() == null)
            return EmpleadoValidationType.NOMBRE_INVALIDO;

        if (empleado.getEdad() <= 0)
            return EmpleadoValidationType.EDAD_INVALIDA;

        if (empleado.getSueldo().compareTo(new BigDecimal(0)) <= 0)
            return EmpleadoValidationType.SUELDO_NULO;
        if (empleado.getEstadoId() == EmpleadoEstadoEnum.DESCONOCIDO)
            return EmpleadoValidationType.EMPLEADO_DATOS_INVALIDOS;
        if (empleado.getFechaAlta() == null)
            return EmpleadoValidationType.EMPLEADO_DATOS_INVALIDOS;
        if (empleado.getDni() <= 0)
            return EmpleadoValidationType.EMPLEADO_INVALIDO;

        Empleado e = empleadoRepository.findByDni(empleado.getDni());
        if (e != null) {
            if (empleado.getEmpleadoId() != 0) {
                if ((empleado.getEmpleadoId() != e.getEmpleadoId())) {
                    return EmpleadoValidationType.EMPLEADO_DUPLICADO;
                } else {
                    return EmpleadoValidationType.EMPLEADO_OK;
                }
            } else
                return EmpleadoValidationType.EMPLEADO_DUPLICADO;

        }
        return EmpleadoValidationType.EMPLEADO_OK;
    }
}