package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddAndRemoveProduct() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Add to cart
        CartPage cartPage = new CartPage(driver);
        cartPage.addProductToCart();

        // Step 3: Verify cart count is 1
        int countAfterAdd = cartPage.getCartCount();
        Assert.assertEquals(countAfterAdd, 1, "Cart count should be 1 after adding item.");

        // Step 4: Remove item
        cartPage.removeProductFromCart();

        // Step 5: Verify cart count is 0
        int countAfterRemove = cartPage.getCartCount();
        Assert.assertEquals(countAfterRemove, 0, "Cart count should be 0 after removing item.");
    }
}
