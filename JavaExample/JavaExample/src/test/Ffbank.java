import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Ffbank {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 System.setProperty("webdriver.gecko.driver", "C:\\QA INSTALL\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.103.129:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFFSelectBank() throws Exception {
    driver.get(baseUrl + "/internetbanking/index.form");
    new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV");
    new Select(driver.findElement(By.id("override_store_id"))).selectByVisibleText("Branded - IS34926840");
    driver.findElement(By.id("submit_button")).click();
    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Forex Bank");
  //  driver.findElement(By.cssSelector("option[value=\"53\"]")).click();
    driver.findElement(By.id("launchbankbtn")).click();
  }

  @After
  public void tearDown() throws Exception {
   // driver.quit();
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
