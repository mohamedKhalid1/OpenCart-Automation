package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBtn = By.xpath("//button[@onclick=\"cart.add('40');\"]");
    By cartTotal = By.id("cart-total");

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public boolean isProductAdded() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                cartTotal, "1 item"));

        return driver.findElement(cartTotal)
                .getText()
                .contains("1 item");
    }

}
