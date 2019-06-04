import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

public class ibs_Firefox {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
  System.setProperty("webdriver.gecko.driver", "C:\\QA INSTALL\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "https://qa.instantinternetbanking.com/";
  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHttpsStaging() throws Exception {
    driver.get(baseUrl + "/internetbanking/index.form");
    new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTPS");
    String host=driver.findElement(By.id("site_url_label")).getText();
    System.out.println("Hosting url :  " + host);
  if(baseUrl!= host) 
  {
	new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV");
  } 
else
  {
	 if(baseUrl!= host) 
	  {
		new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV2");
	  } 
	else
	  {
		if(baseUrl!= host) 
		  {
			new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING");
		  } 
		else
		{
			if(baseUrl!= host) 
			  {
				new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTP");
			  } 
			else
			{
				if(baseUrl!= host) 
				  {
					new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV3");
				  } 
				else
				{
					if(baseUrl!= host) 
					  {
						new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV4");
					  } 
					else
					{
						if(baseUrl!= host) 
						  {
							new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV_NL");
						  } 
						else
						{
							if(baseUrl!= host) 
							  {
								new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA1");
							  } 
							else
							{
								if(baseUrl!= host) 
								  {
									new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA");
								  } 
								else
								{
									if(baseUrl!= host) 
									  {
										new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA_NL");
									  } 
									else
									{
										if(baseUrl!= host) 
										  {
											new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA2");
										  } 
										else
										{
											if(baseUrl!= host) 
											  {
												new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("MERCHANT TEST");
											  } 
											else
											{
												if(baseUrl!= host) 
												  {
													new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("PRODUCTION");
												  } 
												else
												{
													if(baseUrl!= host) 
													  {
														new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("BACKUP_DC_PRODUCTION_EXT");
													  } 
													else
													{
														  }
 
												}

											}

										}
	
									}
	
								}
	
							}
	
						}
	
					}
	
				}
	
			}
	
		}

	  }
	  }
  String host1=driver.findElement(By.id("site_url_label")).getText();
    System.out.println("Hosting url :  " + host1);
        
 //   new Select(driver.findElement(By.id("override_store_id"))).selectByVisibleText("Branded - IS34926840");
  //  new Select(driver.findElement(By.id("theme"))).selectByVisibleText("buymyevoucher");
     driver.findElement(By.id("submit_button")).click();
    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Swedbank");
//     driver.findElement(By.cssSelector("option[value=\"59\"]")).click();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     driver.findElement(By.id("launchbankbtn")).click();
      driver.navigate().back();
      
   new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Forex Bank");
//    driver.findElement(By.cssSelector("option[value=\"53\"]")).click();
   driver.findElement(By.id("launchbankbtn")).click();
    driver.navigate().back();
   driver.navigate().refresh();
//   
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Danske Bank");
//    driver.findElement(By.cssSelector("option[value=\"45\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//    driver.navigate().back();
//    driver.navigate().refresh();
//    
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Handelsbanken");
//    driver.findElement(By.cssSelector("option[value=\"58\"]")).click();
//    if(driver.getPageSource().contains(" temporarily unavailable"))
//    {
//    	driver.navigate().back();
//    }
//  else
//    {
//	  driver.findElement(By.id("launchbankbtn")).click();
//    }
//   driver.findElement(By.id("launchbankbtn")).click();
//   driver.navigate().back();
//  
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Nordea Sweden");
//    driver.findElement(By.cssSelector("option[value=\"128\"]")).click();
//   driver.findElement(By.id("launchbankbtn")).click();
//   driver.findElement(By.name("loginBtn")).click();
//    driver.navigate().back();
//   
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Bank 2 Bankaktiebolag");
//    driver.findElement(By.cssSelector("option[value=\"169\"]")).click();
//    if(driver.findElement(By.id("launchbankbtn")).isEnabled()){
//    	driver.findElement(By.id("launchbankbtn")).click();
//    	 driver.navigate().back();
//    	 driver.navigate().refresh();
//    	}
//    	else{
//    	//button is not enabled
//    	//driver.navigate().refresh();
//    		    	}
//    
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("SEB Sweden");
//    driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
//   driver.findElement(By.id("launchbankbtn")).click();
//   driver.findElement(By.name("loginBtn")).click();
//    driver.navigate().back();
    
    
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (org.openqa.selenium.NoSuchElementException e) {
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

