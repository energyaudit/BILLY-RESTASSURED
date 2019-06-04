package WEB1.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserSetup {
    public static WebDriver driver;
    public static WebDriver Setup() {
        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        switch (getbrowser) {//switch on string
            case "chrome":
            //    System.setProperty("webdriver.chrome.driver", "C:\\QA INSTALL\\chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");

                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                 break;
            case "firefox":
              // System.setProperty("webdriver.gecko.driver", "C:\\QA INSTALL\\geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
            case "opera":

              System.setProperty("webdriver.opera.driver", "/QA INSTALL/operadriver");
                OperaOptions options = new OperaOptions();
            //    options.setBinary(new File("C:\\Program Files (x86)\\Opera\\58.0.3135.79\\opera.exe"));
               options.setBinary(new File("/Applications/Opera.app/Contents/MacOS/Opera"));



             driver = new OperaDriver(options);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            case "Safari":
                driver = new SafariDriver();
                break;
        }
        return driver;
    }
}
