package pageobject_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject_model.page.CloudGoogleCalculatorPage;

public class WebDriverSeleniumPageDataValidationTest extends BaseTest {

    @BeforeTest(alwaysRun = true)
    public static void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public static void testGetCorrectEstimationValue() {
        String estimateResult = new CloudGoogleCalculatorPage()
                .openCalulatorPage()
                .fillingFor
                .gettingEstimateReults;
        Assert.assertEquals("Total Estimated Cost: USD 1,187.77 per 1 month", BaseTest.getEstimateResult());
    }

    @Test
    public void testGetInstanceTypeCorrectValue() {
        Assert.assertEquals("Instance type: n1-standard-8", BaseTest.getInstanceType());
    }

    @Test
    public void testGetRegionCorrectValue() {
        Assert.assertEquals("Region: Frankfurt", BaseTest.getRegion());
    }

    @Test
    public void testGetLocalSsdCorrectValue() {
        Assert.assertEquals("Total available local SSD space 2x375 GB", BaseTest.getLocalSsd());
    }

    @Test
    public void testGetCommitmentTermCorrectValue() {
        Assert.assertEquals("Commitment term: 1 Year", BaseTest.getCommitmentTerm());
    }

    @AfterTest(alwaysRun = true)
    public static void teardown() {
        driver.quit();
    }
}

