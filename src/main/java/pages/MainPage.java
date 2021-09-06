package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage {

    @FindBy(xpath = "//button[@class=\"mat-menu-trigger\"]/span")
    WebElement userInfo;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public String getUserInfo() {
        return userInfo.getText();
    }
}
