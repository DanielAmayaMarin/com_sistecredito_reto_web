package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;

public class UiCarrito {

    public static final Target TITULO(String title){
        return Target.the("Titulo").locatedBy("//h4//child::a[text()='"+title+"']");
    }

    public static final Target CANTIDAD(int cantidad){
        return Target.the("Titulo").locatedBy("(//input[@id='quantityInput'])["+cantidad+"]");
    }



}
