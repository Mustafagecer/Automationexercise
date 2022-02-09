package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    public WebElement homePageSegments;

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement  signupLogin;

    @FindBy(xpath = "//*[@class='fa fa-user']")
    public WebElement loggedInAsUsername;

    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement  deleteAccount;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement  deleteAccountPageDelete;


}
