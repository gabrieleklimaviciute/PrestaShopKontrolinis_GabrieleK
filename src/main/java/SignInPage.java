import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//input[@id='field-email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='field-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement signInButton;
    @FindBy(css = "[title] .hidden-sm-down")
    private WebElement desktopUserInfo;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }
    public String getTextDesktopUserInfo() {
        return desktopUserInfo.getText();

    }


}
