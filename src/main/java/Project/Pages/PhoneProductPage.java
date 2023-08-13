package Project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertTrue;
public class PhoneProductPage extends BasePage {
    public PhoneProductPage(WebDriver driver) {
        super(driver);
    }
    private final By pickUpPointMapButton = By.xpath("/html/body/app-root/div/div/rz-product/div/rz-product-tab-main/div[1]/div[1]/div[2]/rz-product-main-info/rz-product-delivery/div/rz-delivery-list/div/ul/li[1]/div[2]/div[3]/a");
    private final By pickUpPointMap = By.xpath("//*[@class=\"modal-map__map\"]");
    private final By phonePrice = By.xpath("//*[@class=\"product-price__big product-price__big-color-red\"]");
    private final By phoneBlack = By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/rz-var-parameters/rz-var-parameter-option/div/div/ul/li[1]/rz-var-parameter-option-item/a");
    private final By phoneBlackProductCode = By.xpath("//*[@class='product-about__right']//*[@class='product__code-accent' and contains(text(), '370613178')]");
    private final By wishListButton = By.xpath("//*[@class=\"product-about__right\"]//* [@class=\"wish-button js-wish-button ng-star-inserted\"]");
    private final By loginEnter = By.xpath("//*[@class=\"button button--large button--green auth-modal__submit ng-star-inserted\"]");

    public PhoneProductPage clickPickUpMapButton () {
        final WebElement pickUpPointMapButtonElement = driver.findElement(pickUpPointMapButton);
        waitElementIsVisible(pickUpPointMapButtonElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(pickUpPointMapButtonElement);
        actions.perform();
        driver.findElement(pickUpPointMapButton).click();
        return this;
    }
    public PhoneProductPage verifyPickUpMap () {
        final WebElement pickUpPointMapElement = driver.findElement(pickUpPointMap);
        waitElementIsVisible(pickUpPointMapElement);
        assertTrue(pickUpPointMapElement.isDisplayed(), "Pickup point map is not displayed");
        return this;
    }
    public PhoneProductPage verifyDiscountPrice () {
        final WebElement phonePriceElement = driver.findElement(phonePrice);
        assertTrue(phonePriceElement.isDisplayed(), "Price is not discount");
        return this;
    }
    public PhoneProductPage changeColor () {
        final WebElement phoneBlackElement = driver.findElement(phoneBlack);
        waitElementIsVisible(phoneBlackElement);
        driver.findElement(phoneBlack).click();
        return this;
    }
    public PhoneProductPage verifyPhoneProductCode () {
        final WebElement phoneBlackProductCodeElement = driver.findElement(phoneBlackProductCode);
        waitElementIsVisible(phoneBlackProductCodeElement);
        assertTrue(phoneBlackProductCodeElement.isDisplayed(), "Product code for black phone is incorrect");
        return this;
    }
    public PhoneProductPage clickWishListButton () {
        final WebElement wishListButtonElement = driver.findElement(wishListButton);
        waitElementIsVisible(wishListButtonElement);
        driver.findElement(wishListButton).click();
        return this;
    }
    public PhoneProductPage loginWindowOpens () {
        final WebElement loginEnterElement = driver.findElement(loginEnter);
        waitElementIsVisible(loginEnterElement);
        assertTrue(loginEnterElement.isDisplayed(), "Login window is missing");
        return this;
    }

}
