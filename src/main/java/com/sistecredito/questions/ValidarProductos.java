package com.sistecredito.questions;

import com.sistecredito.utils.ArrayProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.sistecredito.ui.UiCarrito.*;

public class ValidarProductos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String charsToRemove = " ( ( productos)";
        String cantidadTotal = Text.of(CANTIDADTOTAL).answeredBy(actor) != "" ? Text.of(CANTIDADTOTAL).answeredBy(actor) : Text.of(CANTIDADTOTAL2).answeredBy(actor);
        for (char c : charsToRemove.toCharArray()) {
            cantidadTotal = cantidadTotal.replace(String.valueOf(c), "");
        }
        return cantidadTotal.equals(ArrayProductos.getSumatoria());
    }

    public static ValidarProductos enElCarrito(){
        return new ValidarProductos();
    }
}
