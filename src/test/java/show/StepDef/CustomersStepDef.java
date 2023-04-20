package show.StepDef;

import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import show.constants.FeatureNameConstants;
import show.constants.LogConstants;
import show.ui.CustomersPage;
import show.util.UtilFactory;

import java.io.IOException;
import java.util.List;

public class CustomersStepDef extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginStepDef.class);
    @Managed
    CustomersPage customersPage;
    UtilFactory utilFactory;

    @Then("User navigate to customer page")
    public void enterData(List<List<String>> customersCredentials) throws ParseException, IOException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        logger.info("User is on Customer page");
        customersPage.clickCust();
        customersPage.enterCustomersCredentials(utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0),"first_name",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "last_name",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "email",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "phone_number",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "address",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "city",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "zip_code",
                        "Customers.json"),
                utilFactory.readJSON(FeatureNameConstants.CUSTOMER,customersCredentials.get(0).get(0), "note",
                        "Customers.json"));
                logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    @Then("User navigate to edit page")
    public void editPage(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        customersPage.navigateEdit();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }


}
