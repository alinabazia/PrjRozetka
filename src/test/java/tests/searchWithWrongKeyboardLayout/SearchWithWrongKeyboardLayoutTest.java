package tests.searchWithWrongKeyboardLayout;

import Project.Pages.HomePage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchWithWrongKeyboardLayoutTest extends BaseTest {
    @Test(groups = "NegativeTest")
    public void checkIfSearchFixesWrongLayout() {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.searchWrongKeyboardLayout();
        searchResultsFan.correctLayoutSearchResult();
    }
}