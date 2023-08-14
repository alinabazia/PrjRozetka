package tests.clickNextImage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ClickNextImageTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkIfImageChanges() {
        basePage.open("https://rozetka.com.ua/ua/samsung-sm-a145flgusek/p370613160/");
        phoneProductPage.nextImage();
        phoneProductPage.activeImage();
    }
}
