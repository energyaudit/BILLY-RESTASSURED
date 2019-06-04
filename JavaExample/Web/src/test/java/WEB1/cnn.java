package WEB1;

import WEB1.util.BrowserSetup;
import WEB1.util.OutPutResult;
import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;

import static org.junit.Assert.fail;




        import WEB1.util.BrowserSetup;
        import WEB1.util.OutPutResult;
        import WEB1.util.PropertyUtil;

        import WEB1.util.TestConstants;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import java.util.concurrent.TimeUnit;

        import static org.junit.Assert.fail;

public class cnn {
    private WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    // @Before


    @Test
    public void testCA51TemplateSetup() throws Exception {
        driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
//         driver.findElement(By.linkText("World")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Millions of Brits warned to renew passports'])[1]/following::h2[2]")).click();

        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("CNN  "+getbrowser+"success");
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
