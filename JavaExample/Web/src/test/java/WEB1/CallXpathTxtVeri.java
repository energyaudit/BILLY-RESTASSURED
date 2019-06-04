package WEB1;

import WEB1.util.*;
import WEB1.util.OutPutResult;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;

import static org.junit.Assert.fail;

public class CallXpathTxtVeri {
   private static WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

   // @Before


    @Test
    public void CallXpathTxt() throws Exception {
       driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
//        List<WebElement> webElements = driver.findElements(By.xpath("//*[@id="mainmenu"]/ul/li[9]/a"));//Put whole second column of table to
//        //list webElements,then check if Birthday is inside
//
//        String expect = "Birthday";
//        boolean exist = false;
//        for(WebElement element : webElements){
//            System.out.println(element.getText());
//            if(expect.equals(element.getText())){
//                exist = true;
//            }
//        }
        XpathTxt xpt= new XpathTxt();
        boolean result=XpathTxt.inputStr(driver,"//*[@id=\"mainmenu\"]/ul/li[9]/a","工作");
        System.out.println(result);
        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
        outR.inputStr("Expect txt exist= "+result+getbrowser);
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
