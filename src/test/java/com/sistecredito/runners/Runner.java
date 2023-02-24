package com.sistecredito.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/SeleccionarArticulos.feature"},
        tags = "@AgregaProduto",
        glue = {"com.sistecredito.stepsdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
