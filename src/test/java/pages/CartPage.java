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
    By shoppingCartBTN = By.xpath("//a[@title='Shopping Cart']");
    By removeProductFromCartBTN = By.xpath("//button[@data-original-title='Remove']");
    By cartTotal = By.id("cart-total");
    By emptyCartMessage = By.xpath("//p[contains(text(),'shopping cart is empty')]");

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

    public void removeProductFromCart() {
        driver.findElement(addToCartBtn).click();
        driver.findElement(shoppingCartBTN).click();
        driver.findElement(removeProductFromCartBTN).click();
    }

    public boolean isProductRemoved() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return !driver.findElements(emptyCartMessage).isEmpty();
    }
}
