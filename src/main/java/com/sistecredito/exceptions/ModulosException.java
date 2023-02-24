package com.sistecredito.exceptions;

public class ModulosException extends AssertionError{

    public static final String ERROR = "Error validando los datos del carrito";
    public static final String ERROR_SUB_TOTAL = "Error validando el subtotal";
    public static String Error(String donde) {
        return ERROR + donde;
    }
    public ModulosException(String message, Throwable cause){
        super(message, cause);
    }
    public ModulosException(String message){
        super(message);
    }




}
