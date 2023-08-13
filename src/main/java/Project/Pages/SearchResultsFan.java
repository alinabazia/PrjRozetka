package Project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertTrue;

public class SearchResultsFan extends BasePage {

    public SearchResultsFan(WebDriver driver) {
        super(driver);
    }
    private final By resultName = By.xpath("//rz-search-heading/div/h2/span[contains(text(), 'вентилятор')]");

    public SearchResultsFan correctLayoutSearchResult() {
        final WebElement resultNameElement = driver.findElement(resultName);
        waitElementIsVisible(resultNameElement);
        assertTrue(resultNameElement.isDisplayed(), "Search didn't change the layout");
        return this;
    }
}
