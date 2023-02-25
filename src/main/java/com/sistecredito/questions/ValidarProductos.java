package com.sistecredito.questions;

import com.sistecredito.interactions.ScrollElement;
import com.sistecredito.utils.ArrayProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sistecredito.ui.UiCarrito.*;

public class ValidarProductos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String cantidadTotal = CANTIDADTOTAL.resolveFor(actor).isVisible() ? CANTIDADTOTAL.resolveFor(actor).getText().replace(" ( ", "").replace(" productos)", "").replace("(", "").trim() : CANTIDADTOTAL2.resolveFor(actor).getText().replace(" ( ", "").replace(" productos)", "").replace("(", "").trim();
        boolean resultado = false;
        if(cantidadTotal.equals(ArrayProductos.getSumatoria())){
            for (int i = 0; i < ArrayProductos.getCantidad(); i++) {
                actor.attemptsTo(
                        ScrollElement.to(LABEL_TITULO(i+1))
                );
                System.out.println(LABEL_TITULO_TARGET(i+1).resolveFor(actor).isVisible());
                if (LABEL_TITULO_TARGET(i).resolveFor(actor).isVisible()){
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
