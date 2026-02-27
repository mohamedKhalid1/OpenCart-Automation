package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//input[@value='Login']");
    By logoutBtn = By.linkText("Logout");
    By myAccountIcon = By.xpath("//a[@title='My Account']");
    By loginText = By.linkText("Login");

    public void openLoginPage() {
        driver.findElement(myAccountIcon).click();
        driver.findElement(loginText).click();
    }

    public void loginToMyAccount(String mail, String pass) {
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
        Assert.assertTrue(driver.findElement(logoutBtn).isDisplayed(), "Login Failed");
    }
}