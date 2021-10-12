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
    @Test(description = "TC003",enabled = true)
    public void doSearchWithCheckInDate(){
        homePage = new HomePage();
        homePage.doSearchWithCheckInDate("1");
    }
    @Test(description = "TC004",enabled = true)
    public void doSearchWithCheckOutdate(){
        homePage = new HomePage();
        homePage.doSearchWithCheckOutdate("1");
    }
    @Test(description = "TC005",enabled = true)
    public void doSearchWithCheckinAndOut(){
        homePage = new HomePage();
        homePage.doSearchWithCheckinAndOut("1");
    }
    @Test(description = "TC006",enabled = true)
    public void doSearchWithOnlyAddingAdults(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyAddingAdults();
    }
    @Test(description = "TC007",enabled = true)
    public void doSearchWithOnlyRemovingAdults(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyRemovingAdults();
    }
    @Test(description = "TC008",enabled = true)
    public void doSearchWithOnlyAddingChildren(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyAddingChildren();
    }
    @Test(description = "TC009",enabled = true)
    public void doSearchWithOnlyRemovingChildren(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyRemovingChildren();
    }
    @Test(description = "TC010",enabled = true)
    public void doSearchWithOnlyAddingInfants(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyAddingInfants();
    }
    @Test(description = "TC011",enabled = true)
    public void doSearchWithOnlyRemovingInfants(){
        homePage = new HomePage();
        homePage.doSearchWithOnlyRemovingInfants();
    }
}
