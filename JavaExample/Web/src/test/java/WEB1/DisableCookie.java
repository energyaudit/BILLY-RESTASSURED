package WEB1;

import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;



public class DisableCookie {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        String getbrowser= PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        switch(getbrowser){//switch on string
            case "chrome":
                String home = System.getProperty("user.home");
                System.out.println(home);
                System.setProperty("webdriver.chrome.driver", home + "/qa/webdriver/chromedriver.exe");


                DesiredCapabilities caps = new DesiredCapabilities();

                ChromeOptions options = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<String, Object>();
                Map<String, Object> profile = new HashMap<String, Object>();
                Map<String, Object> contentSettings = new HashMap<String, Object>();

                contentSettings.put("cookies",2);
                profile.put("managed_default_content_settings",contentSettings);
                prefs.put("profile",profile);
                options.setExperimentalOption("prefs",prefs);
                caps.setCapability(ChromeOptions.CAPABILITY,options);

                driver = new ChromeDriver(caps);

                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\QA INSTALL\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
        }
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
        driver.findElement(By.linkText("资讯")).click();
        driver.findElement(By.linkText("新闻精要")).click();
        driver.findElement(By.linkText("51首页")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
