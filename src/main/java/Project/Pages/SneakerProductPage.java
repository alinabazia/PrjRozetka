package Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class SneakerProductPage extends BasePage {
    public SneakerProductPage(WebDriver driver) {
        super(driver);
    }

    private final By size38Button = By.xpath("//*[@class='ng-star-inserted' and contains(text(),'38 ')]");
    private final By productSize = By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/rz-var-parameters/rz-var-parameter-option/div/p[contains(text(), '38')]");
    private final By buyButton = By.xpath("//*[@class=\"buy-button button button--with-icon button--green button--medium buy-button--tile ng-star-inserted\"]");
    private final By closeButton = By.xpath("//*[@class=\"modal__close\"]");
    private final By cartGoodsQuantity = By.xpath("//*[@class=\"badge badge--green ng-star-inserted\" and contains(text(), '1')]");
    private final By cart = By.xpath("//*[@class=\"header__button header__button--active ng-star-inserted\"]");
    private final By cartIncrement = By.xpath("//*[@data-testid=\"cart-counter-increment-button\"]");
    private final By cartOptions = By.xpath("//*[@class=\"button button--white button--small popup-menu__toggle popup-menu__toggle--context\"]");
    private final By cartGoodsQuantityIncreased = By.xpath("//*[@class=\"badge badge--green ng-star-inserted\" and contains(text(), '2')]");
    private final By productDelete = By.xpath("//*[@class=\"button button--medium button--with-icon button--link\"]");
    private final By emptyCart = By.xpath("//*[@data-testid=\"empty-cart\"]");
    private final By productQuantityInput = By.xpath("//*[@formcontrolname=\"quantity\"]");
    private final By productQuantityError = By.xpath("//*[@class=\"form__hint form__hint_type_attention\"]");


    public SneakerProductPage changeSizeTo38() {
        driver.findElement(size38Button).click();
        return this;
    }

    public SneakerProductPage BuySneakers() {
        driver.findElement(buyButton).click();
        return this;
    }

    public SneakerProductPage productSizeIsVisible() {
        final WebElement productSizeElement = driver.findElement(productSize);
        waitElementIsVisible(productSizeElement);
        assertTrue(productSizeElement.isDisplayed(), "Correct product size is not displayed");
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
    public SneakerProductPage openCart() {
        final WebElement cartElement = driver.findElement(cart);
        waitElementIsVisible(cartElement);
        driver.findElement(cart).click();
        return this;
    }
    public SneakerProductPage increaseProductQuantity () {
        final WebElement cartIncrementElement = driver.findElement(cartIncrement);
        waitElementIsVisible(cartIncrementElement);
        driver.findElement(cartIncrement).click();
        return this;
    }
    public SneakerProductPage verifyCartIncreasedQuantity() {
        final WebElement cartGoodsQuantityIncreasedElement = driver.findElement(cartGoodsQuantityIncreased);
        waitElementIsVisible(cartGoodsQuantityIncreasedElement);
        assertTrue(cartGoodsQuantityIncreasedElement.isDisplayed(), "Product quantity wasn't increased");
        return  this;
    }
    public SneakerProductPage deleteProduct () {
        final WebElement cartDecrementElement = driver.findElement(cartOptions);
        waitElementIsVisible(cartDecrementElement);
        driver.findElement(cartOptions).click();
        final WebElement productDeleteElement = driver.findElement(productDelete);
        waitElementIsVisible(productDeleteElement);
        driver.findElement(productDelete).click();
        return this;
    }
    public SneakerProductPage verifyCartIsEmpty () {
        final WebElement emptyCartElement = driver.findElement(emptyCart);
        waitElementIsVisible(emptyCartElement);
        assertTrue(emptyCartElement.isDisplayed(), "Cart is not empty");
        return this;
    }
    public SneakerProductPage inputProductQuantity () {
        final WebElement productQuantityInputElement = driver.findElement(productQuantityInput);
        waitElementIsVisible(productQuantityInputElement);
        driver.findElement(productQuantityInput).sendKeys("1500");
        return this;
    }
    public SneakerProductPage checkProductQuantityError () {
        final WebElement productQuantityErrorElement = driver.findElement(productQuantityError);
        waitElementIsVisible(productQuantityErrorElement);
        assertTrue(productQuantityErrorElement.isDisplayed(), "Error is not displayed");
        return this;
    }
}