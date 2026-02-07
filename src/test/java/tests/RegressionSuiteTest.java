package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class RegressionSuiteTest extends BaseTest {
    @Test
    public void addToCartScenario() {
        setUp();
        CartPage cartPage = new CartPage(driver);
        cartPage.addToCart();
        Assert.assertTrue(cartPage.isProductAdded());
    }

    @Test
    public void loginToMyAccountScenario() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToMyAccount("mohamedbenkhalid2066@gmail.com", "12345678");
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @Test
    public void searchProductScenario() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Mac Book");
        Assert.assertTrue(homePage.isProductDisplayed());
    }

}
