package pageobject_model.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject_model.test.Helpers;

public class CloudGooglePricingPage extends BasePage{

    @FindBy (xpath = "//a[@track-metadata-eventdetail='seeAllProducts']")
    private WebElement seeAllProductsLink;

    @FindBy(xpath = "//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']")
    private WebElement seePricingLink;

    public CloudGooglePricingPage(WebDriver driver) {
        super(driver);
    }

    public CloudGooglePricingPage openPage() {
        seeAllProductsLink.click();
        Helpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        seePricingLink.click();
        return null;
    }

    protected BasePage initElements() {
     PageFactory.initElements(super.driver, this);
        return null;
    }
}
