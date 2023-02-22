package com.sistecredito.interactions;

import com.sistecredito.utils.ArrayProductos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;

import static com.sistecredito.ui.UiProducto.H_TITULO;
import static com.sistecredito.ui.UiProducto.SPAN_PRECIO;


public class GuardarDatos implements Interaction {

    private int cantidad;

    public GuardarDatos(int cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String titulo = Text.of(H_TITULO).answeredBy(actor);
        String precio = Text.of(SPAN_PRECIO).answeredBy(actor);
        ArrayProductos.setArrayProductos(titulo,cantidad,precio);
    }

    public static GuardarDatos go(int cantidad){
        return Instrumented.instanceOf(GuardarDatos.class).withProperties(cantidad);
    }
}
