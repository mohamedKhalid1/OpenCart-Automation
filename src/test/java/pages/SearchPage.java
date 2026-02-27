package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    By searchFailed=By.name("search");
    By searchBtn=By.className("input-group-btn");
    By productResults = By.cssSelector(".product-layout");

    public void searchWithResults(String searchText){
        driver.findElement(searchFailed).sendKeys(searchText);
        driver.findElement(searchBtn).click();
    }
    public boolean isProductFound(){
        List<WebElement> products=driver.findElements(productResults);
        return !products.isEmpty();
    }

    public boolean isNoProductFound(){
        List<WebElement> products=driver.findElements(productResults);
        return products.isEmpty();
    }

}
