package com.sistecredito.tasks;

import com.sistecredito.ui.UiPaginaFalabella;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private UiPaginaFalabella uiPaginaFalabella;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(uiPaginaFalabella)
        );
    }

    public static AbrirPagina urlWeb() {
        return Tasks.instrumented(AbrirPagina.class);
    }
}
