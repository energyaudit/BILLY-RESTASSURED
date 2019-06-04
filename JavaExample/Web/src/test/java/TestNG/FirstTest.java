package TestNG;


import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;


public class FirstTest {

    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;


  //  public String testURL = "http://www.swtestacademy.com/";
    public String testURL = "http://www.51.ca";

    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest (){
        System.setProperty("webdriver.chrome.driver", "C:\\QA INSTALL\\chromedriver.exe");
        driver = new ChromeDriver();

        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }

    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () {
        //Get page title
        String title = driver.getTitle();

        //Print page's title
        System.out.println("Page Title: " + title);


       Assert.assertEquals(title, "加国无忧 - 加拿大华人网上家园", "Title assertion is failed!");
    }

    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){

        driver.quit();
    }
}