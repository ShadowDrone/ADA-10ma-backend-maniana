package ar.com.ada.api.hoteltresvagos.excepciones;

import ar.com.ada.api.hoteltresvagos.entities.*;

/**
 * HuespedInfoException
 */
public class HuespedInfoException extends Exception {

    private Huesped huesped;

    public HuespedInfoException(Huesped huesped, String mensaje) {

        super(huesped.getNombre() + ":" + mensaje);
        this.huesped = huesped;
    }
}
