import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(css = "div#_desktop_user_info .hidden-sm-down")
    private WebElement signIn;

    @FindBy(css = "[data-link-action='display-register-form']")
    private WebElement createOneHereField;

    @FindBy(css="input[name='s']")
    private WebElement bonusSearchField;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn() {
        signIn.click();
    }

    public void clickCreateAccount() {
        createOneHereField.click();
    }

    public void enterBonusSearchField(String product) {
        bonusSearchField.sendKeys(product);
        bonusSearchField.sendKeys(Keys.ENTER);
    }
}
