package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class CartPageTests extends BaseTest {
    @Test
    public void AddToCartTC() {
        CartPage cartPage = new CartPage(driver);
        cartPage.addToCart();
        Assert.assertTrue(cartPage.isProductAdded(), "ADD To Cart Failed");
    }


    @Test
    public void removeProductFromCartTC() {
        CartPage cartPage = new CartPage(driver);
        cartPage.removeProductFromCart();
        Assert.assertTrue(cartPage.isProductRemoved(), "Remove Product From Cart Is Failed");
    }
}
