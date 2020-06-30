package co.com.appium.calculator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/calculator.feature",
    glue = "co.com.appium.calculator.definitions",
    snippets = SnippetType.CAMELCASE)
public class AppiumCalculatorRunner {}
