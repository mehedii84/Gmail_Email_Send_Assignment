package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enter_Email {
    //Step1:
    WebDriver driver;

    //Step2:
    public Enter_Email(WebDriver driver)
    {
        this.driver = driver;
    }

    //Step3:
    By Enter_Email_Input = By.xpath("//*[@id=\"identifierId\"]");
    By Next_Button = By.xpath("//span[@class='VfPpkd-vQzf8d']");


    //Step 4
    public void SetEnter_Email_Input(String arg)
    {
        driver.findElement(Enter_Email_Input).sendKeys(arg);
    }

    public void SetNext_Button()
    {
        driver.findElement(Next_Button).click();
    }


}
