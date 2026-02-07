package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//input[@type='submit' and @value='Login']");
    By myAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
    By loginLink = By.linkText("Login");

    public void openLoginPage() {
        driver.findElement(myAccount).click();
        driver.findElement(loginLink).click();
    }

    public void loginToMyAccount(String mail, String pass) {
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    By logoutLink = By.linkText("Logout");

    public boolean isLoginSuccessful() {
        try {
            return driver.findElement(logoutLink).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
