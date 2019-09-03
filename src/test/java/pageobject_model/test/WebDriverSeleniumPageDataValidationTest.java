package pageobject_model.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject_model.page.CloudGoogleCalculatorPage;
import pageobject_model.page.CloudGooglePricingPage;
import pageobject_model.page.CloudGoogleProductsPage;

public class WebDriverSeleniumPageDataValidationTest extends BaseTest {

    @Test
    public void testGetCorrectEstimationValue() throws InterruptedException {
        new CloudGoogleProductsPage(driver).openPage();
        new CloudGooglePricingPage(driver).openPage();
        String estimateResult = new CloudGoogleCalculatorPage(driver)
                .openPage()
                .fillForm()
                .getEstimatedResult();

        Assert.assertEquals("Total Estimated Cost: USD 1,187.77 per 1 month", estimateResult);
    }

//    @Test
//    public void testGetInstanceTypeCorrectValue() {
//        Assert.assertEquals("Instance type: n1-standard-8", BaseTest.getInstanceType());
//    }
//
//    @Test
//    public void testGetRegionCorrectValue() {
//        Assert.assertEquals("Region: Frankfurt", BaseTest.getRegion());
//    }
//
//    @Test
//    public void testGetLocalSsdCorrectValue() {
//        Assert.assertEquals("Total available local SSD space 2x375 GB", BaseTest.getLocalSsd());
//    }
//
//    @Test
//    public void testGetCommitmentTermCorrectValue() {
//        Assert.assertEquals("Commitment term: 1 Year", BaseTest.getCommitmentTerm());
//    }
}

