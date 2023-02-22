package com.sistecredito.interactions;

import com.sistecredito.utils.ArrayProductos;
import com.sistecredito.utils.GenerarNumero;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static com.sistecredito.ui.UiPaginaFalabella.*;

public class AgregarAlCarrito implements Interaction {

    private int cantidad;

    public AgregarAlCarrito(int cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                VerificarPopUp.cerrar()
        );
        for (int i = 0; i < cantidad; i++) {
            WebElement elemento = ELEMENTOS.resolveFor(actor);
            List<WebElement> productElements = elemento.findElements(By.xpath(LBL_TITULO()));
            int producto = GenerarNumero.getRandomNumber(productElements.size());
            WebElement randomProduct = productElements.get(producto);
            actor.attemptsTo(
                    ScrollElement.to(LBL_NOMBRE_PRODUCTO(randomProduct.getText())),
                    WaitUntil.the(LBL_NOMBRE_PRODUCTO(randomProduct.getText()), WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                    Click.on(LBL_NOMBRE_PRODUCTO(randomProduct.getText()))
            );

            if (Text.of(VALIDAR_BOTON).answeredBy(actor).equals("AGREGAR A LA BOLSA")){
                actor.attemptsTo(
                        GuardarDatos.go(cantidad),
                        WaitUntil.the(BTN_AGREGAR_ALA_BOLSA, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
                        Click.on(BTN_AGREGAR_ALA_BOLSA),
                        SeleccionarCantidad.seleccionar(GenerarNumero.cantidadProductos())
                );
            }else {
                cantidad ++;
            }
            BrowseTheWeb.as(actor).getDriver().navigate().back();
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_BOLSA, WebElementStateMatchers.isClickable()).forNoMoreThan(7).seconds(),
            Click.on(BTN_BOLSA)
        );
    }

    public static AgregarAlCarrito seleccionar(int cantidad){
        return Instrumented.instanceOf(AgregarAlCarrito.class).withProperties(cantidad);
    }
}
