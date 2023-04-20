package show.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URLConstants {

    private static Logger logger = LoggerFactory.getLogger(URLConstants.class);

    public static String setUrl() {

        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        String launchUrl = "";
        if (System.getProperty("env").equals("qa")) {
            launchUrl = "https://demo.easyappointments.org/index.php/user/login";
        }else{
                logger.debug("Incorrect environment.");
        }
        logger.debug(LogConstants.LOG_ENTER+Thread.currentThread().getStackTrace()[1].getMethodName());
        return launchUrl;

    }

}
