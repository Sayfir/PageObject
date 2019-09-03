package pageobject_model.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pageobject_model.page.CloudGoogleHomePage;
import pageobject_model.page.MainClass;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends MainClass {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws InterruptedException {
        super.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new CloudGoogleHomePage(driver).openPage();

    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown() {
//        driver.quit();
//    }
}
