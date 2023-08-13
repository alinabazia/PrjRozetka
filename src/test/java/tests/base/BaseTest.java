package tests.base;

import Project.Pages.*;
import Project.common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected CategoryComputers categoryComputers = new CategoryComputers(driver);
    protected SneakerProductPage sneakerProductPage = new SneakerProductPage(driver);
    protected SearchResultsFan searchResultsFan = new SearchResultsFan(driver);

    // @AfterSuite (alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
