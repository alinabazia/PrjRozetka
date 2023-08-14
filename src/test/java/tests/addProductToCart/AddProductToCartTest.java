package tests.addProductToCart;

import Project.Pages.SneakerProductPage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AddProductToCartTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkIfProductIsAddedToTheCart () {
        basePage.open("https://rozetka.com.ua/ua/adidas_4064041101450/p333120067/");
        sneakerProductPage.BuySneakers();
        sneakerProductPage.closeCartWindow();
        sneakerProductPage.verifyCartQuantity();
    }
}
