package com.sistecredito.questions;

import static com.sistecredito.ui.UiCarrito.SUBTOTAL;
import static com.sistecredito.ui.UiCarrito.SUBTOTAL_DOS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarSubtotal implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return SUBTOTAL.resolveFor(actor).isVisible() ? SUBTOTAL.resolveFor(actor).isVisible() : SUBTOTAL_DOS.resolveFor(actor).isVisible();
    }

    public static ValidarSubtotal enElCarrito(){
        return new ValidarSubtotal();
    }
}
