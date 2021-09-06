package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"error\"]")
    WebElement error;

    @FindBy(xpath = "//material-input[@name=\"username\"]/div/input")
    WebElement login;

    @FindBy(xpath = "//material-input[@name=\"password\"]/div/input")
    WebElement password;

    @FindBy(xpath = "//form[@id=\"main-form\"]/button")
    WebElement buttonSignIn;

    public LoginPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void setLogin(String value) {
        fillField(login, value);
    }

    public void setPassword(String value) {
        fillField(password, value);
    }

    public void buttonSignInClick() {
        clickButton(buttonSignIn);
    }

    public String getErrorMessage() {
        return error.getText();
    }
}
