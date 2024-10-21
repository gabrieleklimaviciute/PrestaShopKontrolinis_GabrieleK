import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(css=".h3.product-title")
    private WebElement productTitle;

//    @FindBy(css="h2 > a")
//    private WebElement secondProductTitle;

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public String getTextProductTitle(){
       return productTitle.getText();
    }

    public void productIsDisplayed(){
        productTitle.isDisplayed();
    }
//    public String getTextSecondProductTitle(){
//        return secondProductTitle.getText();
//    }
}
