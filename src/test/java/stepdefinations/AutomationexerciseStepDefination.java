package stepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.AccountCreatedPage;
import pages.HomePage;
import pages.NewUserCreationPage;
import pages.SignupPage;
import utilities.Driver;
import utilities.JSUtils;

public class AutomationexerciseStepDefination {
    HomePage homePage =new HomePage();
    SignupPage signupPage=new SignupPage();
    NewUserCreationPage newUserCreationPage=new NewUserCreationPage();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();
    JSUtils jsUtils=new JSUtils();
    Faker faker=new Faker();

    @When("Launch browser")
    public void launch_browser() {

    }
    @Then("Navigate to url {string}")
    public void navigate_to_url(String url) {
        Driver.getDriver().get(url);
    }


    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(homePage.homePageSegments.isDisplayed());

    }
    @Then("Click on {string} button")
    public void click_on_button(String click) {

        homePage.signupLogin.click();

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String newUserSignup) throws InterruptedException {
        Thread.sleep(2000);
        //Assert.assertTrue(signupPage.newUserSignupText.isEnabled());

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        signupPage.signUpButton.sendKeys(faker.name().fullName());
        signupPage.newUserEMailBox.sendKeys(faker.internet().emailAddress());

    }
    @Then("Click {string} button")
    public void click_button(String signUpButton) {
        signupPage.signUpButton.click();


    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String newUserSignupText) throws InterruptedException {
        Thread.sleep(2000);
       // Assert.assertTrue(signupPage.newUserSignupText.isEnabled());


    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        newUserCreationPage.titleMrCircle.click();
        newUserCreationPage.passwordBox.sendKeys(faker.internet().password());
        Select select=new Select(newUserCreationPage.birthDateDay);
        select.selectByVisibleText("18");
        select=new Select(newUserCreationPage.birthDateMonth);
        select.selectByVisibleText("January");
        select=new Select(newUserCreationPage.birthDateYear);
        select.selectByVisibleText("2000");
    }



    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

        newUserCreationPage.firstNameBox.sendKeys(faker.name().firstName());
        newUserCreationPage.lastNameBox.sendKeys(faker.name().lastName());
        newUserCreationPage.companyBox.sendKeys(faker.company().name());
        newUserCreationPage.address1Box.sendKeys(faker.address().fullAddress());
        Select select=new Select(newUserCreationPage.countryDropDown);
        select.selectByVisibleText("India");
        newUserCreationPage.stateBox.sendKeys(faker.address().state());
        newUserCreationPage.cityBox.sendKeys(faker.address().city());
        newUserCreationPage.zipcodeBox.sendKeys(faker.address().zipCode());
        newUserCreationPage.mobileNumberBox.sendKeys(faker.phoneNumber().cellPhone());


    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        newUserCreationPage.createAccountBox.click();
    }

    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {

    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(accountCreatedPage.accountCreatedText.isDisplayed());
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        accountCreatedPage.continueBox.click();
    }


    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        Assert.assertTrue(homePage.loggedInAsUsername.isEnabled());
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        homePage.deleteAccount.click();
        homePage.deleteAccountPageDelete.click();

    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {


    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        newUserCreationPage.signUpForOurNewsletterChechbox.click();


    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        newUserCreationPage.recieveSpecialChechbox.click();
    }

    @Then("Navigate to url http:\\/\\/automationexercise.com")
    public void navigateToUrlHttpAutomationexerciseCom() {
    }
}
