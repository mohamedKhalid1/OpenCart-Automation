package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void AddToCartScenario(){
        CartPage cartPage=new CartPage(driver);
        cartPage.addToCart();
        Assert.assertTrue(cartPage.isProductAdded(),"ADD To Cart Failed");
    }
}
