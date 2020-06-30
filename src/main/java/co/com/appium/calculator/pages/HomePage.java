package co.com.appium.calculator.pages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import io.appium.java_client.MobileDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

  protected MobileDriver mobileDriver;

  @FindBy(id = "op_add")
  private WebElementFacade addition;

  @FindBy(id = "op_sub")
  private WebElementFacade subtraction;

  @FindBy(id = "op_mul")
  private WebElementFacade multiplication;

  @FindBy(id = "op_div")
  private WebElementFacade division;

  @FindBy(id = "eq")
  private WebElementFacade equal;

  @FindBy(id = "result")
  private WebElementFacade result;

  public HomePage() {
    super();
    mobileDriver = getProxiedDriver();
  }

  public void selectNumber(int number) {
    getDriver().findElement(By.id("digit_" + number)).click();
  }

  public void addNumbers() {
    addition.click();
  }

  public void subtractNumbers() {
    subtraction.click();
  }

  public void multiplyNumbers() {
    multiplication.click();
  }

  public void divideNumbers() {
    division.click();
  }

  public void selectEqual() {
    equal.click();
  }

  public String getResult() {
    return result.getText();
  }
}
