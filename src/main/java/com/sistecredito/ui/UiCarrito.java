package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;

public class UiCarrito {

    public static final Target SUBTOTAL = Target.the("sub total").locatedBy("//span[@class=\"fb-order-status__sub-totals__value notranslate undefined\"]");
    public static final Target SUBTOTAL_DOS = Target.the("sub total").locatedBy("//span[@data-testid=\"total-amount-SUB_TOTAL\"]");
    public static final Target CANTIDADTOTAL = Target.the("Label cantidad").locatedBy("//span[@class='count-number count notranslate']");
    public static final Target CANTIDADTOTAL2 = Target.the("Label cantidad ").locatedBy("//span[@data-testid='total-products-count']");
    public static final String LABEL_TITULO (int id){
        return "(//span[@data-testid='name'])["+id+"]";
    }

    public static final String LABEL_TITULO_DOS (int id){
        return "(//h4[@class='fb-product__title']//child::a)["+id+"]";
    }

    public static final Target LABEL_TITULO_DOS_TARGET (int id){
        return Target.the("Laberl Titulo").locatedBy("(//h4[@class='fb-product__title']//child::a)["+id+"]");
    }

    public static final Target LABEL_TITULO_TARGET (int id){
        return Target.the("Laberl Titulo").locatedBy("(//span[@data-testid='name'])['"+id+"']");
    }

}
