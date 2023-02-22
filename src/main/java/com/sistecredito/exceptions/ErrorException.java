package com.sistecredito.exceptions;

public class ErrorException extends RuntimeException{
    public ErrorException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
