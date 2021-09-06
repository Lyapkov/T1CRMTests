package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class MainPageSteps {

    @Step("информация о user {0}")
    public void checkUserInfo(String info) {
        String actual = String.valueOf(new MainPage().getUserInfo());
        assertEquals(info, actual);
    }
}
