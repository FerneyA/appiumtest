package co.com.appium.calculator.definitions;

import co.com.appium.calculator.steps.CalculatorStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CalculatorDefinition {

  @Steps CalculatorStep stepsAppium;

  @When("^I add (.*) and (.*)$")
  public void addNumbers(int number1, int number2) {
    stepsAppium.effectOperationadd(number1, number2);
  }

  @When("^I subtract (.*) and (.*)$")
  public void subtractNumbers(int number1, int number2) {
    stepsAppium.effectOperationSubtract(number1, number2);
  }

  @When("^I multiply (.*) and (.*)$")
  public void multiplyNumbers(int number1, int number2) {
    stepsAppium.effectOperationMultiply(number1, number2);
  }

  @When("^I divide (.*) and (.*)$")
  public void divideNumbers(int number1, int number2) {
    stepsAppium.effectOperationDivide(number1, number2);
  }

  @Then("^the result should be (.*)$")
  public void checkResult(String result) {
    stepsAppium.validateResult(result);
  }
}
