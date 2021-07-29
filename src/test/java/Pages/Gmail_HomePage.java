package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail_HomePage {

    //Step1:
    WebDriver driver;

    //Step2:
    public Gmail_HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Step3:

    By Compose_Button = By.xpath("//div[@class = 'T-I T-I-KE L3']");
    By Sent_Button=By.xpath("//a[contains(text(),'Sent')]");

    //Step 4

    public void SetCompose_Button()
    {
        driver.findElement(Compose_Button).click();
    }

    public void SetSent_Button()
    {
        driver.findElement(Sent_Button).click();
    }
}
