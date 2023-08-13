package tests.clearShoppingCart;

import Project.Pages.SneakerProductPage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ClearShoppingCartTest extends BaseTest {
    @Test
    public void deleteProductFromCart () {
        basePage.open("https://rozetka.com.ua/ua/adidas_4064041101450/p333120067/");
        sneakerProductPage.BuySneakers();
        sneakerProductPage.deleteProduct();
        sneakerProductPage.verifyCartIsEmpty();
    }
}
