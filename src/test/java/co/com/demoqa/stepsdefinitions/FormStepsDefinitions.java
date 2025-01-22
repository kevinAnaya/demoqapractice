package co.com.demoqa.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FormStepsDefinitions {

    @Managed
    WebDriver hisBrowser;

    //config de actores
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user open a web page$")
    public void theUserOpenAWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/radio-button"));
    }

    @When("^the user enter the credential$")
    public void theUserEnterTheCredential() {

    }

    @Then("^the user can see the page wiht the register$")
    public void theUserCanSeeThePageWihtTheRegister() {

    }
}
