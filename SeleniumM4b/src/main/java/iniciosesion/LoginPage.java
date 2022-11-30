package iniciosesion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement  userPassword;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement btnlogin;

    public void login(String user, String password){
        userName.sendKeys(user);
        userPassword.sendKeys(password);
        btnlogin.click();
    }
}
