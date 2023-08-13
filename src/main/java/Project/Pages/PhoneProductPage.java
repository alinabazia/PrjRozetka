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
}
