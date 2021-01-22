package co.com.certification.testrealpage.ChallengeSolid.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ChallengeSolid.feature",
        glue = {"co.com.certification.testrealpage.ChallengeSolid.stepdefinitions","co.com.certification.testrealpage.ChallengeSolid.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags
{
}
