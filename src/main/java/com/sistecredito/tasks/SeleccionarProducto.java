package com.sistecredito.tasks;

import com.sistecredito.interactions.AgregarAlCarrito;
import com.sistecredito.interactions.Navegar;
import com.sistecredito.models.MenuModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarProducto implements Task {

    private MenuModel menuModel;
    private int cantidad;

    public SeleccionarProducto(MenuModel menuModel, int cantidad) {
        this.menuModel = menuModel;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Navegar.menu(menuModel),
                AgregarAlCarrito.seleccionar(cantidad)
        );
    }

    public static SeleccionarProducto seleccionar(MenuModel menuModel, int cantidad) {
        return Tasks.instrumented(SeleccionarProducto.class, menuModel, cantidad);
    }
}
