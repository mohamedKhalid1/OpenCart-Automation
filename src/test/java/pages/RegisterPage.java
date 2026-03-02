package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By myAccountIcon = By.xpath("//a[@title='My Account']");
    By registerText = By.linkText("Register");
    By firstname = By.name("firstname");
    By lastname = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.name("confirm");
    By privacyPolicyCheckbox = By.name("agree");
    By continueBTN = By.xpath("//input[@value='Continue']");
    By logoutBtn = By.cssSelector(".list-group-item[href*='route=account/logout");


    public void openRegisterPage() {
        driver.findElement(myAccountIcon).click();
        driver.findElement(registerText).click();
    }

    public void RegisterToMyAccount(String fName, String lName, String mail, String phone, String pass, String confirmPass) {
        driver.findElement(firstname).sendKeys(fName);
        driver.findElement(lastname).sendKeys(lName);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(telephone).sendKeys(phone);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
        driver.findElement(privacyPolicyCheckbox).click();
        driver.findElement(continueBTN).click();
    }

    public boolean RegisterIsSuccess() {
        return !driver.findElements(logoutBtn).isEmpty();
    }

    public String generateRandomEmail() {
        return "mohamed" + System.currentTimeMillis() + "@gmail.com";
    }
}
