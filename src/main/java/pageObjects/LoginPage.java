package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "username")
    WebElement UserName;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement LoginBtn;

    @FindBy(xpath ="//button[text()='Skip (only for testing)']")
    WebElement Skip;
    //Initializing the Page Objects:
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //actions
    public void enterUserName(String username) {
        UserName.sendKeys(username);
    }
    public void enterPassword(String password) {Password.sendKeys(password);}
    public void clickOnLogin() {LoginBtn.click();}
    public void skippingForTest(){ Skip.click();}


    }


