package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.AddToCart;
import pageObjects.LoginPage;
import pageObjects.SearchProduct;
import utilities.ReadConfig;

import java.time.Duration;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();
    Logger logger;

    public WebDriver driver;
    public LoginPage lp;
    public SearchProduct search;
    public AddToCart add;


    @BeforeClass
    public void setup()
    {
        String br = readConfig.getBrowser();
        switch(br.toLowerCase())
        {
            case "chrome":  driver = new ChromeDriver(); break;
            case "edge": driver = new EdgeDriver(); break;
            case "firefox": driver = new FirefoxDriver(); break;
            default: System.out.println("Invalid browser");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger = LogManager.getLogger(this.getClass());
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    public WebElement expicitWait (By locator)
    {
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }



}
