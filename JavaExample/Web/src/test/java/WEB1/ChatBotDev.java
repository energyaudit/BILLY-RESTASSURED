package WEB1;

import WEB1.util.BrowserSetup;
import WEB1.util.OutPutResult;
import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;

import static org.junit.Assert.fail;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBotDev {
   private WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

   // @Before


    @Test
    public void chatBotDev() throws Exception {
       driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
       WebDriverWait wait = new WebDriverWait(driver, 100);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::div[5]")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("dolphinyang@hotmail.com");

        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("yhl12@");
        driver.findElement(By.id("u_0_2")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid=left_nav_item_Messenger] > .linkWrap")));
        WebElement elementToClick = driver.findElement(By.cssSelector("[data-testid=left_nav_item_Messenger] > .linkWrap"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();
     //   driver.findElement(By.cssSelector("[data-testid=left_nav_item_Messenger] > .linkWrap")).click();

        driver.findElement(By.xpath("//*[contains(text(), 'LoyalBot Dev')]"));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Type a message...'])[1]/following::div[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Type a message...'])[1]/following::div[5]")).click();
        // ERROR: Caught exception [unknown command [editContent]]
        driver.findElement(By.id("js_lo")).click();
        // ERROR: Caught exception [unknown command [editContent]]
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='I can help you with that, you just need to sign in through the BUTTON below first!'])[18]/following::a[1]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
        driver.findElement(By.name("collectorNumber")).click();
        driver.findElement(By.name("collectorNumber")).clear();
        driver.findElement(By.name("collectorNumber")).sendKeys("84151103449");
        driver.findElement(By.name("pin")).click();
        driver.findElement(By.name("pin")).clear();
        driver.findElement(By.name("pin")).sendKeys("1111");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter 4-digit PIN'])[1]/following::button[1]")).click();

        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("51CA  "+getbrowser+"success");
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
