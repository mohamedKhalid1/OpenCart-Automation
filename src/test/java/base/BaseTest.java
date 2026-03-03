package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
