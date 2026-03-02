package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutPageTests extends BaseTest {
    @Test
    public void OutOfStockTC() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.OutOfStock();
        Assert.assertTrue(checkoutPage.IsOutOfStock(), "Product Is Available");
    }
}
