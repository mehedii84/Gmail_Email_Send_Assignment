package Browser_Management;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BrowserManager{

    public static WebDriver getDriver(String browser_type, String Gmail_URL) {
        WebDriver driver = null;

        if (browser_type.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser_type.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browser_type.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            Assert.assertTrue(false, "No Browser Type Sent");
        }

        driver.manage().window().maximize();
        driver.get(Gmail_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}
