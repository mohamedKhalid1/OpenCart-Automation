package base;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://tutorialsninja.com/demo/");
    }

    public void tearDown() {
        driver.quit();
    }
}
