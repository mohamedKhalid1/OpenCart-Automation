package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTests extends BaseTest {


    @Test
    public void loginWithCorrectCredentialsTC() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToMyAccount("mohamedbenkhalid2066@gmail.com", "12345678");
        Assert.assertTrue(loginPage.loginIsSuccess(), "Login Is Fail");
    }

    @Test
    public void loginًWithWrongEmailTC() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToMyAccount("inValidEmail@gmail.com", "12345678");
        Assert.assertFalse(loginPage.loginIsSuccess(), "Successful Login with Wrong Email");
    }

    @Test
    public void loginًWithWrongPasswordTC() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToMyAccount("mohamedbenkhalid2066@gmail.com", "inValidPassword");
        Assert.assertFalse(loginPage.loginIsSuccess(), "Successful Login with Wrong Password");
    }

}