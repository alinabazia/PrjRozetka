package Project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class CategoryComputers extends BasePage {
    public CategoryComputers(WebDriver driver) {
        super(driver);
    }
    private final By categoryNotebooksTitleBox = By.cssSelector("body > app-root > div > div > rz-super-portal > div > main > section > div:nth-child(2) > h1");
    public CategoryComputers categoryComputersTitleBoxVisible() {
        final WebElement categoryComputersTitleBoxElement = driver.findElement(categoryNotebooksTitleBox);
        waitElementIsVisible(categoryComputersTitleBoxElement);
        assertTrue(categoryComputersTitleBoxElement.isDisplayed(), "Category is not displayed");
        return this;
    }
}
