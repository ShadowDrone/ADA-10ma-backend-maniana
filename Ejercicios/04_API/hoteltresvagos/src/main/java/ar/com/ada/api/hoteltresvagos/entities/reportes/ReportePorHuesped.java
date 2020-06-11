package ar.com.ada.api.hoteltresvagos.entities.reportes;

public interface ReportePorHuesped {

    public Integer getHuespedId();

    public String getNombre();

    public Double getImporteReserva();

    public Double getImportePagado();

    public Double getImporteTotal();

}