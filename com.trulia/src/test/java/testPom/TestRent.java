package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.Rent;

public class TestRent extends BaseClass {
    public Rent rent = new Rent();

    @Test(description = "TC001", enabled = false)
    public void rentPage() {
        rent = new Rent();
        rent.rentPage();
    }
    @Test(description = "TC002", enabled = false)
    public void rentSearchBoxValidData(){
        rent = new Rent();
        rent.rentSearchBoxValidData("New York,NY");
        String actualText = rent.rentSearchTitle.getText();
        String expectedText = "Apartments For Rent in New York, NY";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC003", enabled = false)
    public void rentSearchBoxInvalidData(){
        rent = new Rent();
        rent.rentSearchBoxInvalidData("abc");
        String actualText = rent.rentSearchErrorHeading.getText();
        String expectedText = "Our servers had an issue with your request.";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC004", enabled = false)
    public void rentSearchBoxWithCity(){
        rent = new Rent();
        rent.rentSearchBoxWithCity("Fresh Meadows");
        String actualText = rent.rentSearchTitle.getText();
        String expectedText = "Apartments For Rent in Fresh Meadows, New York";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC005", enabled = false)
    public void rentSearchBoxWithCountry(){
        rent = new Rent();
        rent.rentSearchBoxWithCountry("Canada");
        String actualText = rent.rentSearchTitle.getText();
        String expectedText = "Canada, KY Homes For Sale & Real Estate";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC006", enabled = true)
    public void doSomethingIframeWindow(){
        rent = new Rent();
        rent.doSomethingIframeWindow();
    }


}
