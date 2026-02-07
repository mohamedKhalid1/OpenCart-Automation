package org.example;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends BaseTest {
    static void main() {
        WebDriver driver;
        driver = DriverFactory.getDriver();
        driver.get("http://tutorialsninja.com/demo/");
        //HomePage homePage = new HomePage(driver);
        //homePage.searchProduct("Mac Book");
//        CartPage cartPage=new CartPage(driver);
//        cartPage.addToCart();
//        System.out.println(cartPage.isProductAdded());
        LoginPage loginPage=new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToMyAccount("mohamedbenkhalid2064@gmail.com","12345678");

    }
}

