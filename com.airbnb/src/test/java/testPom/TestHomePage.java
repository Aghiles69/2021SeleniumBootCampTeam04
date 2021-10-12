package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.HomePage;

public class TestHomePage extends BaseClass {
    public HomePage homePage = new HomePage();

    @Test(description = "TC001",enabled = true)
    public void doSearchWithOnlyLocation(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyLocation("bali");
        String actualText = homePage.searchResultsPage.getText();
        String expectedText = "Stays in Bali";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC002",enabled = true)
    public void doSearchWithInvalidLocation(){
        homePage = new HomePage();
        homePage.doSearchWithInvalidLocation("123");
        String actualText = homePage.searchResultsPage.getText();
        String expectedText = "Stays in Bali";
        Assert.assertEquals(actualText,expectedText);
    }

}
