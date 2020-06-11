package ar.com.ada.api.hoteltresvagos.entities.reportes;

import java.math.BigDecimal;

import javax.persistence.Column;

/**
 * https://stackoverflow.com/questions/36328063/how-to-return-a-custom-object-from-a-spring-data-jpa-group-by-query
 */
public interface ReporteEstado {

    Integer getEstadoId();

    Integer getCantidadReservas();

    BigDecimal getTotalImporteReserva();

    BigDecimal getTotalImportePagado();

    BigDecimal getImporteTotal();

    String getDescripcion();

}