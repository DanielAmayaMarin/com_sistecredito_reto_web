package com.sistecredito.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class UiPaginaFalabella extends PageObject {
    public static Target CERRAR_POPUPS = Target.the("Boton cerrar").locatedBy("//button[@class='airship-btn airship-btn-deny']");
    public static Target IFRAME = Target.the("Iframe").located(By.id("__JSBridgeIframe_1.0__"));

    public static Target MENU_HAMBURGESA = Target.the("Boton hamburgesa").located(By.id("testId-HamburgerBtn-toggle"));
    public static Target ITEM_CATEGORIA(String menu){
     return Target.the("Iframe").locatedBy("//div[@class='TaxonomyDesktop-module_menuItem__vt-UM']//child::p[text()='"+menu+"']");
    }
    public static Target ITEM_SUBCATEGORIA(String equipo){
        return Target.the("Iframe").locatedBy("//ul[@id='testId-ThirdLevelMenu-link-container']//child::li//a[text()='"+equipo+"']");
    }

    public static Target ITEM_TODO(String menu){
        return Target.the("Iframe").locatedBy("//ul[@class='SecondLevelMenu-module_secondLevelMenu__dekstop__3s7_e' and li[@class='SecondLevelMenu-module_retail__3cFqC SecondLevelMenu-module_secondLevelMenu__title__19rtc' and *[text()='"+menu+"']]]//child::ul//child::li//child::a//b[contains(text(),'Ver todo')]//parent::a");
    }
    public static Target ELEMENTOS = Target.the("").locatedBy("//div[@class='jsx-4001457643 search-results-4-grid grid-pod']");
    public  static String LBL_TITULO(){
        return "//b[@class=\"jsx-1327784995 copy2 primary  jsx-2889528833 normal       pod-subTitle \"]";
    }
    public static final String LBL_NOMBRE_PRODUCTO(String text){
        return "//b[contains(text(),'"+text+"')]";

    }
    public static Target BTN_AGREGAR_ALA_BOLSA = Target.the("Boton agregar a la bolsa").locatedBy("//button[@id='add-to-cart-button']");
    public static Target BTN_INCREMENTAR = Target.the("Boton incrementar").located(By.id("testId-stepper-increment-btn"));

    public static Target BTN_SEGUIR_COMPRANDO = Target.the("Boton seguir comprando").locatedBy("//button[text()='Seguir comprando']");

    public static Target VALIDAR_BOTON = Target.the("").locatedBy("//button[@id='add-to-cart-button']");

    public static Target CERRAR_POPUP = Target.the("cerrar").locatedBy("//div[@class=\"dy-lb-close\"]");

    public static Target BTN_BOLSA = Target.the("Bolsa").located(By.id("testId-UserAction-basket"));

    public static Target BTN_NO = Target.the("Prueba").locatedBy("//button[@class=\"airship-btn airship-btn-deny\"]");
}
