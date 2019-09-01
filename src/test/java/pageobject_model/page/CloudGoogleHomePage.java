package pageobject_model.page;

import org.openqa.selenium.WebDriver;

public class CloudGoogleHomePage extends BasePage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";

    public CloudGoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CloudGoogleHomePage openPage() {
        super.driver.get(HOMEPAGE_URL);
        super.driver.manage().window().maximize();
        return null;
    }

    protected BasePage initElements() {
        return null;
    }
}
