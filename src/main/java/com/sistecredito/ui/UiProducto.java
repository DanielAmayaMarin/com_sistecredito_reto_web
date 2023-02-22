package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;

public class UiProducto {

    public static final Target H_TITULO = Target.the("H1 Titulo").locatedBy("//h1//child::div");

    public static final Target SPAN_PRECIO = Target.the("span precio ").locatedBy("//div[@data-variant='PDP_MAIN']//child::span");

}
