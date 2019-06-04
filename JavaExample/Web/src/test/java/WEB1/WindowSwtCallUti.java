package WEB1;

import WEB1.util.*;
import WEB1.util.OutPutResult;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;

import static org.junit.Assert.fail;


public class WindowSwtCallUti {
    private WebDriver driver;
    private WebDriver drn;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

 //   @Before


    @Test
    public void WindowSwtCallUti() throws Exception {
     //   driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL1));
        String handle= driver.getWindowHandle();
        System.out.println(handle);
        driver.findElement(By.id("button1")).click();

        driver.findElement(By.id("content")).click();
        SwitchWindow sw=new SwitchWindow();
        drn=sw.inputStr(driver,2);//switch back to  2 window before
        drn.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='TestNG Tutorial'])[2]/following::span[2]")).click();

        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Switch to window before"+getbrowser);

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
