package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
    @Test
    public void OutOfStockScenario(){
        CheckoutPage checkoutPage=new CheckoutPage(driver);
        checkoutPage.OutOfStock();
        Assert.assertTrue(checkoutPage.IsOutOfStock(),"Product Is Available");
    }
}
