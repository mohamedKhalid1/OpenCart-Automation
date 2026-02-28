package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new EdgeDriver();
        driver.get("http://tutorialsninja.com/demo/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
