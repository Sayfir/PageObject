package pageobject_model.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Helpers {
    public static final WebDriver driver = new ChromeDriver();

    public static void clickOnFoundElementByXpath(String locator, WebDriver driver) {
        driver.findElement(By.xpath(locator)).click();
    }

    public static void clickOnFoundElementByCss(String locator, WebDriver driver) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public static void typeTextInFoundTextFields(String locator, WebDriver driver, String text) {
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public static void waitUntilClicable(String locator, WebDriver driver) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath(locator)));
    }

    public static void waitTillIframeIsVisible(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
