package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn-default");

    public void searchProduct(String searchProduct) {
        driver.findElement(searchBox).sendKeys(searchProduct);
        driver.findElement(searchButton).click();
    }

    public boolean isProductDisplayed() {
        try {
            WebElement product = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
            return product.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
