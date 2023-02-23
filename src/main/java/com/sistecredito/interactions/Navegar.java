package com.sistecredito.interactions;

import com.sistecredito.models.MenuModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sistecredito.ui.UiPaginaFalabella.*;

public class Navegar implements Interaction {

    private MenuModel menuModel;

    public Navegar(MenuModel menuModel) {
        this.menuModel = menuModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENU_HAMBURGESA, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(MENU_HAMBURGESA),
                WaitUntil.the(ITEM_CATEGORIA(menuModel.getCategoria()), WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(ITEM_CATEGORIA(menuModel.getCategoria())),
                Check.whether(menuModel.getEquipo().equals("Ver todo"))
                        .andIfSo(
                                WaitUntil.the(ITEM_TODO(menuModel.getSubcategoria()), WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                                Click.on(ITEM_TODO(menuModel.getSubcategoria()))
                        ).otherwise(
                                WaitUntil.the(ITEM_SUBCATEGORIA(menuModel.getEquipo()), WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                                Click.on(ITEM_SUBCATEGORIA(menuModel.getEquipo()))
                        )
        );
    }

    public static Navegar menu(MenuModel menuModel) {
        return Instrumented.instanceOf(Navegar.class).withProperties(menuModel);
    }
}
