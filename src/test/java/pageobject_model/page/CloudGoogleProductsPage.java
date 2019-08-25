package pageobject_model.page;

import org.openqa.selenium.By;
import pageobject_model.Helpers;

import java.util.concurrent.TimeUnit;

public class CloudGoogleProductsPage {

    public static String getEstimateResult() {
        String estimateResult = driver.findElement(By.xpath("//*[@id='resultBlock']//*[@class='md-title']/b")).getText();
        return estimateResult;
    }

    public static void openPage() {
        driver.get("https://cloud.google.com/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    }

    public static void openMenu() {
        Helpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/products/' and @track-name='products']", driver);
        Helpers.clickOnFoundElementByXpath("//a[@track-metadata-eventdetail='seeAllProducts']", driver);
    }
}
