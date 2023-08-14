package tests.homePageLogo;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class HomePageLogoTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkRozetkaLogo () {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.rozetkaLogoIsVisible();
    }
}
