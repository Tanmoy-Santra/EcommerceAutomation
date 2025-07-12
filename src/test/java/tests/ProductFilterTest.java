package tests;

import base.BaseTest;

import org.testng.Assert;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;

public class ProductFilterTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyProductSortingLowToHigh() {
		//login first
		LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        
        //then filter and validate
        
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.selectFilter("Price (low to high)");

        Assert.assertTrue(productsPage.isSortedLowToHigh(), "Products are not sorted low to high!");
	}
	
	@Test(priority=2)
	public void verifyProductSortingHighToLow() {
		//login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        //filter and validate
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.selectFilter("Price (high to low)");

        Assert.assertTrue(productsPage.isSortedHighToLow(), "Products are not sorted high to low!");
    }
	
}