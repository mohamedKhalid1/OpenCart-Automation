package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    @Test
    public void OpenLoginPageScenario(){
        HomePage homePage=new HomePage(driver);
        homePage.openLoginPage();
    }
}
