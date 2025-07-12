package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest {

    @Test   
        public void testLogoutFunctionality() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();

        boolean isOnLoginPage = logoutPage.isBackOnLoginPage();
        System.out.println("Login page visible after logout? → " + isOnLoginPage);

        Assert.assertTrue(isOnLoginPage, "User is not redirected to login page after logout.");
    }


}
