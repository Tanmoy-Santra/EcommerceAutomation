package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login should be successful");
    }

    @Test(priority = 2)
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "wrong_pass");
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message should be displayed");
    }
}
