package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMsg = By.cssSelector("[data-test='error']");
    private By inventoryPage = By.className("inventory_list");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        return driver.findElements(inventoryPage).size() > 0;
    }

    public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size() > 0;
    }
}
