package WEB1;

import WEB1.util.BrowserSetup;
import WEB1.util.OutPutResult;
import WEB1.util.PropertyUtil;
import WEB1.util.TestConstants;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class VerifyFloat {
   private WebDriver driver;
    private String gasprice;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

   // @Before


    @Test
    public void verifyVariable() throws Exception {
       driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
        // element is object that cannnot be compare to 0,so get txt attribute then parse back to float
        gasprice =driver.findElement(By.cssSelector("li > span.gaspricebox > a")).getText();

        float f = Float.parseFloat(gasprice);
        assertTrue(f>0);

        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("51CA  "+getbrowser+" verified gas price >0");
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
