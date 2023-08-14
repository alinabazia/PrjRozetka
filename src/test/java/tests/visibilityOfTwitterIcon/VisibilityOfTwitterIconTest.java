package tests.visibilityOfTwitterIcon;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class VisibilityOfTwitterIconTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkIfTwitterIconIsVisible () {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.twitterIconVisible();
    }
}
