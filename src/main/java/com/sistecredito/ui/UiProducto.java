package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;

public class UiProducto {

    public static final Target H_TITULO = Target.the("H1 Titulo").locatedBy("//h1//child::div");

    public static final Target SPAN_PRECIODOS = Target.the("span precio ").locatedBy("//div[@data-variant='PDP_MAIN']//child::span");

    public static final Target SPAN_PRECIOUNO = Target.the("span precio ").locatedBy("//li[@class='jsx-2797633547 prices-1']//div[@data-variant='PDP_MAIN']//child::span");


}
