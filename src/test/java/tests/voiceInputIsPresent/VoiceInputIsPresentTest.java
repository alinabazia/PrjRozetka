package tests.voiceInputIsPresent;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class VoiceInputIsPresentTest extends BaseTest {
    @Test(groups = "PositiveTest")
    public void checkIfVoiceInputOpens() {
        basePage.open("https://rozetka.com.ua/ua/");
        homePage.detectVoiceInputButton();
    }
}
