package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    @Parameters("browserTipi")
    public void baslangicIslemler(String browserTipi) {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        switch (browserTipi.toLowerCase())
        {
            case "firefox" :
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver();
                System.out.println("firefox started");
                break;

            case "safari":
                driver=new SafariDriver();
                break;

            case "edge":
                driver=new EdgeDriver();
                break;

            default:
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);



        Logger logger2= Logger.getLogger("");
        logger2.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        Duration dr2=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr2);
        driver.manage().timeouts().implicitlyWait(dr2);

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        loginTest();
    }


    void loginTest()
    {
        System.out.println("Login Test");

        driver.get("https://admin-demo.nopcommerce.com/login?");

//        WebElement inputEmail=driver.findElement(By.id("input-email"));
//        inputEmail.sendKeys("kcaglar055@gmail.com");
//
//        WebElement password=driver.findElement(By.id("input-password"));
//        password.sendKeys("Kd352347");
//
        WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
//
//        Assert.assertTrue(driver.getTitle().equals("My Account"));
//        //Assert.assertEquals(driver.getTitle(),"My Account", "Login olamadı");
//        //Assert.assertTrue(driver.getCurrentUrl().contains("account/account"));
    }


    @AfterClass
    public void bitisIslemleri()
    {
        Tools.Bekle(5);
        driver.quit();
    }
}
