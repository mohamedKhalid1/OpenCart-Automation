package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBtn = By.xpath("//button[@onclick=\"cart.add('40');\"]");
    By shoppingCartBTN=By.xpath("//a[@title='Shopping Cart']");
    By checkoutBTN=By.cssSelector("a.btn-primary");
    By outOfStockMsg=By.cssSelector(".alert-danger");
    public void OutOfStock(){
        driver.findElement(addToCartBtn).click();
        driver.findElement(shoppingCartBTN).click();
        driver.findElement(checkoutBTN).click();
    }

    public boolean IsOutOfStock(){
        return driver.findElement(outOfStockMsg).isDisplayed();
    }
}
