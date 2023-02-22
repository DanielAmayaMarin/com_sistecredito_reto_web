package com.sistecredito.tasks;

import com.sistecredito.exceptions.ModulosException;
import com.sistecredito.interactions.CerrarPopUps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CerrarPopup implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    CerrarPopUps.enLaPantalla()
            );
        }catch (RuntimeException ex){
            throw new ModulosException(ModulosException.ERROR_AL_INTENTAR_CERRAR_EL_POPUP, ex);
        }

    }

    public static CerrarPopup cerrar(){
        return Tasks.instrumented(CerrarPopup.class);
    }
}
