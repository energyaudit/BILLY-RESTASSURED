package LoytaltyOne;

import WEB1.util.BrowserSetup;
import WEB1.util.OutPutResult;
import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

public class SandBoxOld {
    private WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    // @Before


    @Test
    public void SandBoxSetup() throws Exception {
        driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
        String winHandleBefore = driver.getWindowHandle();


// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

       // driver.switchTo().defaultContent();
      //  driver.switchTo().window(winHandleBefore);
        List<WebElement> elements = driver.findElements(By.cssSelector("*[attributeName='am-button am-button--primary']"));

          driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div[2]/button[2]")).click();
    //  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[2]/div/div[2]/button[1]")).click();



//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='®'])[3]/following::p[1]")).click();
//
//        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(1));
//        driver.findElement(By.id("emailEnableOptionsElement")).click();
//        driver.findElement(By.id("divInputCbElement1")).click();
//        driver.findElement(By.id("buttonEnrollNewBack")).click();
        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("sandbox2  "+getbrowser+"success");
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
