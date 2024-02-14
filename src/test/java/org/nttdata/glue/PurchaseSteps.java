package org.nttdata.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.UseAnAbility;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.nttdata.tasks.*;
import io.cucumber.java.Before;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.apache.xmpbox.type.Types.XPath;
import static org.hamcrest.Matchers.containsString;




public class PurchaseSteps {
    private static final String ACTOR_NAME = "User";

    @Before
    public void setTheStage() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User estoy en la pagina")
    public void user_estoy_en_la_pagina() {
        theActorCalled(ACTOR_NAME).attemptsTo(OpenPage.loadpage());
    }

    @When("ingreso datos {string} {string}")
    public void ingreso_datos(String user, String password) {
        theActorInTheSpotlight().attemptsTo(LoginTask.withCredentials(user, password));
    }

    @Then("veo la pagina principal de productos")
    public void veo_la_pagina_principal_de_productos() {
        theActorInTheSpotlight().should(seeThat(TheWebPage.title(), containsString("Swag Labs")));
    }

    @When("agrego dos productos al carrito")
    public void agrego_dos_productos_al_carrito() {OnStage.theActorInTheSpotlight().attemptsTo(AddProductsToCartTask.addProductsToCart());}

    @And("hago click en el icono del carrito")
    public void hago_click_en_el_icono_del_carrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewCartTask.view());
    }

    @When("completo el formulario de compra con {string}, {string} y {string}")
    public void completo_el_formulario_de_compra_con(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletePurchaseFormTask.withInformation(firstName, lastName, postalCode));
    }

    @And("finalizo la compra")
    public void finalizo_la_compra() {
        OnStage.theActorInTheSpotlight().attemptsTo(FinalizePurchaseTask.complete());
    }

    @Then("deberia ver la confirmacion de la orden {string}")
    public void ConfirmacionDeLaOrden(String message) {
        theActorInTheSpotlight().should(seeThat(Text.of(ConfirmationPage.ORDER_CONFIRMATION_MESSAGE), containsString(message)));
    }

}
