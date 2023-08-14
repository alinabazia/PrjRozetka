package tests.sendEmptySearchQuery;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SendEmptySearchQueryTest extends BaseTest {
    @Test(groups = "NegativeTest")
    public void checkIfSearchResultIsEmpty() {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.sendEmptySearch();
        homePage.verifyEmptySearchResults();
    }
}
