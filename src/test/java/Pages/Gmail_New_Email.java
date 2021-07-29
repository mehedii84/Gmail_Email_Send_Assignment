package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail_New_Email {

    //Step1:
    WebDriver driver;

    //Step2:
    public Gmail_New_Email(WebDriver driver)
    {
        this.driver = driver;
    }

    //Step3:

    //By To_Input = By.xpath("//div[@class='wO nr l1' and name = 'to']");
    By To_Input = By.name("to");
    //By Subject_Input = By.xpath("//div[@class='wO nr']");
    By Subject_Input = By.name("subjectbox");
    By Body_Input = By.xpath("//div[@class='Am Al editable LW-avf tS-tW']");
    By Send_Button = By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");


    //Step 4
    public void SetTo_Input(String arg)
    {
        driver.findElement(To_Input).sendKeys(arg);
    }
    public void SetSubject_Input(String arg)
    {
        driver.findElement(Subject_Input).sendKeys(arg);
    }
    public void SetBody_Input(String arg)
    {
        driver.findElement(Body_Input).sendKeys(arg);
    }
    public void SetSend_Button()
    {
        driver.findElement(Send_Button).click();
    }
}
