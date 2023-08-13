package Project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertTrue;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By catalog = By.id("fat-menu");
    private final By categoryNotebooks = By.xpath("//div[@cdktrapfocus]//a[text() = 'Ноутбуки та комп’ютери']");
    private final By search = By.cssSelector(".search-form__input.ng-untouched.ng-pristine.ng-valid");
    private final By searchSubmit = By.cssSelector(".button.button_color_green.button_size_medium.search-form__submit");
    private final By voiceInputButton = By.xpath("//*[@class=\"search-form__microphone ng-star-inserted\"]");
    private final By loginButton = By.xpath("//*[@class=\"header-actions__item header-actions__item--user\"]");
    private final By loginEnter = By.xpath("//*[@class=\"button button--large button--green auth-modal__submit ng-star-inserted\"]");
    private final By loginError = By.xpath(" //*[@class=\"error-message ng-star-inserted\"]");
    private final By activeLanguageUa = By.xpath("//*[@class='lang__link lang__link--active ng-star-inserted' and contains(text(), 'UA')]");
    private final By activeLanguageRu = By.xpath("//*[@class='lang__link lang__link--active ng-star-inserted' and contains(text(), 'RU')]");
    private final By inactiveLanguage = By.xpath("//*[@class='lang__link ng-star-inserted']");
    private final By burgerMenu = By.xpath("//*[@class=\"header__button ng-tns-c59-1\"]");
    private final By serviceButton = By.xpath("//*[@id=\"cdk-overlay-0\"]/nav/div/div[2]/ul[2]/li[2]/rz-service-links/div[3]/div/button");
    private final By aboutUs = By.xpath("//*[@class=\"ng-tns-c56-2\" and contains(text(), 'Про нас')]");
    private final By emptySearch = By.xpath("//*[@class=\"catalog-empty\"]");
    private final By twitterIcon = By.xpath("//rz-main-page-sidebar//a[@class=\"socials__link socials__link--twitter\"]");

    public HomePage openCategoryNotebooks() {
        driver.findElement(catalog).click();
        driver.findElement(categoryNotebooks).click();
        return this;
    }
    public HomePage searchWrongKeyboardLayout() {
        driver.findElement(search).sendKeys("dtynbkznjh");
        driver.findElement(searchSubmit).click();
        return this;
    }
    public HomePage detectVoiceInputButton() {
        final WebElement voiceInputButtonElement = driver.findElement(voiceInputButton);
        assertTrue(voiceInputButtonElement.isDisplayed(), "Voice input button isn't present");
        return this;
    }
    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return this;
    }
    public HomePage enterWrongCredentials() {
        final WebElement loginEnterElement = driver.findElement(loginEnter);
        waitElementIsVisible(loginEnterElement);
        driver.findElement(loginEnter).click();
        return this;
    }
    public HomePage errorIsVisible() {
        final WebElement loginErrorElement = driver.findElement(loginError);
        waitElementIsVisible(loginErrorElement);
        assertTrue(loginErrorElement.isDisplayed(), "Error is not displayed");
        return this;
    }
    public HomePage verifyDefaultLanguage () {
        final WebElement activeLanguageUaElement = driver.findElement(activeLanguageUa);
        waitElementIsVisible(activeLanguageUaElement);
        assertTrue(activeLanguageUaElement.isDisplayed(), "Ukrainian is not a default language");
        return this;
    }
    public HomePage changeLanguageToRu() {
        final WebElement inactiveLanguageElement = driver.findElement(inactiveLanguage);
        driver.findElement(inactiveLanguage).click();
        final WebElement activeLanguageRuElement = driver.findElement(activeLanguageRu);
        waitElementIsVisible(activeLanguageRuElement);
        assertTrue(activeLanguageRuElement.isDisplayed(), "Language is not changed");
        return this;
    }
    public HomePage openBurgerMenu() {
        final WebElement burgerMenuElement = driver.findElement(burgerMenu);
        waitElementIsVisible(burgerMenuElement);
        driver.findElement(burgerMenu).click();
        return this;
    }
    public HomePage openService() {
        final WebElement serviceButtonElement = driver.findElement(serviceButton);
        waitElementIsVisible(serviceButtonElement);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END);
        actions.perform();
        driver.findElement(serviceButton).click();
        return this;
    }
    public HomePage serviceUnfolded() {
        final WebElement aboutUsElement = driver.findElement(aboutUs);
        waitElementIsVisible(aboutUsElement);
        assertTrue(aboutUsElement.isDisplayed(),"Services didn't unfold");
        return this;
    }
    public HomePage sendEmptySearch() {
        final WebElement searchSubmitElement = driver.findElement(searchSubmit);
        waitElementIsVisible(searchSubmitElement);
        driver.findElement(searchSubmit).click();
        return this;
    }
    public HomePage verifyEmptySearchResults() {
        final WebElement emptySearchElement = driver.findElement(emptySearch);
        waitElementIsVisible(emptySearchElement);
        assertTrue(emptySearchElement.isDisplayed(), "Search results are not empty");
        return this;
    }
    public HomePage twitterIconVisible() {
        final WebElement twitterIconElement = driver.findElement(twitterIcon);
        waitElementIsVisible(twitterIconElement);
        assertTrue(twitterIconElement.isDisplayed(), "Twitter icon is not displayed");
        return this;
    }
}