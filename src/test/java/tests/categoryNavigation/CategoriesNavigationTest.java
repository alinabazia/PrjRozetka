package tests.categoryNavigation;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.time.Duration;

public class CategoriesNavigationTest extends BaseTest {
   @Test(groups = "PositiveTest")
    public void checkIfCategoryPageOpens () {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.openCategoryNotebooks();
        categoryComputers.categoryComputersTitleBoxVisible();
    }
}
