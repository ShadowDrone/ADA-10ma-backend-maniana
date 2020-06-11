package ar.com.ada.api.hoteltresvagos.services;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.hoteltresvagos.entities.*;
import ar.com.ada.api.hoteltresvagos.repos.*;
import ar.com.ada.api.hoteltresvagos.entities.reportes.*;

@Service
public class ReporteService {

    @Autowired
    ReservarRepository reporteRepo;

    public List<ReporteEstado> getReporteReservasPorEstado() {

        return reporteRepo.getReporteReservasPorEstado();
    }

    public List<ReportePorHuesped> getReporteReservasPorHuespedes() {

        return reporteRepo.getReporteReservasPorHuespedes();
    }

}