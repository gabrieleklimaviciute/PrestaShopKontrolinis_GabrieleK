import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PageTest extends BaseTest {

    @Test
    void signUpTest() {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);

        MainPage mainPage = new MainPage(driver);
        mainPage.clickSignIn();
        mainPage.clickCreateAccount();

        SignUpPage signUp = new SignUpPage(driver);
        signUp.clickMrs();
        signUp.inputFirstname("Gabrielė");
        signUp.inputLastname("Testauskaitė");
        signUp.inputEmail("gabriele.testauskaite" + randomNumber + "@kontrolinis.lt");
        signUp.inputPassword("P4$$wordK0ntr0lini$_123");
        signUp.inputBirthday("10/21/1970");
        signUp.clickTermsAndConditions();
        signUp.clickDataPrivacy();
        signUp.clickSubmitButton();

        String expectedUserInfo = "Gabrielė Testauskaitė";
        String actualUserInfo = signUp.getTextSignedUserinfoField();
        assertEquals(expectedUserInfo, actualUserInfo, "Sign Up is only successful if user is: " + expectedUserInfo);
        signUp.clickSignOut();

    }

    @Test
    void SignInTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSignIn();
        SignInPage signIn = new SignInPage(driver);
        signIn.inputEmail("gabriele.testauskaite@kontrolinis.lt");
        signIn.inputPassword("P4$$wordK0ntr0lini$_123");
        signIn.clickSignInButton();

        String expectedUserInfo = "Gabrielė Testauskaitė";
        String actualUserInfo = signIn.getTextDesktopUserInfo();
        assertEquals(expectedUserInfo, actualUserInfo, "Sign Up is only successful if user is: " + expectedUserInfo);

    }

    //BONUS TASK

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/products.csv", numLinesToSkip = 1)
    void csvFileTestFromFile(String Product, double Price, int Discount, String Size) {
        assertNotNull(Product);
        assertNotNull(Size);
        MainPage mainPage = new MainPage(driver);
        mainPage.enterBonusSearchField(Product);

        ProductPage productPage = new ProductPage(driver);
        productPage.productIsDisplayed();

        String expectedProductName = "Hummingbird Printed T-Shirt";
        String actualProductName = productPage.getTextProductTitle();
        assertEquals(expectedProductName, actualProductName, "Product name is not correct, name should be: " + expectedProductName);


//        String expectedSecondProductName = "Hummingbird Printed Sweater";
//        String actualSecondProductName = productPage.getTextProductTitle();
//        assertEquals(expectedSecondProductName, actualSecondProductName, "Product name is not correct, name should be: " + expectedProductName);


    }


}
