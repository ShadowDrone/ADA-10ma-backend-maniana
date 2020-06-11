package ar.com.ada.api.hoteltresvagos.excepciones;

import ar.com.ada.api.hoteltresvagos.entities.*;

/**
 * HuespedEdadException
 */
public class HuespedEdadException extends HuespedInfoException {

    public HuespedEdadException(Huesped huesped, String mensaje) {
        super(huesped, mensaje);
    }

}