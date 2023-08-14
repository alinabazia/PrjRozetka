package tests.loginWithWrongCredentials;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginWithWrongCredentialsTest extends BaseTest {
    @Test(groups = "NegativeTest")
    public void logInWithWrongCreds() {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.clickLoginButton();
        homePage.enterWrongCredentials();
        homePage.errorIsVisible();
    }
}
