package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage {
    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='signup-form']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement newUserNameBox;

    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement newUserEMailBox;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[2]")
    public WebElement signUpButton;















}
