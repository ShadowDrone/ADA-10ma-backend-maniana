package ar.com.ada.api.rrhh.entities.calculos;


import java.math.BigDecimal;

import ar.com.ada.api.rrhh.entities.Empleado;

/**
 * ueldoCalculator
 * Interface Strategy para calculo de sueldo
 */
public interface SueldoCalculator {

    BigDecimal calcularSueldo(Empleado empleado);


}