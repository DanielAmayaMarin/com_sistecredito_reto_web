package com.sistecredito.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiPopUps {
    public static String CONTENEDOR_PADRE(){
        return ".airship-html-prompt-shadow";
    }
    public static String BOTON_NO(){
        return "div.airship-prompt-container > div > div:nth-child(3) > button:nth-child(1)";
    }
}
