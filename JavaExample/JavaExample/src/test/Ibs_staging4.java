import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Ibs_staging4 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
   System.setProperty("webdriver.gecko.driver", "C:\\QA INSTALL\\geckodriver.exe");
 //   driver = new InternetExplorerDriver();
   	driver = new FirefoxDriver();
    baseUrl = "http://192.168.103.129:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHttpsStaging4() throws Exception {
    driver.get(baseUrl + "/internetbanking/index.form");
    new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTPS");
    new Select(driver.findElement(By.id("override_store_id"))).selectByVisibleText("Branded - IS34926840");
    new Select(driver.findElement(By.id("theme"))).selectByVisibleText("buymyevoucher");
    driver.findElement(By.id("submit_button")).click();
    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Swedbank");
    driver.findElement(By.cssSelector("option[value=\"59\"]")).click();
    driver.findElement(By.id("launchbankbtn")).click();
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
	 // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	//capabilities.setCapability("marionette", true);
	//WebDriver driver = new FirefoxDriver(capabilities);
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
