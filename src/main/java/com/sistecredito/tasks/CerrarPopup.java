package com.sistecredito.tasks;

import com.sistecredito.interactions.CerrarPopUps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CerrarPopup implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    CerrarPopUps.enLaPantalla()
            );
    }

    public static CerrarPopup cerrar(){
        return Tasks.instrumented(CerrarPopup.class);
    }
}
