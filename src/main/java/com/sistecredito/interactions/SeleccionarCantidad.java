package com.sistecredito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.sistecredito.ui.UiPaginaFalabella.BTN_INCREMENTAR;
import static com.sistecredito.ui.UiPaginaFalabella.BTN_SEGUIR_COMPRANDO;

public class SeleccionarCantidad implements Interaction {

    private int cantidad;

    public SeleccionarCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        if (cantidad != 0){
            if (cantidad != 1){
                for (int j = 1; j < cantidad; j++) {
                    actor.attemptsTo(
                            WaitUntil.the(BTN_INCREMENTAR, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_INCREMENTAR)
                    );
                    Boolean existeElemento = driver.findElements(By.xpath("(//span[@class=\"copy5 primary  jsx-2889528833 normal      \"])[2]")).size() != 0;
                    if (existeElemento != false){
                        break;
                    }
                }
            }
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_SEGUIR_COMPRANDO, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                Click.on(BTN_SEGUIR_COMPRANDO)
        );
    }


    public static SeleccionarCantidad seleccionar(int cantidad){
        return Instrumented.instanceOf(SeleccionarCantidad.class).withProperties(cantidad);
    }
}
