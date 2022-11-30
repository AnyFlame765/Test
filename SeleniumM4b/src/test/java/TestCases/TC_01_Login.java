package TestCases;

import iniciosesion.CommonMethods;
import iniciosesion.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import setupDriver.DriverSetup;
import variablesGlobales.VariablesLocales;

public class TC_01_Login {
    WebDriver driver = DriverSetup.SetupChromeDriver();
    LoginPage login = new LoginPage(driver);

    @BeforeTest
    public void startWebDriver(){
        driver.get(VariablesLocales.HOME_PAGE);
    }
    @Test
    public void TC_01(){
        login.login(VariablesLocales.USER_ADMIN, VariablesLocales.USER_PASS);
    }

    @AfterTest
    public void closeWebDriver() throws InterruptedException{
        Thread.sleep(2000);
        CommonMethods.takeSS(driver, "TC_01_Login");
        Thread.sleep(4000);
        driver.close();
    }
}
