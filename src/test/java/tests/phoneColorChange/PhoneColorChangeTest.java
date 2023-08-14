package tests.phoneColorChange;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class PhoneColorChangeTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkIfColorChanges() {
        basePage.open("https://rozetka.com.ua/ua/samsung-sm-a145flgusek/p370613160/");
        phoneProductPage.changeColor();
        phoneProductPage.verifyPhoneColor();
    }
}
