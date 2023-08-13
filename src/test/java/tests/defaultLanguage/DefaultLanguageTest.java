package tests.defaultLanguage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DefaultLanguageTest extends BaseTest {
    @Test
    public void checkDefaultLanguage () {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.verifyDefaultLanguage();
    }
}
