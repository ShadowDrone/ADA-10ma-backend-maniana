package ar.com.ada.api.hoteltresvagos.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.hoteltresvagos.entities.*;
import ar.com.ada.api.hoteltresvagos.entities.reportes.*;

@Repository
public interface ReservarRepository extends JpaRepository<Reserva, Integer> {

    // En este caso se hace un JPQL por el nombre del cliente
    @Query("FROM Huesped WHERE nombre like CONCAT('%', :nombre,'%')")
    List<Reserva> findByNombreHuesped(@Param("nombre") String nombre);

    @Query(value = "SELECT r.estado_id estadoId, e.descripcion, count(r.reserva_id) cantidadReservas, sum(r.importe_reserva) totalImporteReserva, sum(r.importe_pagado) totalImportePagado, sum(r.importe_total) importeTotal FROM reserva r INNER JOIN tipo_estado_reserva e ON r.estado_id = e.estado_id GROUP BY e.estado_id, e.descripcion", nativeQuery = true)
    List<ReporteEstado> getReporteReservasPorEstado();

    @Query(value = "select h.huesped_id huespedId, h.nombre, sum(r.importe_reserva) importeReserva, sum(r.importe_pagado) importePagado, sum(r.importe_total) importeTotal from huesped h inner join reserva r on h.huesped_id = r.huesped_id group by h.huesped_id, h.nombre", nativeQuery = true)
    List<ReportePorHuesped> getReporteReservasPorHuespedes();
}
