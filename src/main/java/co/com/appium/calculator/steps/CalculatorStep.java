package co.com.appium.calculator.steps;

import co.com.appium.calculator.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CalculatorStep {

  @Page HomePage homePage;

  @Step
  public void effectOperationadd(int number1, int number2) {
    homePage.selectNumber(number1);
    homePage.addNumbers();
    homePage.selectNumber(number2);
  }

  @Step
  public void effectOperationSubtract(int number1, int number2) {
    homePage.selectNumber(number1);
    homePage.subtractNumbers();
    homePage.selectNumber(number2);
  }

  @Step
  public void effectOperationMultiply(int number1, int number2) {
    homePage.selectNumber(number1);
    homePage.multiplyNumbers();
    homePage.selectNumber(number2);
  }

  @Step
  public void effectOperationDivide(int number1, int number2) {
    homePage.selectNumber(number1);
    homePage.divideNumbers();
    homePage.selectNumber(number2);
  }

  @Step
  public void validateResult(String result) {
    String resultFound = homePage.getResult();
    MatcherAssert.assertThat(
        "The results are different: " + " expected: " + result + " found: " + resultFound,
        resultFound.equals(result));
  }
}
