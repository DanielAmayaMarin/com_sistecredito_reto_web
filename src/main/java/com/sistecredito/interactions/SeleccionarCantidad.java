package com.sistecredito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sistecredito.ui.UiPaginaFalabella.BTN_INCREMENTAR;
import static com.sistecredito.ui.UiPaginaFalabella.BTN_SEGUIR_COMPRANDO;

public class SeleccionarCantidad implements Interaction {

    private int cantidad;

    public SeleccionarCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int j = 0; j < cantidad; j++) {
            actor.attemptsTo(
                    WaitUntil.the(BTN_INCREMENTAR, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                    Click.on(BTN_INCREMENTAR)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_SEGUIR_COMPRANDO, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                Click.on(BTN_SEGUIR_COMPRANDO)
        );
    }


    public static SeleccionarCantidad seleccionar(int cantidad){
        return Instrumented.instanceOf(SeleccionarCantidad.class).withProperties(cantidad);
    }
}
