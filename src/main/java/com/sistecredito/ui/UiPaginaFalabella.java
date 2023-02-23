package com.sistecredito.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class UiPaginaFalabella extends PageObject {
    public static Target MENU_HAMBURGESA = Target.the("Boton hamburgesa").located(By.id("testId-HamburgerBtn-toggle"));

    public static Target ITEM_CATEGORIA(String menu) {
        return Target.the("Item categoria").locatedBy("//div[@class='TaxonomyDesktop-module_menuItem__vt-UM']//child::p[text()='" + menu + "']");
    }

    public static Target ITEM_SUBCATEGORIA(String equipo) {
        return Target.the("Item subcategoria").locatedBy("//ul[@id='testId-ThirdLevelMenu-link-container']//child::li//a[text()='" + equipo + "']");
    }

    public static Target ITEM_TODO(String menu) {
        return Target.the("Item ver todo").locatedBy("//ul[@class='SecondLevelMenu-module_secondLevelMenu__dekstop__3s7_e' and li[@class='SecondLevelMenu-module_retail__3cFqC SecondLevelMenu-module_secondLevelMenu__title__19rtc' and *[text()='" + menu + "']]]//child::ul//child::li//child::a//b[contains(text(),'Ver todo')]//parent::a");
    }

    public static Target ELEMENTOS = Target.the("Caja principal de cada producto").locatedBy("//div[@class='jsx-4001457643 search-results-4-grid grid-pod']");

    public static String LBL_TITULO() {
        return "//b[@class=\"jsx-1327784995 copy2 primary  jsx-2889528833 normal       pod-subTitle \"]";
    }

    public static final String LBL_NOMBRE_PRODUCTO(String text) {
        return "//b[contains(text(),'" + text + "')]";

    }

    public static Target CERRAR_POPUP = Target.the("cerrar").locatedBy("//div[@class=\"dy-lb-close\"]");

    public static Target BTN_BOLSA = Target.the("Bolsa").located(By.id("testId-UserAction-basket"));

}
