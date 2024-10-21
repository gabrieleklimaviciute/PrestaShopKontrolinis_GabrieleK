import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

    @FindBy(css = "[for='field-id_gender-2']")
    private WebElement mrsField;

    @FindBy(xpath = "//input[@id='field-firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='field-lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='field-email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='field-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='field-birthday']")
    private WebElement birthdayField;

    @FindBy(xpath = "//input[@name='psgdpr']")
    private WebElement termsAndConditionsCheckBox;

    @FindBy(xpath = "//input[@name='customer_privacy']")
    private WebElement dataPrivacyCheckBox;

    @FindBy(xpath = "//form[@id='customer-form']//button[@type='submit']")
    private WebElement submitAccountButton;

    @FindBy(css = "[title] .hidden-sm-down")
    private WebElement signedUserinfoField;

    @FindBy(css = ".user-info [rel='nofollow']:nth-of-type(1)")
    private WebElement signOutField;


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickMrs() {
        mrsField.click();
    }

    public void inputFirstname(String firstname) {
        firstNameField.sendKeys(firstname);
    }

    public void inputLastname(String lastname) {
        lastNameField.sendKeys(lastname);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputBirthday(String birthday) {
        birthdayField.sendKeys(birthday);
    }

    public void clickTermsAndConditions() {
        termsAndConditionsCheckBox.click();
    }

    public void clickDataPrivacy() {
        dataPrivacyCheckBox.click();
    }

    public void clickSubmitButton() {
        submitAccountButton.click();
    }

    public String getTextSignedUserinfoField() {
        return signedUserinfoField.getText();

    }
    public void clickSignOut(){
        signOutField.click();
    }

}

