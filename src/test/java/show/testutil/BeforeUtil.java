//package show.testutil;
//
//import net.thucydides.core.webdriver.DriverSource;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import show.constants.LogConstants;
//import show.constants.ResourcePathConstants;
//import show.util.UtilFactory;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Collections;
//import java.util.Properties;
//
//public class BeforeUtil implements DriverSource {
//    public WebDriver driver;
//    String browser;
//    DesiredCapabilities capability = new DesiredCapabilities();
//    private static Logger logger = LoggerFactory.getLogger(UtilFactory.class);
//
//    @Override
//    public WebDriver newDriver() {
//        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
//        String os = System.getProperty("os.name").toUpperCase();
//        Properties prop = new Properties();
//        InputStream input = null;
//        try {
//            input = new FileInputStream("serenity.properties");
//            prop.load(input);
//        } catch (FileNotFoundException e) {
//            logger.error(LogConstants.FILE_NOT_FOUND_EXCEPTION + e
//                    + Thread.currentThread().getStackTrace()[1].getMethodName());
//        } catch (IOException e) {
//            logger.error(LogConstants.IO_EXCEPTION + e + Thread.currentThread().getStackTrace()[1].getMethodName());
//        }
//        browser = prop.getProperty("browser");
//        logger.info("Browser: " + browser);
//        if (os.contains("WINDOWS"))
//            if (browser.equalsIgnoreCase("chrome")) {
//                if (os.contains("WINDOWS")) {
//                    System.out.println("@Windows : " + ResourcePathConstants.CHROME_DRIVER_WINDOWS);
//                    logger.debug(ResourcePathConstants.CHROME_DRIVER_WINDOWS);
//                    System.setProperty("webdriver.chrome.driver", ResourcePathConstants.CHROME_DRIVER_WINDOWS);
//                }
//            }
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("-incognito");
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        WebDriver chromedriver = new ChromeDriver(capabilities);
//        return chromedriver;
//    }
//
//}
//
