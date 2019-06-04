package LoytaltyOne;

import WEB1.util.BrowserSetup;
import WEB1.util.OutPutResult;
import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static org.junit.Assert.fail;

public class SandBox1Reward {
    private WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    // @Before


    @Test
    public void SandBoxRewardSetup() throws Exception {
        driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
        String winHandleBefore = driver.getWindowHandle();

   driver.findElement(By.cssSelector("button.am-button:nth-child(1)")).click();
        driver.findElement(By.linkText("Rewards")).click();
 //       driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cash Rewards –'])[1]/following::span[1]")).click();

        driver.findElement(By.linkText("In-store Partners")).click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
        driver.findElement(By.id("overlayEvoucherSelect")).click();
        new Select(driver.findElement(By.id("overlayEvoucherSelect"))).selectByVisibleText("Ontario");


        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Reward "+getbrowser+"success");
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
