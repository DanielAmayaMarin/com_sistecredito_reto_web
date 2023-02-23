package com.sistecredito.questions;

import com.sistecredito.utils.ArrayProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sistecredito.ui.UiCarrito.*;

public class ValidarProductos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String cantidadTotal = CANTIDADTOTAL.resolveFor(actor).isVisible() ? CANTIDADTOTAL.resolveFor(actor).getText().replace(" ( ", "").replace(" productos)", "").replace("(", "").trim() : CANTIDADTOTAL2.resolveFor(actor).getText().replace(" ( ", "").replace(" productos)", "").replace("(", "").trim();
        return cantidadTotal.equals(ArrayProductos.getSumatoria());
    }

    public static ValidarProductos enElCarrito() {
        return new ValidarProductos();
    }
}
