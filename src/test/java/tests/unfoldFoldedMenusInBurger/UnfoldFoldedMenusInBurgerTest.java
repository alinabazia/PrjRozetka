package tests.unfoldFoldedMenusInBurger;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class UnfoldFoldedMenusInBurgerTest extends BaseTest {
    @Test
    public void checkIfMenusInBurgerUnfold() {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.openBurgerMenu();
        homePage.openService();
        homePage.serviceUnfolded();
    }
}
