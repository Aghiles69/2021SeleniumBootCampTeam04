package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.Deals;

public class TestDeals extends BaseClass {

    Deals deals;

    @Test(description = "TC001", enabled = false)
    public void dealsPage()throws Exception{
//        Deals = getDeals();
        deals.dealsPage();
    }

    @Test(description = "TC002", enabled = false)
    public void exploreWirelessPage(){
        deals.exploreWirelessPage();
        String actualText = deals.textDecorationOnWirelessShopNowPage.getText();
        String expectedText = "AT&T Authorized Retailer";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC002", enabled = true)
    public void exploreInternetAndTv(){
        deals.exploreInternetAndTv();
        String actualText = deals.headingInternetAndTvPage.getText();
        String expectedText = "Everyone gets our best internet and TV deals online";
    }
    @Test (description = "TC001", enabled = false)
    public void exploreAccessoriePage(){
        deals.exploreAccessoriePage();
    }




}