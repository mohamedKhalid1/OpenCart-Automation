package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterPageTests extends BaseTest {
    @Test
    public void RegisterWithValidCredentials() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.openRegisterPage();
        registerPage.RegisterToMyAccount("Mohamed", "Khalid", registerPage.generateRandomEmail(), "01234567891", "12345678", "12345678");
        Assert.assertTrue(registerPage.RegisterIsSuccess(), "Register is fail");
    }

    @Test
    public void RegisterWithAlreadyRegisteredEmail() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.openRegisterPage();
        registerPage.RegisterToMyAccount("Mohamed", "Khalid", "mohamedbenkhalid2066@gmail.com", "01234567891", "12345678", "12345678");
        Assert.assertFalse(registerPage.RegisterIsSuccess(), "Successful Register with already registered email");
    }

}
