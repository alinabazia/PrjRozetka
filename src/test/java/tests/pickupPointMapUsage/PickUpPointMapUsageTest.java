package tests.pickupPointMapUsage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class PickUpPointMapUsageTest extends BaseTest {
    @Test
    public void checkIfPickUpPointMapOpens () {
        basePage.open("https://rozetka.com.ua/ua/samsung-sm-a145flgusek/p370613160/");
        phoneProductPage.clickPickUpMapButton();
        phoneProductPage.verifyPickUpMap();
    }
}
