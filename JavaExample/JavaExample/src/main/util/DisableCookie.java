package src.main.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class DisableCookie {
    public static WebDriver driver;
    public static WebDriver Setup() {
        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        switch (getbrowser) {//switch on string
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
                String home1 = System.getProperty("user.home");
                System.setProperty("webdriver.gecko.driver", home1 + "/qa/webdriver/geckodriver.exe");


                FirefoxProfile profile1 = new ProfilesIni().getProfile("default");
                profile1.setPreference("network.cookie.cookieBehavior", 2);
                FirefoxOptions options1 = new FirefoxOptions();
                options1.setProfile(profile1);
                driver = new FirefoxDriver(options1);

                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
        }
        return driver;
    }
}
