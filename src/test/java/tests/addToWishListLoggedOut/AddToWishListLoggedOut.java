package tests.addToWishListLoggedOut;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AddToWishListLoggedOut extends BaseTest {
    @Test
    public void addToWishWhileLoggedOut () {
        basePage.open("https://rozetka.com.ua/ua/adidas_4064041101450/p333120067/");
        phoneProductPage.clickWishListButton();
        phoneProductPage.loginWindowOpens();
    }
}
