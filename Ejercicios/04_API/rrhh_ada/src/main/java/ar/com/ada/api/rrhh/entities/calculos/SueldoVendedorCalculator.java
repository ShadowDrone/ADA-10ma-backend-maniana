package ar.com.ada.api.rrhh.entities.calculos;


import java.math.BigDecimal;
import java.math.RoundingMode;

import ar.com.ada.api.rrhh.entities.Empleado;

/**
 * SueldoVendedorCalculator
 * En este cao es siempre el sueldo base de la categoria
 * más el 10% de ventas.
 */
public class SueldoVendedorCalculator implements SueldoCalculator {

    @Override
    public BigDecimal calcularSueldo(Empleado empleado) {
        return empleado.getCategoria().getSueldoBase().add(empleado.getVentasActuales().multiply(new BigDecimal(0.10))).setScale(2, RoundingMode.HALF_EVEN);
    }

    
}