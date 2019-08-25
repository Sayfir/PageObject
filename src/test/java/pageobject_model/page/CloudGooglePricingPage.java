package pageobject_model.page;

import pageobject_model.Helpers;

public class CloudGooglePricingPage {


    public static void openCalculatorPage() {
        Helpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        Helpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);

    }
}
