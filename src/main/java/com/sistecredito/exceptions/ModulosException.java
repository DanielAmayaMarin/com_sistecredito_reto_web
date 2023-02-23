package com.sistecredito.exceptions;

public class ModulosException extends AssertionError{

    public static final String ERROR_AL_INTENTAR_CERRAR_EL_POPUP = "No se pudo interactuar con el PopUp";
    public static final String ERROR_AL_INTENTAR_SELECCIONAR_LOS_PRODUCTOS = "No se pudo seleccionar los productos";
    public static final String ERROR = "Error validando los datos del carrito";
    public static final String ERROR_SUB_TOTAL = "Error validando el subtotal";
    public ModulosException(String message, Throwable cause){
        super(message, cause);
    }
    public ModulosException(String message){
        super(message);
    }


}
