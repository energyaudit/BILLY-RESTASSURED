import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibs_staging3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	//  System.setProperty("webdriver.gecko.driver", "C:\\QA INSTALL\\geckodriver.exe");
   // driver = new FirefoxDriver();
		
		  String exePath = "C:\\QA INSTALL\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", exePath);
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    baseUrl = "http://192.168.103.129:8080/";
	 driver.get(baseUrl + "/internetbanking/index.form");
	 	   }

  @Test
  public void testHttpsStaging3() throws Exception {
   // driver.get(baseUrl + "/internetbanking/index.form");
	 driver.findElement(By.id("submit_button")).click();
    driver.findElement(By.id("launchbankbtn")).click();
    driver.findElement(By.name("auth:avbryt_knapp")).click();
    driver.findElement(By.id("yes")).click();
    driver.findElement(By.cssSelector("span")).click();
    driver.findElement(By.id("submit_button")).click();
    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Forex Bank");
    driver.findElement(By.cssSelector("option[value=\"53\"]")).click();
    driver.findElement(By.id("launchbankbtn")).click();
    driver.findElement(By.cssSelector("input.pa_changebankbtn.ChangeBankButton")).click();
    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Marginalen Bank");
    driver.findElement(By.cssSelector("option[value=\"169\"]")).click();
    driver.findElement(By.id("launchbankbtn")).click();
    driver.findElement(By.name("continueBtn")).click();
    driver.findElement(By.linkText("Chat Now")).click();
    driver.findElement(By.name("btnBack")).click();
    driver.findElement(By.name("btnCancel")).click();
    driver.findElement(By.id("no")).click();
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
