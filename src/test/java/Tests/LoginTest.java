package Tests;

import TestBase.TestBase;
import Utilities.ReadProperity;
import driver.driverAction;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.util.Properties;

public class LoginTest extends TestBase {
    pageObjects.LoginPage loginPage;
    ReadProperity currencyListFile = new ReadProperity();
    Properties prop;


    @Test
    public void loginAsUser() {
        loginPage = new LoginPage(driverAction.driver);
        loginPage.enterUserName(config.getProperty("Username"));
        loginPage.enterPassword(config.getProperty("Password"));
        loginPage.clickOnLogin();
        loginPage.skippingForTest();
        AssertJUnit.assertEquals("https://qa-test-frontend-ce07bae316f3.herokuapp.com/events" , driverAction.getCurrentUrl() );

    }


}
