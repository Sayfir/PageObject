package pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject_model.test.Helpers;


public class CloudGoogleCalculatorPage extends BasePage {

    public CloudGoogleCalculatorPage(WebDriver driver) {
        super(driver);
    }

    protected BasePage initElements() {
     PageFactory.initElements(super.driver, this);
        return null;
    }

    public CloudGoogleCalculatorPage openPage() {
        Helpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/calculators']", driver);
        calculatorsTab.click();
        return null;
    }

    @FindBy(xpath = "//a[@href='https://cloud.google.com/pricing/calculators']")
    private WebElement calculatorsTab;

    @FindBy(xpath = "//input[@id='input_52']")
    private WebElement instancesNumberField;

    @FindBy(xpath = "//md-select[@id='select_75']")
    private WebElement machineTypeDropdown;

    @FindBy(xpath = "//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")
    private WebElement machineTypeDropdownElement;

    @FindBy(css = "md-input-container > [aria-label='Add GPUs']")
    private WebElement addGpuCheckbox;

    public CloudGoogleCalculatorPage fillForm() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().
                frame(0);
        Helpers.waitUntilClicable("//input[@id='input_52']", driver);
        instancesNumberField.click();
        Helpers.typeTextInFoundTextFields("//input[@id='input_52']", driver, "4");
        Helpers.waitUntilClicable("//md-select[@id='select_75']", driver);
        machineTypeDropdown.click();
        Helpers.waitUntilClicable("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']", driver);
        machineTypeDropdownElement.click();
        addGpuCheckbox.click();

        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Number of GPUs']/md-select-value", driver);

        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']", driver);

        Helpers.waitUntilClicable("//md-select[@placeholder='GPU type']/md-select-value", driver);

        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='GPU type']/md-select-value", driver);

        Helpers.waitUntilClicable("//*[@value='NVIDIA_TESLA_V100']", driver);

        Helpers.clickOnFoundElementByXpath("//*[@value='NVIDIA_TESLA_V100']", driver);

        Helpers.waitUntilClicable("//md-select[@placeholder='Local SSD']/md-select-value", driver);

        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Local SSD']/md-select-value", driver);

        Helpers.waitUntilClicable("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']", driver);

        Helpers.clickOnFoundElementByXpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']", driver);

        Helpers.waitUntilClicable("//md-select[@placeholder='Datacenter location']/md-select-value", driver);

        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Datacenter location']/md-select-value", driver);

        Helpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);

        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);

        Helpers.waitUntilClicable("//md-select[@placeholder='Committed usage']/md-select-value", driver);

        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Committed usage']/md-select-value", driver);

        Helpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);

        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);

        Helpers.clickOnFoundElementByXpath("//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']", driver);
    return this;
    }

    public String getEstimatedResult() {
        String estimateResult = driver.findElement(By.xpath("//*[@id='resultBlock']//*[@class='md-title']/b")).getText();
        return estimateResult;
    }

    public String getVmClass() {
        String vmClass = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[2]/div")).getText();
        return vmClass;
    }

    public String getInstanceType() {
        String instanceType = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[3]/div")).getText();
        return instanceType;
    }

    public String getRegion() {
        String region = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[4]/div")).getText();
        return region;
    }

    public String getLocalSsd() {
        String localSsd = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[5]/div")).getText();
        return localSsd;
    }

    public String getCommitmentTerm() {
        String commitmentTerm = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[6]/div")).getText();
        return commitmentTerm;
    }


}
