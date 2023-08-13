package Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class SneakerProductPage extends BasePage {
    public SneakerProductPage(WebDriver driver) {
        super(driver);
    }

    private final By size38 = By.xpath("//*[@class='ng-star-inserted' and contains(text(),'38 ')]");
    private final By productCode = By.xpath("//*[@class='product-about__right']//*[@class='product__code-accent' and contains(text(), '333120058')]");
    private final By buyButton = By.xpath("//*[@class=\"buy-button button button--with-icon button--green button--medium buy-button--tile ng-star-inserted\"]");
    private final By closeButton = By.xpath("//*[@class=\"modal__close\"]");
    private final By cartGoodsQuantity = By.xpath("//*[@class=\"badge badge--green ng-star-inserted\" and contains(text(), '1')]");

    public SneakerProductPage changeSizeTo38() {
        driver.findElement(size38).click();
        return this;
    }

    public SneakerProductPage BuySneakers() {
        driver.findElement(buyButton).click();
        return this;
    }

    public SneakerProductPage productCodeIsVisible() {
        final WebElement productCodeElement = driver.findElement(productCode);
        waitElementIsVisible(productCodeElement);
        assertTrue(productCodeElement.isDisplayed(), "Correct product code is not displayed");
        return this;
    }

    public SneakerProductPage closeCartWindow() {
        final WebElement closeButtonElement = driver.findElement(closeButton);
        waitElementIsVisible(closeButtonElement);
        driver.findElement(closeButton).click();
        return this;
    }

    public SneakerProductPage verifyCartQuantity() {
        final WebElement cartGoodsQuantityElement = driver.findElement(cartGoodsQuantity);
        waitElementIsVisible(cartGoodsQuantityElement);
        assertTrue(cartGoodsQuantityElement.isDisplayed(), "Product wasn't added to the cart");
        return this;
    }
}