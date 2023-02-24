package com.sistecredito.interactions;

import com.sistecredito.exceptions.ModulosException;
import com.sistecredito.utils.ArrayProductos;
import com.sistecredito.utils.Constantes.Constantes;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static com.sistecredito.ui.UiProducto.*;

public class GuardarDatos implements Interaction {

    private int cantidad;

    public GuardarDatos(int cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            int cantidadProductos = 0;
            String titulo = H_TITULO.resolveFor(actor).getText();
            String precio = SPAN_PRECIO.resolveFor(actor).getText().replace("$", "").replace("(Precio final)", "").trim();
            if (cantidad == 0){
                cantidadProductos = 1;
            }else {
                cantidadProductos = cantidad;
            }
            ArrayProductos.setArrayProductos(titulo,cantidadProductos,precio);
        }catch (RuntimeException ex){
            throw new ModulosException(ModulosException.Error(Constantes.INTERACTION_GUARDARDATOS), ex);
        }

    }

    public static GuardarDatos go(int cantidad){
        return Instrumented.instanceOf(GuardarDatos.class).withProperties(cantidad);
    }
}
