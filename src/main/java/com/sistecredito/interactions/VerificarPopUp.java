package com.sistecredito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sistecredito.ui.UiPaginaFalabella.CERRAR_POPUP;

public class VerificarPopUp implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CERRAR_POPUP, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds());
        do {
            if (CERRAR_POPUP.resolveFor(actor).isClickable()) {
                actor.attemptsTo(
                        Click.on(CERRAR_POPUP)
                );
                break;
            }
        } while (!CERRAR_POPUP.resolveFor(actor).isClickable());
    }

    public static VerificarPopUp cerrar(){
        return Instrumented.instanceOf(VerificarPopUp.class).withProperties();
    }
}
