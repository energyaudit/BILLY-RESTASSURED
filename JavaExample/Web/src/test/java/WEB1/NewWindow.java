package WEB1;

import WEB1.util.BrowserSetup;
import WEB1.util.OutPutResult;
import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


public class NewWindow{
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

 //   @Before


    @Test
    public void testUntitledTestCase() throws Exception {
     //   driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL1));
        String handle= driver.getWindowHandle();
        System.out.println(handle);
      //  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New Browser Window'])[1]/following::button[1]")).click();
        driver.findElement(By.id("button1")).click();

        driver.findElement(By.id("content")).click();
        Set<String> winSet = driver.getWindowHandles();//get set to know how to go back
        System.out.println(winSet.toString());
        List<String> winList = new ArrayList<String>(winSet);
        String newTab = winList.get(winList.size() - 2);//last windowhandle
        System.out.println("winList: "+winList.size());
        System.out.println(newTab);
        driver.switchTo().window(newTab);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='TestNG Tutorial'])[2]/following::span[2]")).click();
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
