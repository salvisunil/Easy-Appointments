package show.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},features = {"C:/javapro/Easy-Appointments/src/test/resources/features/Login.feature"},
glue = "show/StepDef")
public class LoginRunner {

}
