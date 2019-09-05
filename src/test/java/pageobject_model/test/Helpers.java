package pageobject_model.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    public static void waitUntilClickable(String locator, WebDriver driver) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath(locator)));
    }
}
