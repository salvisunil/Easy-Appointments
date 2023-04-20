package show.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import show.constants.LogConstants;
import show.ui.locators.CustomersLocators;
import show.util.UtilFactory;

public class CustomersPage extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginPage.class);
    public WebDriver driver;
    private UtilFactory utilFactory;
    public CustomersPage() {
        driver = super.getDriver();
        utilFactory = new UtilFactory(driver);
    }
    @FindBy(xpath = CustomersLocators.CUSTOMER_PAGE)
    private WebElement customerPage;
    @FindBy(xpath = CustomersLocators.ADD_BUTTON)
    private WebElement addButton;
    @FindBy(xpath = CustomersLocators.FIRST_NAME)
    private WebElement firstName;
    @FindBy(xpath = CustomersLocators.LAST_NAME)
    private WebElement lastName;
    @FindBy(xpath = CustomersLocators.EMAIL)
    private WebElement email1;
    @FindBy(xpath = CustomersLocators.PHONE_NUMBER)
    private WebElement phoneNumber;
    @FindBy(xpath = CustomersLocators.ADDRESS)
    private WebElement address1;
    @FindBy(xpath = CustomersLocators.CITY)
    private WebElement city1;
    @FindBy(xpath = CustomersLocators.ZIP_CODE)
    private WebElement zipCode;
    @FindBy(xpath = CustomersLocators.LANGUAGE)
    private WebElement language;
    @FindBy(xpath = CustomersLocators.LANGUAGE_SELECT)
    private WebElement languageSelect;
    @FindBy(xpath = CustomersLocators.TIME_ZONE)
    private WebElement timeZone;
    @FindBy(xpath = CustomersLocators.TIME_ZONE_SELECT)
    private WebElement timeZoneSelect;
    @FindBy(xpath = CustomersLocators.NOTES)
    private WebElement notes;
    @FindBy(xpath = CustomersLocators.SAVE_BUTTON)
    private WebElement saveButton;
    @FindBy(xpath = CustomersLocators.CLICK_CUST)
    private WebElement clickCu;
    @FindBy(xpath = CustomersLocators.EDIT_CLICK)
    private WebElement editC;
    @FindBy(xpath = CustomersLocators.NAME)
    private WebElement name;
    @FindBy(xpath = CustomersLocators.SAVE)
    private WebElement save;

    public void clickCust(){
        utilFactory.highlight(customerPage);
        customerPage.click();
        utilFactory.highlight(addButton);
        addButton.click();
    }

    public void enterCustomersCredentials(String first_name, String last_name, String email, String phone_number,
                                          String address, String city, String zip_code, String note){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(firstName);
        firstName.click();
        firstName.sendKeys(first_name);
        utilFactory.highlight(lastName);
        lastName.click();
        lastName.sendKeys(last_name);
        utilFactory.highlight(email1);
        email1.click();
        email1.sendKeys(email);
        utilFactory.highlight(phoneNumber);
        phoneNumber.click();
        phoneNumber.sendKeys(phone_number);
        utilFactory.highlight(address1);
        address1.click();
        address1.sendKeys(address);
        utilFactory.highlight(city1);
        city1.click();
        city1.sendKeys(city);
        utilFactory.highlight(zipCode);
        zipCode.click();
        zipCode.sendKeys(zip_code);
        utilFactory.highlight(language);
        language.click();
        utilFactory.highlight(languageSelect);
        languageSelect.click();
        utilFactory.highlight(timeZone);
        timeZone.click();
        utilFactory.highlight(timeZoneSelect);
        timeZoneSelect.click();
        utilFactory.highlight(notes);
        notes.click();
        notes.sendKeys(note);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        utilFactory.highlight(saveButton);
        saveButton.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void navigateEdit(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(clickCu);
        clickCu.click();
//        String verifyName = $(By.xpath("//strong[normalize-space()='alax patterson']")).getText();
//        Assert.assertEquals(verifyName,"alax patterson");
        utilFactory.highlight(editC);
        editC.click();
        utilFactory.highlight(name);
        name.sendKeys("Admin");
        utilFactory.highlight(save);
        save.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

}
