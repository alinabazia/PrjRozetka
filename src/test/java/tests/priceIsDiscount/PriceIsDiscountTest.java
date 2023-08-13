package tests.priceIsDiscount;

import Project.Pages.PhoneProductPage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class PriceIsDiscountTest extends BaseTest {
    @Test
    public void checkIfPriceIsDiscount () {
        basePage.open("https://rozetka.com.ua/ua/samsung-sm-a145flgusek/p370613160/");
        phoneProductPage.verifyDiscountPrice();
    }
}
