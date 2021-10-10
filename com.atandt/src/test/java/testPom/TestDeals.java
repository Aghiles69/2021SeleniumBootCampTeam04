package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.Deals;

public class TestDeals extends BaseClass {

    public Deals deals = new Deals();

    @Test(description = "TC001", enabled = false)
    public void dealsPage()throws Exception{
        Deals deals = new Deals();
        deals.dealsPage();
    }

    @Test(description = "TC002", enabled = false)
    public void exploreWirelessPage(){
        Deals deals = new Deals();
        deals.exploreWirelessPage();
        String actualText = deals.textDecorationOnWirelessShopNowPage.getText();
        String expectedText = "AT&T Authorized Retailer";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC003", enabled = true)
    public void exploreInternetAndTv(){
        Deals deals = new Deals();
        deals.exploreInternetAndTv();
        String actualText = deals.headingInternetAndTvPage.getText();
        String expectedText = "Everyone gets our best internet and TV deals online";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test (description = "TC004", enabled = false)
    public void exploreAccessoriePage(){
        Deals deals = new Deals();
        deals.exploreAccessoriePage("iphone");
        String actualText = deals.accessoriesPageHeader.getText();
        String expectedText = "Get accessories & gifts";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test (description = "TC005", enabled = false)
    public void searchAccessoriesWithFilterON(){
        Deals deals = new Deals();
        deals.searchAccessoriesWithFilterON();
    }
    @Test (description = "TC006", enabled = false)
    public void exploreShopNowOnDealPage(){
        Deals deals = new Deals();
        deals.exploreShopNowOnDealPage();
    }
    @Test(description = "TC007", enabled = false)
    public void exploreCheckAvailabilityPage(){
        Deals deals = new Deals();
        deals.exploreCheckAvailabilityPage();
    }
    @Test(description = "TC008",enabled = false)
    public void exploreShopAllDealPage(){
        Deals deals = new Deals();
        deals.exploreShopAllDealPage();
    }
}