package ar.com.ada.abmhuesped.excepciones;

import ar.com.ada.abmhuesped.entities.*;

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
