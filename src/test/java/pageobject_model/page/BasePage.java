package pageobject_model.page;

import org.openqa.selenium.WebDriver;

public abstract class BasePage extends MainClass {

    protected abstract BasePage openPage();
    protected abstract BasePage initElements();
    public BasePage(WebDriver driver) {
       super.driver = driver;
    }
}
