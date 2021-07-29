package Tests;
import Browser_Management.BrowserManager;
import Pages.Enter_Email;
import Pages.Enter_Password;
import Pages.Gmail_HomePage;
import Pages.Gmail_New_Email;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass {

    @BeforeClass
    public  void Setup()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void GmailTest() throws InterruptedException {

        String Gmail_URL="https://mail.google.com/";
        WebDriver driver = BrowserManager.getDriver("firefox",Gmail_URL);

        Enter_Email obj = new Enter_Email(driver);
        obj.SetEnter_Email_Input("mehedisp24@gmail.com");
        obj.SetNext_Button();

        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Enter_Password obj1 = new Enter_Password(driver);
        obj1.SetEnter_Password_Input("MEHed!2019**");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1500);
        obj1.SetNext_Button();

        Thread.sleep(10000);
        Gmail_HomePage obj2 = new Gmail_HomePage(driver);
        obj2.SetCompose_Button();

        Thread.sleep(2000);
        Gmail_New_Email obj3 = new Gmail_New_Email(driver);
        obj3.SetTo_Input("mehedisp20@gmail.com");
        Thread.sleep(1000);
        obj3.SetSubject_Input("Test Automation Email");
        Thread.sleep(1000);
        obj3.SetBody_Input("This is a demo Automation Email");
        Thread.sleep(2000);
        obj3.SetSend_Button();


        Thread.sleep(5000);
        obj2.SetSent_Button();


    }
}
