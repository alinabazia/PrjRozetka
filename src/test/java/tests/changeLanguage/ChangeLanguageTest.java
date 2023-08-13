package tests.changeLanguage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ChangeLanguageTest extends BaseTest {
    @Test
    public void checkIfLanguageChanges() {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.changeLanguageToRu();
    }
}
