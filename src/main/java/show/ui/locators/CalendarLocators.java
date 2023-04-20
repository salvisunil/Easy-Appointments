package show.ui.locators;

public class CalendarLocators {
    public static final String CALENDAR_PAGE = "//a[normalize-space()='Calendar']";
    public static final String APPOINTMENT = "//button[@id='insert-appointment']";
    //select[@id='select-service']//option[contains(text(),'Service')]
    public static final String SERVICE = "//select[@id='select-service']";
    public static final String PROVIDER = "//select[@id='select-provider']";
    public static final String LOCATION = "//input[@id='appointment-location']";
    public static final String CLICK_DATE = "//input[@id='start-datetime']";
    public static final String SELECT_MY = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]";
    public static final String SELECT_YEAR = "//span[contains(text(),'2023')]";
    public static final String CLICK_NEXT = "//span[contains(text(),'Next')]";

    public static final String SLIDER = "//body/div[@id='ui-datepicker-div']/div[2]/dl[1]/dd[2]/div[1]/span[1]";
    public static final String CLICK_PRE = "//button[contains(text(),'Close')]";





}
