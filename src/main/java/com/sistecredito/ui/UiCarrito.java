package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;

public class UiCarrito {

    public static final Target TITULO(String title){
        return Target.the("Titulo").locatedBy("//h4//child::a[text()='"+title+"']");
    }

    public static final Target CANTIDAD(int cantidad){
        return Target.the("Titulo").locatedBy("(//input[@id='quantityInput'])["+cantidad+"]");
    }

    public static final Target CANTIDADTOTAL = Target.the("Label cantidad").locatedBy("//span[@class='count-number count notranslate']");

    public static final Target CANTIDADTOTAL2 = Target.the("Label cantidad ").locatedBy("//span[@data-testid='total-products-count']");

}
