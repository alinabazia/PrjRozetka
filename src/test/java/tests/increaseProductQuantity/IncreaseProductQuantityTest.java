package tests.increaseProductQuantity;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class IncreaseProductQuantityTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkIfProductQuantityChanges () {
        basePage.open("https://rozetka.com.ua/ua/adidas_4064041101450/p333120067/");
        sneakerProductPage.BuySneakers();
        sneakerProductPage.increaseProductQuantity();
        sneakerProductPage.verifyCartIncreasedQuantity();

    }
}
