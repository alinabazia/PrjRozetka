package tests.facebookLoginOption;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class FacebookLoginOptionTest extends BaseTest {
    @Test
    public void checkFacebookLoginOption () {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.facebookLogin();
    }
}
