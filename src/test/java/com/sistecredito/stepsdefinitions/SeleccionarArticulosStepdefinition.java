package com.sistecredito.stepsdefinitions;

import com.sistecredito.exceptions.ModulosException;
import com.sistecredito.models.MenuModel;
import com.sistecredito.questions.ValidarProductos;
import com.sistecredito.tasks.AbrirPagina;
import com.sistecredito.tasks.CerrarPopup;
import com.sistecredito.tasks.SeleccionarProducto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarArticulosStepdefinition {

    @Given("^que me encuentro en la página de falabella$")
    public void queMeEncuentroEnLaPáginaDeFalabella() {
        theActorCalled("Daniel").wasAbleTo(
                AbrirPagina.urlWeb(),
                CerrarPopup.cerrar()
        );
    }

    @When("selecciono los {int} productos aleatorios")
    public void seleccionoLosProductosAleatorios(Integer cantidad, io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.seleccionar(MenuModel.setData(dataTable).get(0), cantidad)
        );
    }
    @Then("Válido los productos en el carrito de compras")
    public void válidoLosProductosEnElCarritoDeCompras() {
        theActorInTheSpotlight().should(seeThat(
                ValidarProductos.enElCarrito()
        ).orComplainWith(ModulosException.class, ModulosException.ERROR));
    }

}
