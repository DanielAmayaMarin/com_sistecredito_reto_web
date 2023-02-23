package com.sistecredito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static com.sistecredito.ui.UiPaginaFalabella.CERRAR_POPUP;

public class VerificarPopUp implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        do {
            if (CERRAR_POPUP.resolveFor(actor).isVisible()) {
                actor.attemptsTo(
                        Click.on(CERRAR_POPUP)
                );
                break;
            }
        } while (CERRAR_POPUP.resolveFor(actor).isVisible());
    }

    public static VerificarPopUp cerrar() {
        return Instrumented.instanceOf(VerificarPopUp.class).withProperties();
    }
}
