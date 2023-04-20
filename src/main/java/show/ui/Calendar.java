package show.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import show.constants.LogConstants;
import show.ui.locators.CalendarLocators;
import show.util.UtilFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginPage.class);
    public WebDriver driver;
    private UtilFactory utilFactory;
    public Calendar() {
        driver = super.getDriver();
        utilFactory = new UtilFactory(driver);
    }
    @FindBy(xpath = CalendarLocators.CALENDAR_PAGE)
    private WebElement calendarPage;
    @FindBy(xpath = CalendarLocators.APPOINTMENT)
    private WebElement appointment;
    @FindBy(xpath = CalendarLocators.SERVICE)
    private WebElement service;
    @FindBy(xpath = CalendarLocators.PROVIDER)
    private  WebElement provider;
    @FindBy(xpath = CalendarLocators.LOCATION)
    private WebElement location;
    @FindBy(xpath = CalendarLocators.CLICK_DATE)
    private WebElement clickDate;
    @FindBy(xpath = CalendarLocators.SELECT_MY)
    private WebElement selectMonth;
    @FindBy(xpath = CalendarLocators.SELECT_YEAR)
    private WebElement clickYear;
    @FindBy(xpath = CalendarLocators.CLICK_NEXT)
    private WebElement clickNext;

    public void addData() throws InterruptedException, ParseException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(calendarPage);
        calendarPage.click();
        utilFactory.highlight(appointment);
        appointment.click();
        utilFactory.highlight(service);
        service.click();
        utilFactory.highlight(provider);
        provider.click();
        utilFactory.highlight(location);
        location.click();
        location.sendKeys("America");
        utilFactory.highlight(clickDate);
        clickDate.click();
        Thread.sleep(2000);
//date picker
        String setDateStr = "14/05/2023";//dd/mm/yyyy

            String currDateStr =driver.findElement(By.xpath(CalendarLocators.SELECT_MY)).getText();
            Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);
            Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);

            int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();
            boolean isFuture = true;

            if(monthDiff<0) {
                isFuture = false;
                monthDiff = -1 * monthDiff;
            }

            for(int i=0; i<monthDiff; i++)
            {
                if(isFuture)
                    driver.findElement(By.xpath(CalendarLocators.CLICK_NEXT)).click();
                else
                    driver.findElement(By.xpath(CalendarLocators.CLICK_PRE)).click();
            }

            String day;

            day = new SimpleDateFormat("dd").format(setDate);
            driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

            //slider
        WebElement slider = driver.findElement(By.xpath(CalendarLocators.SLIDER));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,303,539).release().build().perform();
        slider.click();

            driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
            Thread.sleep(10000);


    }
}
