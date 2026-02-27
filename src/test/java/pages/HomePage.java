package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By myAccountIcon = By.xpath("//a[@title='My Account']");
    By loginText = By.linkText("Login");

    public void openLoginPage() {
        driver.findElement(myAccountIcon).click();
        driver.findElement(loginText).click();
    }


}
