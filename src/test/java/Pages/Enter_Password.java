package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enter_Password {

    WebDriver driver;

    //Step2:
    public Enter_Password(WebDriver driver)
    {
        this.driver = driver;
    }

    //Step3:
    By Enter_Password_Input = By.xpath("//input[@name='password']");
    By Next_Button = By.xpath("//span[@class='VfPpkd-vQzf8d']");


    //Step 4
    public void SetEnter_Password_Input(String arg)
    {
        driver.findElement(Enter_Password_Input).sendKeys(arg);
    }

    public void SetNext_Button()
    {
        driver.findElement(Next_Button).click();
    }
}
