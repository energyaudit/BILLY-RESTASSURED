package LoytaltyOne;

import WEB1.util.*;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.joda.time.*;

import static org.junit.Assert.fail;

public class SandBoxCreditCDate {
    private WebDriver driver;
    private String todate0;
    private String str1;
    private static boolean DffD;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    // @Before


    @Test
    public void SandBoxCredCardExp() throws Exception {
        driver=new BrowserSetup().Setup();
        driver.get(PropertyUtil.getMessageForApplication(TestConstants.BASE_URL));
        String winHandleBefore = driver.getWindowHandle();


// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

       // driver.switchTo().defaultContent();
      //  driver.switchTo().window(winHandleBefore);

   driver.findElement(By.cssSelector("button.am-button:nth-child(1)")).click();


     // driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[2]/div/div[2]/button[1]")).click();

//        driver.findElement(By.linkText("Get Miles")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='®'])[3]/following::span[1]")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='IN-STORE'])[1]/following::span[1]")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ONLINE'])[1]/following::span[1]")).click();
//    driver.findElement(By.linkText("Join now")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]//    driver.findElement(By.id("buttonEnrollNewBack")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='®'])[3]/following::p[1]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.findElement(By.linkText("Get Miles")).click();


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1200)", "");
        WebDriverWait wait = new WebDriverWait(driver, 100);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.AMRewardBlockContentMeta__offerTimeLeft")));


       String fullText0 = driver.findElement(By.cssSelector("div.AMRewardBlockContentMeta__offerTimeLeft")).getText();
        java.util.List<WebElement>  TestElement = driver.findElements(By.cssSelector("div.AMRewardBlockContentMeta__offerTimeLeft"));


        Vector v = new Vector();


for (WebElement wt : TestElement){

    v.add(wt.getText());
System.out.println(wt);
//System.out.println(wt.getText());
}
        System.out.println(v);
        System.out.println(fullText0);
        todate0=fullText0.substring(7);
        System.out.println(todate0);
//        String fullText1 = driver.findElement(By.cssSelector("#__next > div > main > div.BonusOffersSection > div.largeCarousel > div > div > div > div > div:nth-child(2) > div > div > div >" +
//                " div.AMRewardBlockContent > div.AMRewardBlockContentMeta.AMRewardBlockContentMeta--offer > div")).getText();
        String fullText1 =TestElement.get(1).getText();

          System.out.println(fullText1);
//        String fullText2 = driver.findElement(By.cssSelector("#__next > div > main > div.BonusOffersSection > div.largeCarousel > div > div > div > div > div:nth-child(3) > div > div > div >
//        div.AMRewardBlockContent > div.AMRewardBlockContentMeta.AMRewardBlockContentMeta--offer > div")).getText();
        String fullText2 =TestElement.get(2).getText();
        System.out.println(fullText2);

        String fullText3 = driver.findElement(By.cssSelector("#__next > div > main > div.BonusOffersSection > div.largeCarousel > div > div > div > div > div:nth-child(4) > div > div > div > div.AMRewardBlockContent > div.AMRewardBlockContentMeta.AMRewardBlockContentMeta--offer > div")).getText();
        System.out.println(fullText3);

        DiffFormatDateCmp obj = new DiffFormatDateCmp();

        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        System.out.println("Today : " + today);
      //  String str= obj.datecheckcmp("dd/MM/yyyy", "dd/MM/yyyy", "27/12/2018",today);
        String str= obj.datecheckcmp("dd/MM/yyyy", "dd/MM/yyyy", todate0,today);
        System.out.println(str);

        CompToday ct=new CompToday();
        str1=ct.ComTd("dd/MM/yyyy", todate0);
        System.out.println(str1);

        CalDaysDiff cdd0=new CalDaysDiff();
//        try{ long daysDiff0=cdd0.calDaysDiffer("dd/MM/yyyy",today,todate0);
//                   }
//        catch(ParseException e)
//        {}
        long daysDiff0=cdd0.calDaysDiffer("dd/MM/yyyy",today,todate0);
        System.out.println("Credit card0 days to expire?"+daysDiff0);

        VeriDaysDiffN vdn=new VeriDaysDiffN();
        DffD= vdn.inputPara("dd/MM/yyyy",todate0,30);
        System.out.println("Credit card0 Meet requred dyas to expire?"+DffD);


        String getbrowser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);
        OutPutResult outR = new OutPutResult();
//        outR.inputStr("Credit card Expire Date "+getbrowser+fullText0+fullText1+fullText2+fullText3+
//                "success:\nfromdate is today,todate is expire date "+str1+"Credit card0 has following days to expire:"+daysDiff0+"Credit card0 Meet requred dyas to expire?"+DffD);
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
