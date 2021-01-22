package co.com.certification.sophos.ChallengeSolid.stepdefinitions;

import co.com.certification.sophos.ChallengeSolid.questions.CheckQLogin;
import co.com.certification.sophos.ChallengeSolid.tasks.BuyDresses;
import co.com.certification.sophos.ChallengeSolid.tasks.Start;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChallengeSolid
{
    @Given("^that the user wants to buy an item$")
    public void thatTheUserWantsToBuyAnItem()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());
    }

    @When("^he enters the store online$")
    public void heEntersTheStoreOnline()
    {
        theActorInTheSpotlight().attemptsTo(BuyDresses.WebSite());
    }

    @Then("^he verifies that the data is correct (.*) (.*)$")
    public void heVerifiesThatTheDataIsCorrect(String questionv, String cantidad)
    {
        theActorInTheSpotlight().should(seeThat(CheckQLogin.is(questionv, cantidad)));
    }

}
