package testPom;

import base.BaseClass;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.SmallBusiness;

public class TestSmallBusiness extends BaseClass {

    public SmallBusiness smallBusiness = new SmallBusiness();

    @Test (description = "TC001",enabled = false)
    public void smallBussinessPage(){
        smallBusiness = new SmallBusiness();
        smallBusiness.smallBussinessPage();
    }
    @Test(description = "TC002", enabled = false)
    public void loginAsASmallBusinessUser(){
        smallBusiness = new SmallBusiness();
        smallBusiness.loginAsASmallBusinessUser("Asjad","asjad123");
    }
    @Test(description = "TC003", enabled = false)
    public void loginAsASmallBusinessWithNoData(){
        smallBusiness = new SmallBusiness();
        smallBusiness.loginAsASmallBusinessWithNoData(" "," ");
    }
    @Test (description = "TC004", enabled = false)
    public void loginAsASmallBusinessWithInavlidData(){
        smallBusiness = new SmallBusiness();
        smallBusiness.loginAsASmallBusinessWithInavlidData("invalid data", "invalid data");
    }
    @Test(description = "TC005", enabled = false)
    public void loginAsASmallBusinessAndSaveUserInfo(){
        smallBusiness = new SmallBusiness();
        smallBusiness.loginAsASmallBusinessAndSaveUserInfo("asjad", "asjad123");
    }
    @Test (description = "TC006", enabled = false)
    public void forgotUserIdAndPassword(){
        smallBusiness = new SmallBusiness();
        smallBusiness.forgotUserIdAndPassword("123456","62145678");
        String actualText = smallBusiness.forgotIdAndPasswordPageTitle.getText();
        String expectedText = "Forgot ID/Passcode";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC007", enabled = false)
    public void resetUserAccountWithNoSsnOrTin(){
        smallBusiness = new SmallBusiness();
        smallBusiness.resetUserAccountWithNoSsnOrTin();
        String actualText = smallBusiness.noSsnOrTinPageTitle.getText();
        String expectedText = "No SSN or TIN";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC008", enabled = false)
    public void securityAndHelp(){
        smallBusiness = new SmallBusiness();
        smallBusiness.securityAndHelp();
    }
    @Test(description = "TC009", enabled = false)
    public void findStoreNearByNoFilter(){
        smallBusiness =new SmallBusiness();
        smallBusiness.findStoreNearByNoFilter("11555");
    }
    @Test(description = "TC010",enabled = false)
    public void findStoreNearByUsingFilter(){
        smallBusiness = new SmallBusiness();
        smallBusiness.findStoreNearByFilterPage();
        String actualText = smallBusiness.findStoreNearbyFilterPageTitle.getText();
        String expectedText = "Filter Results";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC011", enabled = true)
    public void findStoreNearByUsingFilters(){
        smallBusiness = new SmallBusiness();
        smallBusiness.findStoreNearByUsingFilters("11554");
    }
}
