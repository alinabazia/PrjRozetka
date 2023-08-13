package tests.shoeSizeChange;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ShoeSizeChangeTest extends BaseTest {
    @Test
    public void checkIfShoeSizeChanges () {
        basePage.open("https://rozetka.com.ua/ua/adidas_4064041101450/p333120067/");
        sneakerProductPage.changeSizeTo38();
        sneakerProductPage.productCodeIsVisible();
    }
}
