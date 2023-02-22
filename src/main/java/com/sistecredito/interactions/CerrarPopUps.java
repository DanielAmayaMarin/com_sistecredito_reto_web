package com.sistecredito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.*;

import static com.sistecredito.ui.UiPopUps.*;

public class CerrarPopUps implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
       WebDriver driver = BrowseTheWeb.as(actor).getDriver();
       WebElement root = driver.findElement(By.cssSelector(CONTENEDOR_PADRE()));
       SearchContext shadowRootTwo = root.getShadowRoot();
       WebElement nestedText = shadowRootTwo.findElement(By.cssSelector(BOTON_NO()));
       nestedText.click();
    }

    public static CerrarPopUps enLaPantalla(){
        return Instrumented.instanceOf(CerrarPopUps.class).withProperties();
    }
}
