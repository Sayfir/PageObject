package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudGoogleProductsPage extends BasePage {

    protected CloudGoogleProductsPage initElements() {
        PageFactory.initElements(super.driver, this);
        return this;
    }

    @FindBy(xpath = "//ul/li[4]/a[@href='https://cloud.google.com/products/' and @track-name='products']")
    private WebElement productsTab;

    public CloudGoogleProductsPage(WebDriver driver) {
        super(driver);
    }

    public CloudGoogleProductsPage openPage() {
        productsTab.click();
        return this;
    }
}
