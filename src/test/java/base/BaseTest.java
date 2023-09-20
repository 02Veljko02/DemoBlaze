package base;

import common.Navigator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import page.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    protected Navigator navigator;
    @BeforeClass
    public void setUp(){
      driver = new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe" );
      this.backToHomePage();
      driver.manage().window().maximize();
    }
    @BeforeMethod
    public void backToHomePage(){
        driver.get("https://demoblaze.com/");
        homePage = new HomePage(driver);
        navigator = new Navigator(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
