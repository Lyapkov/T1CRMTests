package steps;

import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class LoginPageSteps {

    @Step("введен Login {0}")
    public void setLogin(String login) {
        new LoginPage().setLogin(login);
    }

    @Step("введен Password {0}")
    public void setPassword(String password) {
        new LoginPage().setPassword(password);
    }

    @Step("нажата кнопка Войти")
    public void buttonSignInClick() {
        new LoginPage().buttonSignInClick();
    }

    @Step("всплыло сообщение об ошибке {0}")
    public void checkErrorMessage(String error) {
        String actual = String.valueOf(new LoginPage().getErrorMessage());
        assertEquals(error, actual);
    }
}
