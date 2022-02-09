package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewUserCreationPage {
    public NewUserCreationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(*//*[@class='title text-center'])[1]")
    public WebElement enterAccountInfoText;

    @FindBy(id = "id_gender1")
    public WebElement titleMrCircle;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement birthDateDay;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement birthDateMonth;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement birthDateYear;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement signUpForOurNewsletterChechbox;

    @FindBy(id = "optin")
    public WebElement recieveSpecialChechbox;

    @FindBy(id = "first_name")
    public WebElement firstNameBox;

    @FindBy(id = "last_name")
    public WebElement lastNameBox;

    @FindBy(id = "company")
    public WebElement companyBox;

    @FindBy(id = "address1")
    public WebElement address1Box;

    @FindBy(id = "address2")
    public WebElement address2Box;

    @FindBy(id = "country")
    public WebElement countryDropDown;

    @FindBy(id = "state")
    public WebElement stateBox;

    @FindBy(id = "city")
    public WebElement cityBox;

    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement createAccountBox;

}
