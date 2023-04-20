package show.StepDef;

import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import show.ui.Calendar;
import show.util.UtilFactory;

import java.text.ParseException;

public class CalendarStepDef extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginStepDef.class);

    @Managed
    Calendar calendar;

    UtilFactory utilFactory;

    @Then("User is add event")
    public void addEvent() throws InterruptedException, ParseException {
        calendar.addData();

    }
}
