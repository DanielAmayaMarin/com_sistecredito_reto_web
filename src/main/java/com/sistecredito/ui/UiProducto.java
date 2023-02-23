package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiProducto {

    public static final Target H_TITULO = Target.the("H1 Titulo").locatedBy("//h1//child::div");
    public static final Target SPAN_PRECIO = Target.the("span precio ").locatedBy("(//div[@data-variant='PDP_MAIN']//child::span)[1]");
    public static final Target VALIDAR_BOTON = Target.the("").locatedBy("//button[@id='add-to-cart-button']");

    public static final Target BTN_AGREGAR_ALA_BOLSA = Target.the("Boton agregar a la bolsa").locatedBy("//button[@id='add-to-cart-button']");
    public static final Target BTN_INCREMENTAR = Target.the("Boton incrementar").located(By.id("testId-stepper-increment-btn"));
    public static final Target BTN_SEGUIR_COMPRANDO = Target.the("Boton seguir comprando").locatedBy("//button[text()='Seguir comprando']");

    public static final String ALERTA = "(//span[@class=\"copy5 primary  jsx-2889528833 normal      \"])[2]";
}
