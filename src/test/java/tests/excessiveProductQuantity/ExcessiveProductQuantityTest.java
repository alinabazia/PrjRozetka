package tests.excessiveProductQuantity;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ExcessiveProductQuantityTest extends BaseTest {
    @Test
    public void addExcessiveQuantityOfProductToCart() {
        basePage.open("https://rozetka.com.ua/ua/adidas_4064041101450/p333120067/");
        sneakerProductPage.BuySneakers();
        sneakerProductPage.inputProductQuantity();
        sneakerProductPage.checkProductQuantityError();
    }
}
