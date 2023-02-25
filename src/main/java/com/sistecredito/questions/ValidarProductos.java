package com.sistecredito.questions;

import com.sistecredito.interactions.ScrollElement;
import com.sistecredito.utils.ArrayProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sistecredito.ui.UiCarrito.*;
import static com.sistecredito.ui.UiPaginaFalabella.MENU_HAMBURGESA;
import static com.sistecredito.ui.UiProducto.BTN_SEGUIR_COMPRANDO;

public class ValidarProductos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String cantidadTotal = CANTIDADTOTAL.resolveFor(actor).isVisible() ? CANTIDADTOTAL.resolveFor(actor).getText().replace(" ( ", "").replace(" productos)", "").replace("(", "").trim() : CANTIDADTOTAL2.resolveFor(actor).getText().replace(" ( ", "").replace(" productos)", "").replace("(", "").trim();
        boolean resultado = false;
        if(cantidadTotal.equals(ArrayProductos.getSumatoria())){
            for (int i = 0; i < ArrayProductos.getCantidad(); i++) {
                if (LABEL_TITULO_TARGET(i+1).resolveFor(actor).isVisible()){
                    actor.attemptsTo(
                            ScrollElement.to(LABEL_TITULO(i+1))
                    );
                    resultado = true;
                } else if (LABEL_TITULO_DOS_TARGET(i+1).resolveFor(actor).isVisible()) {
                    actor.attemptsTo(
                            ScrollElement.to(LABEL_TITULO_DOS(i+1))
                    );
                    resultado = true;
                }
            }
        }
        return cantidadTotal.equals(ArrayProductos.getSumatoria()) && resultado;
    }

    public static ValidarProductos enElCarrito() {
        return new ValidarProductos();
    }
}
