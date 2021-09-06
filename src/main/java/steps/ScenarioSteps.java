package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    LoginPageSteps loginPageSteps = new LoginPageSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();

    @When("^вводим login \"(.+)\"$")
    public void setLogin(String value) {
        loginPageSteps.setLogin(value);
    }

    @When("^вводим password \"(.+)\"$")
    public void setPassword(String value) {
        loginPageSteps.setPassword(value);
    }

    @When("^нажата кнопка Войти$")
    public void signInClick() {
        loginPageSteps.buttonSignInClick();
    }

    @Then("^user \"(.+)\"$")
    public void checkUserInfo(String value) {
        mainPageSteps.checkUserInfo(value);
    }

    @Then("^сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessage(String value) {
        loginPageSteps.checkErrorMessage(value);
    }
}
