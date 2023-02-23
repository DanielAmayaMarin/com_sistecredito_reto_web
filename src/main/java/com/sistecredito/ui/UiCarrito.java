package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;

public class UiCarrito {

    public static final Target SUBTOTAL = Target.the("sub total").locatedBy("//span[@class=\"fb-order-status__sub-totals__value notranslate undefined\"]");
    public static final Target CANTIDADTOTAL = Target.the("Label cantidad").locatedBy("//span[@class='count-number count notranslate']");
    public static final Target CANTIDADTOTAL2 = Target.the("Label cantidad ").locatedBy("//span[@data-testid='total-products-count']");

}
